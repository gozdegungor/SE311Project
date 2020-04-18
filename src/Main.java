public class Main {
    public static void main(String[] args) {
        OS os = OS.getInstance();

        System.out.println("Please enter a username");
        String username = os.getUsername();

        System.out.println("Please enter a password");
        String password = os.getPassword();

        os.authenticate(username, password);
    }
}
