package CheckCommand;

public class LDAPCheckCommand extends CheckCommand{
    //override getMechanism()
    protected String getMechanism() {
        return "LDAP Authentication Mechanism";
    }
}
