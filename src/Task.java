public class Task {
   private int id;
   private String title;
   private String description;

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public Task(int id, String title, String description){
       this.id = id;
       this.title = title;
       this.description = description;
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
