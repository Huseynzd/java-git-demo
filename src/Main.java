import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        TaskService service = new TaskService();


      while(true){
          Scanner scanner = new Scanner(System.in);

          System.out.println("""
                1. Add Task
                2. Show Tasks
                3. Delete Task
                4. Find Task
                5. Exit""");

          int choice = scanner.nextInt();

          switch (choice){
              case 1:
                  System.out.println("Enter id:");
                  int newId = scanner.nextInt();
                  scanner.nextLine();

                  System.out.println("Enter title:");
                  String newTitle = scanner.nextLine();


                  System.out.println("Enter description:");
                  String newDescription = scanner.nextLine();

                  Task newTask = new  Task(newId,newTitle,newDescription);
                  service.addTask(newTask);
                  break;

              case 2:
                  System.out.println("Your tasks:");
                  System.out.println(service.getTasks());
                  break;

              case 3:
                  System.out.println("Enter ID for remove task:");
                  int selection = scanner.nextInt();

                  service.deleteTask(selection);
                  break;



          }
      }

    }

}
