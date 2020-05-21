// Yiğit Ege Miman - 20160602022
// Gözde Güngör - 20160601023
// Cem Özcan - 20170601024
// A Pluggable Authentication Mechanism

package AuthAdapter;

import AuthMechanism.LOCAL;

public class LOCALAdapter implements AuthAdapter {
    private LOCAL local;

    public LOCALAdapter() {
        local = LOCAL.getInstance();
    }

    public void authenticate(String name, String pwd) {
        local.local_authanticate(name, pwd);
    }
}
