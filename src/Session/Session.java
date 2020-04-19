package Session;

//Abstract product class
public abstract class Session {
    protected int Uid;

    public int getUid() {
        return Uid;
    }

    abstract public void setUid(int Uid);

    abstract public String getSessionType();
}