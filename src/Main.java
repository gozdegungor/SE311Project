import Observer.AuthSubject;

public class Main {
    public static void main(String[] args) {
        OS os = OS.getInstance();
        AuthSubject authSubject = AuthSubject.getInstance();
        authSubject.Attach(os);

        String username = os.getUsername();
        String password = os.getPassword();
        os.authenticate(username, password, null);
    }
}
