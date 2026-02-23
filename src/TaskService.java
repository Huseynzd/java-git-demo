import java.util.ArrayList;
import java.util.List;

public class TaskService {

    private  List<Task> tasks = new ArrayList<>();


    public List<Task> getTasks() {
        return tasks;
    }

    public void addTask(Task task){
        tasks.add(task);
    }
    public void deleteTask(int id){}

//    public Task findTask(int id){
//        if (tasks.contains(id)){
//            return
//        }
//    }

}

