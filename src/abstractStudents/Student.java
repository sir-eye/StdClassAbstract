package abstractStudents;

public class Student extends Person implements Studyable{

    private String major;

    public Student(String firstName, String lastName, int age, String major) {
        super(firstName, lastName, age);
        this.major = major;
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Age: " + getAge());
        System.out.println("Major: " + major);
    }

    @Override
    public void describeStudy() {
        System.out.println("Student " + getFirstName() + " " + getLastName() + " is studying " + major);
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}