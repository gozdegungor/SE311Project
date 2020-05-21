// Yiğit Ege Miman - 20160602022
// Gözde Güngör - 20160601023
// Cem Özcan - 20170601024
// A Pluggable Authentication Mechanism

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
