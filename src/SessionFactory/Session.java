// Yiğit Ege Miman - 20160602022
// Gözde Güngör - 20160601023
// Cem Özcan - 20170601024
// A Pluggable Authentication Mechanism

package SessionFactory;

//Abstract product class
public abstract class Session {
    protected int Uid;

    public int getUid() {
        return Uid;
    }

    public void setUid(int Uid) {
        this.Uid = Uid;
    }

    abstract public String getSessionType();
}
