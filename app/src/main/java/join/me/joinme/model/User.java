package join.me.joinme.model;

import android.graphics.Bitmap;
import android.media.Image;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by mismayil on 19/09/15.
 */
public class User {
    private String userid;
    private String firstname;
    private String lastname;
    private Bitmap profilePic;
    private String gender;
    private ArrayList<JoinMeActivity> activities;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {

        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public User(String userid, String firstname, String lastname, String gender, ArrayList<JoinMeActivity> activities) {
        this.userid = userid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.activities = activities;
    }

    public Bitmap getProfilePic() {
        return profilePic;
    }

    public void setActivities(ArrayList<JoinMeActivity> activities) {
        this.activities = activities;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setProfilePic(Bitmap profilePic) {
        this.profilePic = profilePic;
    }

    public ArrayList<JoinMeActivity> getActivities() {
        return this.activities;
    }
}
