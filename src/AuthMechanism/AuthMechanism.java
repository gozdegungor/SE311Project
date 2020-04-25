package AuthMechanism;

import CheckCommand.CheckCommand;

public abstract class AuthMechanism {
    protected CheckCommand command;

    protected void doCheck() {
        this.command.Execute();
    }
}
