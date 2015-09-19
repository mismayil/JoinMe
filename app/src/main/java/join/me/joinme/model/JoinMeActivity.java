package join.me.joinme.model;

import java.util.ArrayList;

/**
 * Created by mismayil on 19/09/15.
 */
public class JoinMeActivity {
    private User owner;
    private Action action;
    private Location location;
    private ArrayList<User> buddies;

    private ArrayList<User> cheers;

    JoinMeActivity(User owner, Action action, Location location, ArrayList<User> buddies, ArrayList<User> cheers) {
        this.owner = owner;
        this.action = action;
        this.location = location;
        this.buddies = buddies;
        this.cheers = cheers;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public ArrayList<User> getBuddies() {
        return buddies;
    }

    public void setBuddies(ArrayList<User> buddies) {
        this.buddies = buddies;


    }

    public ArrayList<User> getCheers() {
        return cheers;
    }

    public void setCheers(ArrayList<User> cheers) {
        this.cheers = cheers;
    }
}
