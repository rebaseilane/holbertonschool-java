import java.util.ArrayList;

public class TodoList {
    private ArrayList<Task> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        for (Task t : tasks) {
            if (t.getIdentifier() == task.getIdentifier()) {
                throw new IllegalArgumentException("Task with identifier " + task.getIdentifier() + " already exists in the list");
            }
        }
        tasks.add(task);
    }

    public boolean markTaskDone(int identifier) {
        for (Task task : tasks) {
            if (task.getIdentifier() == identifier) {
                task.setDone(true);
                return true;
            }
        }
        return false;
    }

    public boolean undoTask(int identifier) {
        for (Task task : tasks) {
            if (task.getIdentifier() == identifier) {
                task.setDone(false);
                return true;
            }
        }
        return false;
    }

    public void undoAll() {
        for (Task task : tasks) {
            task.setDone(false);
        }
    }

    public void completeAll() {
        for (Task task : tasks) {
            task.setDone(true);
        }
    }

    public void listTasks() {
        for (Task task : tasks) {
            String status = task.isDone() ? "[X]" : "[ ]";
            System.out.println(status + "  Id: " + task.getIdentifier() + " - Description: " + task.getDescription());
        }
    }
}
