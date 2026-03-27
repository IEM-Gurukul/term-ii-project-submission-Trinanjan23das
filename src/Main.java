public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask(new Task("Study", "Learn Java"));
        manager.addTask(new Task("Workout", "Go to gym"));

        for (Task t : manager.getTasks()) {
            System.out.println(t.getTitle() + " - " + t.getDescription());
        }
    }
}
