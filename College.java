public class College {
    public static void main(String[] args) {
        Student student1 = new Student("Pratiksha", 22);
        Student student2 = new Student("Priya", 20);

        System.out.println("Total Students: " + Student.getTotalStudents());
        System.out.println("Student 1 ID: " + student1.getStudentId());
        System.out.println("Student 2 ID: " + student2.getStudentId());

        System.out.println("\nStudent 1 Information:");
        student1.displayInfo();

        System.out.println("\nStudent 2 Information:");
        student2.displayInfo();
    }
}

final class Student {
    private static int totalStudents = 0;
    private final int studentId;
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.studentId = ++totalStudents;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    public final int getStudentId() {
        return studentId;
    }

    public void study() {
        System.out.println(name + " is studying.");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentId);
    }

}



