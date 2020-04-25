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
