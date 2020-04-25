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

    public String getUsername(){
        System.out.println("Please enter a username");
        return this.scan.next();
    }

    public String getPassword(){
        System.out.println("Please enter a password");
        return this.scan.next();
    }

    public int authenticate(String username, String password/*, AuthAdapter adapter*/) {
        // TODO Implement
        this.username = username;
        this.password = password;

        // Alwasy start from LOCAL
//        if(adapter == null){
//            adapter = new LOCALAdapter();
//        }
//        adapter.authenticate(this.username, this.password);
        return 0;
    }

    public void setuid(int uid) {
        if(this.session == null){
            System.out.println("SessionFactory.SessionFactory.Session does not exist");
            return;
        }
        this.session.setUid(uid);
    }

    // Create a new session
    public void createSession() {
        System.out.println("Enter a session type (GUISession or TerminalSession):");

        String choice = this.scan.next();
        this.session = this.sessionFactory.sessionCreate(choice);

        this.setuid(this.authUser.getUid());

        if (this.session != null) {
            System.out.println(this.session.getSessionType() + " started with uid :  " + this.session.getUid());
        } else {
            System.out.println("SessionFactory.SessionFactory.Session can not be created");
        }
    }

    @Override
    public void Update(AuthSubject authSubject) {
        System.out.println(authSubject.getStateMessage());
        switch (authSubject.getStateMessage()) {
            case "LOCAL auth fail":
                // TODO try LOCAL Check
//                this.authenticate(this.username, this.password, new LOCALAdapter());
                break;
            case "LDAP auth fail":
                // TODO try LDAP Check
//                this.authenticate(this.username, this.password, new LDAPAdapter());
                break;
            case "KERBEROS auth fail":
                // TODO try KERBEROS Check
//                this.authenticate(this.username, this.password, new KERBEROSAdapter());
                break;
            case "Auth Success":
                // Auth done create session of choice now
                this.authUser = authSubject.getStateUser();
                this.createSession();
                break;
            default:
                System.out.println("Unknown state message");
        }
    }
}
