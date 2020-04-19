import java.util.Scanner;

public class OS {
    private static OS instance = null;

    private Scanner scan = null;
    private Session session = null;
    private SessionFactory sessionFactory = null;

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

    public int authenticate(String username, String pwd){
        // TODO Implement
        return 0;
    }

    public void setuid(int uid) {
        if(this.session == null){
            System.out.println("Session does not exist");
            return;
        }
        this.session.setUid(uid);
    }

    public int getuid(String username) {
        // TODO Implement
        return 0;
    }

    // Create a new session
    public void createSession() {
        System.out.println("Enter a session type (GUISession or TerminalSession):");

        String choice = this.scan.next();
        this.session = this.sessionFactory.sessionCreate(choice);

        if (this.session != null) {
            System.out.println(this.session.getSessionType() + " started with uid :  " + this.session.getUid());
        } else {
            System.out.println("Session can not be created");
        }
    }
}
