import java.util.ArrayList;
import java.util.List;

public class TaskService {

    private List<Task> tasks = new ArrayList<>();


    public List<Task> getTasks() {
        return tasks;
    }

    public void addTask(Task task) {
        for(Task oldTasks: tasks){
            if (oldTasks.getId() == task.getId()){
                throw new RuntimeException("\n"+ "        ID MUST BE UNIQUE"+"\n");
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
}


