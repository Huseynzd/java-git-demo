import java.util.ArrayList;
import java.util.List;

public class TaskService {

    private List<Task> tasks = new ArrayList<>();

    public Task findTask(int id){
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == id){
                return tasks.get(i);
            }
        }
        return null;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void addTask(Task task) {
        for (Task oldTasks : tasks) {
            if (oldTasks.getId() == task.getId()) {
                throw new RuntimeException("        ID MUST BE UNIQUE" + "\n");
            }
        }
        tasks.add(task);

    }

    public void deleteTask(int id) {

        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == id) {
                tasks.remove(i);
                break;
            }
        }
    }

    public void updateTask(int id,String title,String description){
        if ( findTask(id) == null) {
            System.out.println("Task not found!!"+"\n");
            return;
        }
        findTask(id).setTitle(title);
        findTask(id).setDescription(description);

    }
}


