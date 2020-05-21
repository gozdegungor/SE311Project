// Yiğit Ege Miman - 20160602022
// Gözde Güngör - 20160601023
// Cem Özcan - 20170601024
// A Pluggable Authentication Mechanism

package Database;

import Iterator.*;
import Observer.AuthSubject;

import java.util.ArrayList;

public class Database {
    private static Database instance = null;
    private final ArrayList<User> arUsers;
    private final AuthSubject authSubject;

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    private Database() {
        this.arUsers = new ArrayList<>();
        this.authSubject = AuthSubject.getInstance();
        generateDummyData();
    }

    private void generateDummyData() {
        arUsers.add(new User(0, "gozde", "123", "LOCAL"));
        arUsers.add(new User(1, "yigit", "123", "LDAP"));
        arUsers.add(new User(2, "cem", "123", "KERBEROS"));
    }

    public void checkUser(String username, String pwd, String mech) {
        User foundUser = null;
        AbstractIterator aI = new UserIterator(arUsers);
        for (aI.First(); !aI.IsDone(); aI.Next()) {
            User user = aI.CurrentItem();
            if (user.getUsername().equals(username) && user.getPwd().equals(pwd) && user.getMech().equals(mech)) {
                foundUser = user;
                break;
            }
        }

        String stateMessage = (foundUser == null) ? mech + " auth fail" : "Auth Success";
        this.authSubject.setStates(stateMessage, foundUser);
    }
}
