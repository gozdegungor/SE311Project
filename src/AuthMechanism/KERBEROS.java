// Yiğit Ege Miman - 20160602022
// Gözde Güngör - 20160601023
// Cem Özcan - 20170601024
// A Pluggable Authentication Mechanism

package AuthMechanism;

import CheckCommand.KerberosCheckCommand;

public class KERBEROS extends AuthMechanism {
    private static KERBEROS instance = null;

    public static KERBEROS getInstance() {
        if (instance == null) {
            instance = new KERBEROS();
        }
        return instance;
    }

    private KERBEROS() {
    }

    public void krb_authanticate(String username, String password) {
         this.command = new KerberosCheckCommand(username,password);
        doCheck();
    }
}
