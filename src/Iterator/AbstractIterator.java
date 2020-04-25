package Iterator;

import Database.User;

public interface AbstractIterator {
    void First();

    void Next();

    Boolean IsDone();

    User CurrentItem();
}
