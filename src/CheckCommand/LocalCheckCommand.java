package CheckCommand;

public class LocalCheckCommand extends CheckCommand {
    public LocalCheckCommand(String username, String password){
        super(username, password);
    }
    //override getMechanism()
    protected String getMechanism() {
        return "LOCAL";
    }
}
