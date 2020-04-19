import Database.Database;

public class Main {
    public static void main(String[] args) {
        OS os = OS.getInstance();
        Database db = Database.getInstance();

        String username = os.getUsername();
        String password = os.getPassword();

        os.authenticate(username, password);

        os.createSession();
    }
}
