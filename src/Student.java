import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private Class[] classes;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.classes = new Class[3];
    }

    private void increaseClassArray() {
        classes = Arrays.copyOf(classes, classes.length + 1);
    }

    public void enroll(Class newClass) {
        if (Arrays.asList(classes).contains(newClass)) {
            System.out.println(firstName + " " + lastName + " is already enrolled in " + newClass.getName() + ".");
        } else if (newClass.maxCapacityReached()) {
            System.out.println("Sorry, " + newClass.getName() + " is already full.");
        } else {
            if (classes.length >= 3) {
                increaseClassArray();
            }
            classes[classes.length - 1] = newClass;
            newClass.enroll();
        }
    }

    public void printEnrolledClasses() {
        System.out.println(firstName + " " + lastName + " is enrolled in the following classes:");
        for (Class c : classes) {
            if (c != null) {
                System.out.println("- " + c.getName());
            }
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
