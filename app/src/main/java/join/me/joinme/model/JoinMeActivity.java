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
    private ArrayList<Cheer> cheers;

    public Activity(User owner, Action action, Location location, ArrayList<User> buddies, ArrayList<Cheer> cheers) {
        this.owner = owner;
        this.action = action;
        this.location = location;
        this.buddies = buddies;
        this.cheers = cheers;
    }

    public ArrayList<Cheer> getCheers() {
        return cheers;
    }

    public void setCheers(ArrayList<Cheer> cheers) {
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
}
