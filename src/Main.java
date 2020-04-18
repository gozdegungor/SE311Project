public class Main {
    public static void main(String[] args) {
        OS os = OS.getInstance();

        String username = os.getUsername();
        String password = os.getPassword();

        os.authenticate(username, password);
    }
}
