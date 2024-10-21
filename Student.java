public class Student {
    int id;
    String name;
    int age;
    String grade;

    public Student(int id, String name, int age, String grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }
}
