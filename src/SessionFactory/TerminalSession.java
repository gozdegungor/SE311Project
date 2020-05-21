// Yiğit Ege Miman - 20160602022
// Gözde Güngör - 20160601023
// Cem Özcan - 20170601024
// A Pluggable Authentication Mechanism

package SessionFactory;

//Concrete product class
public class TerminalSession extends Session {
    public String getSessionType() {
        return "Terminal Session";
    }
}
