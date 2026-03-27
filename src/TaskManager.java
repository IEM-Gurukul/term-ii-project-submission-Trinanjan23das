import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }
    public void deleteTask(int index) {
    if (index >= 0 && index < tasks.size()) {
        tasks.remove(index);
    }
        public void updateTask(int index, String title, String desc) {
    if (index >= 0 && index < tasks.size()) {
        tasks.set(index, new Task(title, desc));
    }
}

