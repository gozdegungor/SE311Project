// Yiğit Ege Miman - 20160602022
// Gözde Güngör - 20160601023
// Cem Özcan - 20170601024
// A Pluggable Authentication Mechanism

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
