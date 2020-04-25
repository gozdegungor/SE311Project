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
