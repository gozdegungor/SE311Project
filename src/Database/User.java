package Database;

public class User {
    private final int uid;
    private final String username;
    private final String pwd;
    private final String mech;

    public User(int uid, String username, String pwd, String mech) {
        this.uid = uid;
        this.username = username;
        this.pwd = pwd;
        this.mech = mech;
    }

    public int getUid() {
        return this.uid;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPwd() {
        return this.pwd;
    }

    public String getMech() {
        return this.mech;
    }
}
