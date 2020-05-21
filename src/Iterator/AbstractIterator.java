// Yiğit Ege Miman - 20160602022
// Gözde Güngör - 20160601023
// Cem Özcan - 20170601024
// A Pluggable Authentication Mechanismw

package Iterator;

import Database.User;

public interface AbstractIterator {
    void First();

    void Next();

    Boolean IsDone();

    User CurrentItem();
}
