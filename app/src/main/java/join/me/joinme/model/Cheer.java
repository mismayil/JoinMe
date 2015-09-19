package join.me.joinme.model;

import java.util.ArrayList;

/**
 * Created by mismayil on 19/09/15.
 */
public class Cheer {
    private User sender;
    private User receiver;
    private JoinMeActivity activity;

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public JoinMeActivity getActivity() {
        return activity;
    }

    public void setActivity(JoinMeActivity activity) {
        this.activity = activity;
    }

    public Cheer(User sender, User receiver, JoinMeActivity activity) {

        this.sender = sender;
        this.receiver = receiver;
        this.activity = activity;
    }
}
