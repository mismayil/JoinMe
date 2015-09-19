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
<<<<<<< HEAD

    private ArrayList<User> cheers;

    JoinMeActivity(User owner, Action action, Location location, ArrayList<User> buddies, ArrayList<User> cheers) {
=======
    private ArrayList<User> cheers;

    JoinMeActivity(User owner, Action action, Location location, ArrayList<User> buddies, ArrayList<User> cheers){
>>>>>>> mismayil/master
        this.owner = owner;
        this.action = action;
        this.location = location;
        this.buddies = buddies;
        this.cheers = cheers;
    }

<<<<<<< HEAD
    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
=======
    public ArrayList<User> getCheers() {
        return cheers;
    }

    public ArrayList<User> getBuddies() {
        return buddies;
>>>>>>> mismayil/master
    }

    public Action getAction() {
        return action;
    }

<<<<<<< HEAD
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
=======
    public Location getLocation() {
        return location;
    }
>>>>>>> mismayil/master


<<<<<<< HEAD
=======
    public void setAction(Action action) {
        this.action = action;
>>>>>>> mismayil/master
    }

    public ArrayList<User> getCheers() {
        return cheers;
    }

    public void setCheers(ArrayList<User> cheers) {
        this.cheers = cheers;
    }
<<<<<<< HEAD
=======

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
>>>>>>> mismayil/master
}
