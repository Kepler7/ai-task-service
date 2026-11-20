import java.util.ArrayList;

public class TaskService {
    private ArrayList<Task> tasks;

    public TaskService() {
        tasks = new ArrayList<>();
    }

    public void listTasks() {
        if (tasks.size() == 0) {
            System.out.println("No hay tareas");
            return;
        }

        for (int i = 0; i < tasks.size(); i++) {
            tasks.get(i).showInfo();
            System.out.println();
        }
    }

    public Task findTaskById(int id) {
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);

            if (task.getId() == id) {
                return task;
            }

        }
        return null;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void addTask(String description) {
        Task task = new Task(
                description,
                Priority.MEDIUM,
                TaskCategory.OTHER
        );

    }

    public void addTask(String description, Priority priority) {
        Task task = new Task(
                description,
                priority,
                TaskCategory.OTHER
        );
    }

    public void addTask(String description, Priority priority, TaskCategory taskCategory) {
        Task task = new Task(
                description,
                priority,
                taskCategory
        );

    }

}
    /*
    overload
     addTask(Task task)

    addTask(String description)

    addTask(String description, Priority priority)

    OVERLOAD
    → mismo método
    → diferentes parámetros

    OVERRIDE
    → método heredado
    → nueva implementación


    public boolean startTask(int id)
    public boolean removeTask(int id)
    public int getTaskCount()
}
     */


