public class Task {
   private int id;
   private String title;
   private String description;

   private Status status;


    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }


    public Task(int id, String title, String description,int choice){
       this.id = id;
       this.title = title;
       this.description = description;
       this.status = Status.TODO;

   }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public void printTask(){
        System.out.println("ID "+id );
        System.out.println("Description "+description );
        System.out.println("Title "+title );
    }
}
