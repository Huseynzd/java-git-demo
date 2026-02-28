import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        TaskService service = new TaskService();


        Scanner scanner = new Scanner(System.in);

        boolean loop = true;
        while(loop){


          System.out.println("""
                1. Add Task
                2. Show Tasks
                3. Delete Task
                4. Find Task
                5. Update Task
                6. Task Status
                7. Exit""");

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



                  Task newTask = new  Task(newId,newTitle,newDescription,0);
                  try {
                      service.addTask(newTask);

                  }catch (RuntimeException e){
                      System.out.println(e.getMessage());
                  }

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
              case 4:
                  System.out.println("Enter ID:");
                  System.out.println(service.findTask(scanner.nextInt()));
                  break;
              case 5:
                  System.out.println("Enter ID:");
                  int id = scanner.nextInt();
                  scanner.nextLine();

                  System.out.println("Enter new title:");
                  String newT = scanner.nextLine();

                  System.out.println("Enter new description");
                  String newD = scanner.nextLine();

                  service.updateTask(id,newT,newD);
                  break;
              case 6:
                  System.out.println("Enter ID:");
                    int statusID = scanner.nextInt();
                    scanner.nextLine();

                  System.out.println("Enter Status:"+"\n"+
                          "-Default Status is TODO"+"\n" +
                          "-Enter 1 for IN_PROGRESS" +"\n"+
                          "-Enter 2 for DONE");

                  int statusChoice = scanner.nextInt();
                  Status selectedStatus = null;

                  switch (statusChoice){
                      case 1:
                          selectedStatus = Status.IN_PROGRESS;
                          break;
                      case 2:
                          selectedStatus =Status.DONE;
                          break;
                      default:
                          System.out.println("Choice is not valid");
                  }

                  service.changeStatus(statusID,selectedStatus);
                  break;

              case 7:
                  System.out.println("Exiting...");
                  loop = false;


          }
      }

    }

}
