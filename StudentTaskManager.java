import java.util.*;

class StudentTaskManager {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // LinkedList for students and tasks
        ArrayList<String> students = new ArrayList<>();
        LinkedList<String> tasks = new LinkedList<>();

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Add Student");
            System.out.println("2. Assign Task");
            System.out.println("3. Display Students & Tasks");
            System.out.println("4. Add Task at Specific Position");
            System.out.println("5. Remove Student");
            System.out.println("6. Remove Task");
            System.out.println("7. Check Student Exists");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();
                    students.add(name);
                    System.out.println("Student added.");
                    break;

                case 2:
                    System.out.print("Enter task: ");
                    String task = sc.nextLine();
                    tasks.add(task);
                    System.out.println("Task assigned.");
                    break;

                case 3:
                    System.out.println("\nStudents: " + students);
                    System.out.println("Tasks: " + tasks);
                    break;

                case 4:
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter task: ");
                    String newTask = sc.nextLine();

                    if (pos >= 0 && pos <= tasks.size()) {
                        tasks.add(pos, newTask);
                        System.out.println("Task added at position.");
                    } else {
                        System.out.println("Invalid position!");
                    }
                    break;

                case 5:
                    System.out.print("Enter student name to remove: ");
                    String removeStudent = sc.nextLine();
                    if (students.remove(removeStudent)) {
                        System.out.println("Student removed.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 6:
                    System.out.print("Enter task to remove: ");
                    String removeTask = sc.nextLine();
                    if (tasks.remove(removeTask)) {
                        System.out.println("Task removed.");
                    } else {
                        System.out.println("Task not found.");
                    }
                    break;

                case 7:
                    System.out.print("Enter student name to check: ");
                    String check = sc.nextLine();
                    if (students.contains(check)) {
                        System.out.println("Student exists in list.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}