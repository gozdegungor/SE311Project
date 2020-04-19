import java.util.ArrayList;
//Abstract product class
abstract class Session {
    abstract public int getUid();
    abstract public void setUid();
    abstract public String getSessionType();
}
//Concerete product class
class GUISession extends Session{
    protected int Uid;

    public void setUid() {
        this.Uid=Uid;
    }

    public int getUid() {
        return Uid;
    }

    public String getSessionType(){
        return "GUI Session";
    }
}
//Concrete product class
class TerminalSession extends Session{
    protected int Uid;

    public void setUid() {
        this.Uid=Uid;
    }

    public int getUid() {
        return Uid;
    }

    public String getSessionType(){
        return "Terminal Session";
    }
}
//Abstract creator class
class SessionFactory{
    //Get users session choice and creates a session
    public Session sessionCreate(String userSessionChoice){
       if(userSessionChoice.equals("GUISession")){
          return new GUISession();
       }else if(userSessionChoice.equals("TerminalSession")){
           return new TerminalSession();
       }else{
           System.out.println("Invalid session type!");
       }
       return null;
    }
    private Session session;

}