package join.me.joinme.model;

import java.util.ArrayList;

/**
 * Created by mismayil on 19/09/15.
 */
public class JoinMeActivity {
    private User owner;
    private String action;
    private String location;
    private ArrayList<User> buddies;
    private ArrayList<User> cheers;

    JoinMeActivity(User owner, String action, String location, ArrayList<User> buddies, ArrayList<User> cheers){
        this.owner = owner;
        this.action = action;
        this.location = location;
        this.buddies = buddies;
        this.cheers = cheers;
    }

    public ArrayList<User> getCheers() {
        return cheers;
    }

    public ArrayList<User> getBuddies() {
        return buddies;
    }

    public String getAction() {
        return action;
    }

    public String getLocation() {
        return location;
    }

    public User getOwner() {
        return owner;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setBuddies(ArrayList<User> buddies) {
        this.buddies = buddies;
    }

    public void setCheers(ArrayList<User> cheers) {
        this.cheers = cheers;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
