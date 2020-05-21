// Yiğit Ege Miman - 20160602022
// Gözde Güngör - 20160601023
// Cem Özcan - 20170601024
// A Pluggable Authentication Mechanism

package AuthMechanism;

import CheckCommand.CheckCommand;

public abstract class AuthMechanism {
    protected CheckCommand command;

    protected void doCheck() {
        this.command.Execute();
    }
}
