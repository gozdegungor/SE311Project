package AuthAdapter;

import AuthMechanism.LDAP;

public class LDAPAdapter implements AuthAdapter {
    private LDAP ldap;

    public LDAPAdapter() {
        ldap = LDAP.getInstance();
    }

    public void authenticate(String name, String pwd) {
        ldap.ldap_authanticate(name, pwd);
    }
}
