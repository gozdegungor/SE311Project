package CheckCommand;

import Database.Database;

public abstract class CheckCommand {
    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    //Template method
    public void Execute(){
        String mechanism=getMechanism();
        checkingUser(mechanism);
        db.checkUser(username,password,mechanism);
    }

    public void checkingUser(String mechanism){
        System.out.println("Checking user for username: " + username + "password: " + password + "mechanism: " +mechanism);
    }

    //primitive operation to be overridden
    protected  abstract String getMechanism();
    protected String username;
    protected String password;
    protected Database db;
}
