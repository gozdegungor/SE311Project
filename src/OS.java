import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class OS {
    private static OS instance = null;

    private Scanner scan = null;
    // Create a new session
    public void getSession(){
        System.out.println("Enter a session type (GUISession or TerminalSession) :   ");
        String choice=scan.next();
        SessionFactory sessionFactory=new SessionFactory();
        Session session=sessionFactory.sessionCreate(choice);
        System.out.println(session.getSessionType()+" started with uid :  "+session.getUid());

    }


    public static OS getInstance(){
        if(instance == null){
            instance = new OS();
        }
        return instance;
    }

    private OS(){
        this.scan = new Scanner(System.in);
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

    public void setuid(int uid){
        // TODO Integrate with the real session object
//        this.session.setuid(uid);
    }

    public int getuid(String username){
        // TODO Implement
        return 0;
    }
}
