package Session;

//Concrete product class
public class TerminalSession extends Session {
    public void setUid(int Uid) {
        this.Uid = Uid;
    }

    public String getSessionType() {
        return "Terminal Session";
    }
}
