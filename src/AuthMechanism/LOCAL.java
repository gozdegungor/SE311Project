package AuthMechanism;

import CheckCommand.LocalCheckCommand;

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

    public void local_authanticate(String username, String password) {
        this.command = new LocalCheckCommand(username, password);
        doCheck();
    }
}
