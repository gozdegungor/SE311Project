package AuthMechanism;

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

    public void krb_authanticate(String username, String pwd) {
        // TODO Create new KERBEROSCheckCommand and assign it to command variable
        // this.command = new KERBEROSCheckCommand(String username, String pwd);

        doCheck();
    }
}
