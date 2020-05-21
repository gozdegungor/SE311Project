// Yiğit Ege Miman - 20160602022
// Gözde Güngör - 20160601023
// Cem Özcan - 20170601024
// A Pluggable Authentication Mechanism

package AuthAdapter;

import AuthMechanism.KERBEROS;

public class KERBEROSAdapter implements AuthAdapter {
    private KERBEROS kerberos;

    public KERBEROSAdapter() {
        kerberos = KERBEROS.getInstance();
    }

    public void authenticate(String name, String pwd) {
        kerberos.krb_authanticate(name, pwd);
    }
}
