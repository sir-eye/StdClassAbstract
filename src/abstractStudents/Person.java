package abstractStudents;

public abstract class Person {
    protected String firstName;
    protected String lastName;
    protected int age;

    //Constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    //Concrete method
    public String getFirstName() {
        return firstName;
    }
    public abstract void displayDetails();

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}