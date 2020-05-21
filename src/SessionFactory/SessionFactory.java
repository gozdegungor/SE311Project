// Yiğit Ege Miman - 20160602022
// Gözde Güngör - 20160601023
// Cem Özcan - 20170601024
// A Pluggable Authentication Mechanism

package SessionFactory;

import Colors.ConsoleColors;

public class SessionFactory {
    //Get users session choice and creates a session
    public Session sessionCreate(String userSessionChoice) {
        if (userSessionChoice.equals("GUISession")) {
            return new GUISession();
        } else if (userSessionChoice.equals("TerminalSession")) {
            return new TerminalSession();
        } else {
            System.out.println(ConsoleColors.PURPLE + "Invalid session type!" + ConsoleColors.RESET);
        }
        return null;
    }
}
