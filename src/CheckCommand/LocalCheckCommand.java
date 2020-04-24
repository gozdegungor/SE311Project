package CheckCommand;

public class LocalCheckCommand extends CheckCommand {
    //override getMechanism()
    protected String getMechanism() {
        return "Local Authentication Mechanism";
    }
}
