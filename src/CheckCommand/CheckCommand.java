// Yiğit Ege Miman - 20160602022
// Gözde Güngör - 20160601023
// Cem Özcan - 20170601024
// A Pluggable Authentication Mechanism

package CheckCommand;

import Colors.ConsoleColors;
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
        System.out.println("Checking user for username: " + ConsoleColors.BLUE +  username + ConsoleColors.RESET + ", password: " + ConsoleColors.BLUE + password + ConsoleColors.RESET + ", mechanism: " + ConsoleColors.BLUE + mechanism  + ConsoleColors.RESET);
    }

    //primitive operation to be overridden
    protected abstract String getMechanism();

    private String username;
    private String password;
    private Database db;
}
