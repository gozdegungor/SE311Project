package Database;

import java.util.ArrayList;

public class Database {
    private static Database instance = null;
    private IteratorUser IU = new IteratorUser();
    private ArrayList<User> arUsers;

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    private Database() {
        this.arUsers = new ArrayList<>();

        generateDummyData();
    }

    public void generateDummyData() {
        arUsers.add(new User(0, "gozde", "123", "LOCAL"));
        arUsers.add(new User(1, "yigit", "123", "LDAP"));
        arUsers.add(new User(2, "cem", "123", "KERBEROS"));
    }

    public void print(){
        System.out.println("iterating user database!");
        AbstractIterator aI = IU.createIterator(arUsers);
       for(aI.First(); !aI.IsDone(); aI.Next()){
            User user = aI.CurrentItem();
            System.out.println(user.getUid() + " " + user.getUsername() + " " + user.getPwd() + " " + user.getMech());
        }
        System.out.println();
    }
}
