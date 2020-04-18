import java.util.Scanner;

public class OS {
    private static OS instance = null;

    private Scanner scan = null;
    // TODO Create new session and assign here
//    private Session session = null;

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
        return this.scan.next();
    }

    public String getPassword(){
        return this.scan.next();
    }

    public int authenticate(String username, String pwd){
        // TODO implement
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
