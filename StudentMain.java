import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();
        Scanner scn = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scn.nextInt();

            switch (choice) {
                case 1:
                    sm.addStudent();
                    break;
                case 2:
                    sm.displayStudents();
                    break;
                case 3:
                    sm.searchStudent();
                    break;
                case 4:
                    sm.deleteStudent();
                    break;
                case 5:
                    System.out.println("Thank You");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
