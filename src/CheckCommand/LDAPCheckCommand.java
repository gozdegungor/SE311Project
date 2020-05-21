// Yiğit Ege Miman - 20160602022
// Gözde Güngör - 20160601023
// Cem Özcan - 20170601024
// A Pluggable Authentication Mechanism

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
