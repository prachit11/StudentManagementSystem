import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    ArrayList<Student> students = new ArrayList<>();
    Scanner scn = new Scanner(System.in);

    public void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = scn.nextInt();
        scn.nextLine(); 
        System.out.print("Enter Name: ");
        String name = scn.nextLine();
        System.out.print("Enter Age: ");
        int age = scn.nextInt();
        scn.nextLine(); 
        System.out.print("Enter Grade: ");
        String grade = scn.nextLine();

        students.add(new Student(id, name, age, grade));
        System.out.println("Student added successfully.");
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("List of Students:");
            for (Student stu : students) {
                stu.displayDetails();
            }
        }
    }

    public void searchStudent() {
        System.out.print("Enter Student ID to search: ");
        int id = scn.nextInt();
        for (Student stu : students) {
            if (stu.id == id) {
                stu.displayDetails();
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = scn.nextInt();
        for (Student stu : students) {
            if (stu.id == id) {
                students.remove(stu);
                System.out.println("Student deleted successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}
