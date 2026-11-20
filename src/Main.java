//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
                ┌───────────────┐
                │     User      │
                └───────┬───────┘
                        │
             ┌──────────┴──────────┐------------------ Android Client
             ▼                     ▼                    |
         Telegram               WhatsApp                |
             │                     │                    |
             └──────────┬──────────┘                    |
                        ▼                               |
                   TaskAgent <----------------------------
                        │
          ┌─────────────┼─────────────┐
          ▼             ▼             ▼
       AIClient     TaskService       Tools -> POST - GET - PUT
          │
      ┌───┴────┐-------------
      ▼        ▼             |
   OpenAI    Claude        Hugging face -  deepseek - Gemini



Task
→ representa UNA tarea

TaskService
→ administra MUCHAS tareas

TaskService service = new TaskService();
Task task1 = new Task("Hacer mi tarea" , Priority.LOW, TaskCategory.STUDY);
service.addTask(task1);

service.addTask(
        "Estudiar Java",
        Priority.HIGH
);

service.addTask(
        "Comprar leche"
);

Overload static - compilar - estatico
Overriding runtime - ejecucion - dinamico
*/



public class Main
{
    public static void main(String[] args)
    {
        Task task1 = new Task("Hacer mi tarea" , Priority.LOW, TaskCategory.STUDY);
        Task task2 = new Task("Jugar video juegos", Priority.HIGH,TaskCategory.PERSONAL);
        Task task3 = new Task("Hacer ejercicio", Priority.MEDIUM, TaskCategory.HEALTH);
        TaskService service = new TaskService();
        service.addTask(task1);
        service.addTask(task2);
        service.addTask(task3);

        Task task = service.findTaskById(3);
        task.showInfo();

    }
}