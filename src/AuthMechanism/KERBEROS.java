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
