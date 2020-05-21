// Yiğit Ege Miman - 20160602022
// Gözde Güngör - 20160601023
// Cem Özcan - 20170601024
// A Pluggable Authentication Mechanism

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
