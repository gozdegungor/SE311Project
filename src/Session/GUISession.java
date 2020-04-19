package Session;

//Concerete product class
public class GUISession extends Session {
    public void setUid(int Uid) {
        this.Uid = Uid;
    }

    public String getSessionType() {
        return "GUI Session";
    }
}