// Yiğit Ege Miman - 20160602022
// Gözde Güngör - 20160601023
// Cem Özcan - 20170601024
// A Pluggable Authentication Mechanism

import AuthAdapter.*;
import Colors.ConsoleColors;
import Database.User;
import Observer.*;
import SessionFactory.*;

import java.util.Scanner;

public class OS implements Observer {
    private static OS instance = null;

    private Scanner scan = null;
    private Session session = null;
    private SessionFactory sessionFactory = null;
    private User authUser = null;

    private String username = null;
    private String password = null;

    public static OS getInstance() {
        if (instance == null) {
            instance = new OS();
        }
        return instance;
    }

    private OS() {
        this.scan = new Scanner(System.in);
        this.sessionFactory = new SessionFactory();
    }

    public String getUsername() {
        System.out.println("Please enter a username");
        return this.scan.next();
    }

    public String getPassword() {
        System.out.println("Please enter a password");
        return this.scan.next();
    }

    public void authenticate(String username, String password, AuthAdapter adapter) {
        this.username = username;
        this.password = password;

        // Always default from LOCAL
        if (adapter == null) {
            adapter = new LOCALAdapter();
        }
        adapter.authenticate(this.username, this.password);
    }

    public void setuid(int uid) {
        this.session.setUid(uid);
    }

    // Create a new session
    public void createSession() {
        System.out.println("Enter a session type (GUISession or TerminalSession):");

        String choice = this.scan.next();
        this.session = this.sessionFactory.sessionCreate(choice);

        if (this.session != null) {
            this.setuid(this.authUser.getUid());
            System.out.println(ConsoleColors.GREEN_BOLD + this.session.getSessionType() + " started with uid :  " + this.session.getUid() + ConsoleColors.RESET);
        } else {
            System.out.println(ConsoleColors.PURPLE + "Session can not be created" + ConsoleColors.RESET);
        }
    }

    @Override
    public void Update(AuthSubject authSubject) {
        switch (authSubject.getStateMessage()) {
            case "LOCAL auth fail":
                System.out.println(ConsoleColors.RED + authSubject.getStateMessage() + ConsoleColors.RESET);
                // If LOCAL Fail check LDAP
                this.authenticate(this.username, this.password, new LDAPAdapter());
                break;
            case "LDAP auth fail":
                System.out.println(ConsoleColors.RED + authSubject.getStateMessage() + ConsoleColors.RESET);
                // If LDAP Fail check KERBEROS
                this.authenticate(this.username, this.password, new KERBEROSAdapter());
                break;
            case "KERBEROS auth fail":
                System.out.println(ConsoleColors.RED + authSubject.getStateMessage() + ConsoleColors.RESET);
                // If KERBEROS Fail user not found
                System.out.println(ConsoleColors.RED + "USER CAN NOT BE AUTHENTICATED" + ConsoleColors.RESET);
                break;
            case "Auth Success":
                System.out.println(ConsoleColors.GREEN_BOLD + authSubject.getStateMessage() + ConsoleColors.RESET);
                // Auth done create session of choice now
                this.authUser = authSubject.getStateUser();
                this.createSession();
                break;
            default:
                System.out.println(ConsoleColors.PURPLE + "Unknown state message" + ConsoleColors.RESET);
        }
    }
}
