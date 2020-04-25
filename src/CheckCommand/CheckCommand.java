package CheckCommand;

import Database.Database;

public abstract class CheckCommand {
    public CheckCommand(String username, String password){
        this.username = username;
        this.password = password;
        this.db = Database.getInstance();
    }

    //Template method
    public void Execute() {
        String mechanism = getMechanism();
        checkingUser(mechanism);
        db.checkUser(username, password, mechanism);
    }

    public void checkingUser(String mechanism) {
        System.out.println("Checking user for username: " + username + ", password: " + password + ", mechanism: " + mechanism);
    }

    //primitive operation to be overridden
    protected abstract String getMechanism();

    protected String username;
    protected String password;
    protected Database db;
}
