package join.me.joinme.model;

import android.app.Activity;

/**
 * Created by mismayil on 19/09/15.
 */
public class Notification {
    private User sender;
    private User receiver;
    private JoinMeActivity activity;
    private int status;

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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Notification(User sender, User receiver, JoinMeActivity activity, int status) {

        this.sender = sender;
        this.receiver = receiver;
        this.activity = activity;
        this.status = status;
    }
}
