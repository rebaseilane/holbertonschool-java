import activity.Activity;
import java.util.ArrayList;

public class Workflow {
    private ArrayList<Activity> activities;

    public Workflow() {
        activities = new ArrayList<>();
    }

    public void registerActivity(Activity activity) {
        activities.add(activity);
    }

    public ArrayList<Activity> getActivities() {
        return activities;
    }
}
