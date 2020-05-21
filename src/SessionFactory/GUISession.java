// Yiğit Ege Miman - 20160602022
// Gözde Güngör - 20160601023
// Cem Özcan - 20170601024
// A Pluggable Authentication Mechanism

package SessionFactory;

//Concerete product class
public class GUISession extends Session {
    public String getSessionType() {
        return "GUI Session";
    }
}
