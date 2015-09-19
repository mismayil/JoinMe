package join.me.joinme.model;

/**
 * Created by mismayil on 19/09/15.
 */
public class Action {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Action(String description) {

        this.description = description;
    }
}
