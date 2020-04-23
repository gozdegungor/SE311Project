package AuthMechanism;

public class LOCAL extends AuthMechanism {
    private static LOCAL instance = null;

    public static LOCAL getInstance() {
        if (instance == null) {
            instance = new LOCAL();
        }
        return instance;
    }

    private LOCAL() {
    }

    public void local_authanticate(String username, String pwd) {
        // TODO Create new LocalCheckCommand and assign it to command variable
        // this.command = new LocalCheckCommand(String username, String pwd);

        doCheck();
    }
}
