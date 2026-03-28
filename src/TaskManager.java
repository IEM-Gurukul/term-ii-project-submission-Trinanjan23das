import java.util.ArrayList;

public interface TaskOperations {
    void addTask(Task task);
}

public class TaskManager implements TaskOperations {
    private ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }
    public void deleteTask(int index) {
    try {
        tasks.remove(index);
    } catch (Exception e) {
        System.out.println("Invalid index!");
    }
        public void updateTask(int index, String title, String desc) {
    if (index >= 0 && index < tasks.size()) {
        tasks.set(index, new Task(title, desc));
    }
}
        public class AdvancedTaskManager extends TaskManager {
    public void showTaskCount() {
        System.out.println("Total tasks: " + getTasks().size());
    }
}

