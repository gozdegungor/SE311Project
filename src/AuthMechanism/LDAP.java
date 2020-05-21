// Yiğit Ege Miman - 20160602022
// Gözde Güngör - 20160601023
// Cem Özcan - 20170601024
// A Pluggable Authentication Mechanism

package AuthMechanism;

import CheckCommand.LDAPCheckCommand;

public class LDAP extends AuthMechanism {
    private static LDAP instance = null;

    public static LDAP getInstance() {
        if (instance == null) {
            instance = new LDAP();
        }
        return instance;
    }

    private LDAP() {
    }

    public void ldap_authanticate(String username, String password) {
        this.command = new LDAPCheckCommand(username, password);
        doCheck();
    }
}
