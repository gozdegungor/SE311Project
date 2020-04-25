package CheckCommand;

public class KerberosCheckCommand extends CheckCommand{
    public KerberosCheckCommand(String username, String password){
        super(username, password);
    }
    //override getMechanism()
    protected String getMechanism() {
        return "KERBEROS";
    }
}
