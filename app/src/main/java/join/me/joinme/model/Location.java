package join.me.joinme.model;

/**
 * Created by mismayil on 19/09/15.
 */
public class Location {
    private double latitude;
    private double longitude;

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Location(double latitude, double longitude) {

        this.latitude = latitude;
        this.longitude = longitude;
    }
}
