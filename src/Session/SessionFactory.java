package Session;

public class SessionFactory{
    //Get users session choice and creates a session
    public Session sessionCreate(String userSessionChoice){
       if(userSessionChoice.equals("Session.GUISession")){
          return new GUISession();
       }else if(userSessionChoice.equals("TerminalSession")){
           return new TerminalSession();
       }else{
           System.out.println("Invalid session type!");
       }
       return null;
    }
}
