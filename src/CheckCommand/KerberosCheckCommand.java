package CheckCommand;

public class KerberosCheckCommand extends CheckCommand{
    //override getMechanism()
    protected String getMechanism() {
        return "Kerberos Authentication Mechanism";
    }
}
