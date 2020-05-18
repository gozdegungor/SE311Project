import Observer.AuthSubject;

public class Main {
    private static OS os;
    private static AuthSubject authSubject;
    public static void main(String[] args) {
        os = OS.getInstance();
        authSubject = AuthSubject.getInstance();
        authSubject.Attach(os);

        String username = os.getUsername();
        String password = os.getPassword();
        os.authenticate(username, password, null);
    }
}
