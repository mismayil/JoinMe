package join.me.joinme.model;

import android.graphics.Bitmap;
import android.media.Image;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by mismayil on 19/09/15.
 */
public class User {
    private String name;
    private Bitmap profilePic;
    private Date birthday;
    private ArrayList<JoinMeActivity> activities;

    public User(String name, Date birthday, ArrayList<JoinMeActivity> activities) {
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

    public Bitmap getProfilePic() {
        return profilePic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setActivities(ArrayList<JoinMeActivity> activities) {
        this.activities = activities;
    }

    public void setProfilePic(Bitmap profilePic) {
        this.profilePic = profilePic;
    }

    public ArrayList<JoinMeActivity> getActivities() {
        return this.activities;
    }
}
