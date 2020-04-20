//Abstract product class
abstract class Session {
    protected int Uid;

    public int getUid() {
        return Uid;
    }

    abstract public void setUid(int Uid);

    abstract public String getSessionType();
}

//Concrete product class
class TerminalSession extends Session {
    public void setUid(int Uid) {
        this.Uid = Uid;
    }

    public String getSessionType() {
        return "Terminal Session";
    }
}


//Concerete product class
class GUISession extends Session {
    public void setUid(int Uid) {
        this.Uid = Uid;
    }

    public String getSessionType() {
        return "GUI Session";
    }
}

public class SessionFactory {
    //Get users session choice and creates a session
    public Session sessionCreate(String userSessionChoice) {
        if (userSessionChoice.equals("GUISession")) {
            return new GUISession();
        } else if (userSessionChoice.equals("TerminalSession")) {
            return new TerminalSession();
        } else {
            System.out.println("Invalid session type!");
        }
        return null;
    }
}
