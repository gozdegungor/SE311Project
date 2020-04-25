package Iterator;

import Database.User;

import java.util.ArrayList;

public class IteratorUser {
    public AbstractIterator createIterator(ArrayList<User> arr) {
        return new UserIterator(arr);
    }
}





