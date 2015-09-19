package join.me.joinme.model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by mismayil on 19/09/15.
 */
public class User {
    private String name;
    private Date birthday;
    private ArrayList<Activity> activities;

    public User(String name, Date birthday, ArrayList<Activity> activities) {
        this.name = name;
        this.birthday = birthday;
        this.activities = activities;
    }

    public String getName() {
        return this.name;
    }

    public Date getBirthday() {
        return this.birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setActivities(ArrayList<Activity> activities) {
        this.activities = activities;
    }

    public ArrayList<Activity> getActivities() {
        return this.activities;
    }
}
