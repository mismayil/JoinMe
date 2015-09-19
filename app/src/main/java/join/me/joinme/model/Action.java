package join.me.joinme.model;

/**
 * Created by mismayil on 19/09/15.
 */
public class Action {
    private String description;
    private String address;

    public String getDescription() {
        return description;
    }

    public String getAddress() {
        return address;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Action(String description) {

        this.description = description;
    }
}
