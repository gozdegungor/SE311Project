package AuthMechanism;

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

    public void ldap_authanticate(String username, String pwd) {
        // TODO Create new LDAPCheckCommand and assign it to command variable
        // this.command = new LDAPCheckCommand(String username, String pwd);

        doCheck();
    }
}
