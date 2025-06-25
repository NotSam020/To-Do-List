
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String[] task = new String[10];
        int taskCount = 0;

        while (true) {
            System.out.println("This is the to-do list:");
            System.out.println("1 - Create a task");
            System.out.println("2 - View all tasks");
            System.out.println("3 - Exit");
            System.out.print("Choose between 1-3: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                if(taskCount < task.length) {
                    System.out.print("Enter task: ");
                    task[taskCount] = scanner.nextLine();
                    taskCount++;
                }
                else{
                    System.out.println("You are too busy!");
                }
                break;
                case 2:
                System.out.println("Tasks: ");
                for (int i = 0; i < taskCount; i++) {
                    System.out.println((i + 1) + "." + task[i]);
                }
                break;
                case 3:
                System.out.println("Exiting...");
                return;

                default:
                    System.out.println("Invalid option. Try again. ");
                }
            }
        }
    }

