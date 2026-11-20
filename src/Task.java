public class Task
{
    private int id;
    private String description;
    private Priority priority;
    private TaskStatus status;
    private TaskCategory taskCategory;
    private static int nextId = 1;

    public Task(
            String description,
            Priority priority,
            TaskCategory taskCategory
    )
    {
        this.id = nextId;
        nextId++;
        this.description = description;
        this.priority = priority;
        this.taskCategory = taskCategory;
        this.status = TaskStatus.PENDING;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public TaskCategory getTaskCategory() {
        return taskCategory;
    }

    public void setTaskCategory(TaskCategory taskCategory) {
        this.taskCategory = taskCategory;
    }

    public void showInfo()
    {
        System.out.println("ID: " + id);
        System.out.println("Descripción: " + description);
        System.out.println("Prioridad: " + priority);
        System.out.println("Estado: " + status);
        System.out.println("Categoria: " + taskCategory);
    }




}
