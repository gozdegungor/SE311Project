package CheckCommand;

public class LDAPCheckCommand extends CheckCommand{
    public LDAPCheckCommand(String username, String password){
        super(username, password);
    }
    //override getMechanism()
    protected String getMechanism() {
        return "LDAP";
    }
}
