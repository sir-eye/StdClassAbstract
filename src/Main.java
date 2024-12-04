import abstractStudents.Student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", "Johnson", 20,"Computer Science");
        Student student2 = new Student("Bob", "Smith", 22,"Mathematics");

        System.out.println("\nstudent1");
        student1.displayDetails();
        student1.describeStudy();

        System.out.println("\nstudent2");
        student2.displayDetails();
        student2.describeStudy();
    }
}