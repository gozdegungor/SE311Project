package Observer;

import Database.User;

import java.util.ArrayList;

public class AuthSubject {
    private static AuthSubject instance = null;

    private ArrayList<Observer> obs;
    private String stateMessage = null;
    private User stateUser = null;

    public static AuthSubject getInstance() {
        if (instance == null) {
            instance = new AuthSubject();
        }
        return instance;
    }

    private AuthSubject() {
        this.obs = new ArrayList<>();
    }

    public void Attach(Observer ob) {
        this.obs.add(ob);
    }

    private void Notify() {
        for (Observer ob : this.obs) {
            ob.Update(this);
        }
    }

    public String getStateMessage() {
        return stateMessage;
    }

    public User getStateUser() {
        return stateUser;
    }

    public void setStates(String stateMessage, User stateUser){
        this.stateMessage = stateMessage;
        this.stateUser = stateUser;

        this.Notify();
    }
}
