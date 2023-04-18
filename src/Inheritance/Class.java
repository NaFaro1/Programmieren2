package Inheritance;

public class Class {
    private String name;
    private int hours;
    private int maxCapacity;
    private int enrolledStudents;




    public Class(String name, int hours, int maxCapacity) {
        this.name = name;
        this.hours = hours;
        this.maxCapacity = maxCapacity;
        this.enrolledStudents = 0;


    }

    public void enroll() {
        if (enrolledStudents < maxCapacity) {
            enrolledStudents++;
            System.out.println("One student enrolled in " + name);
        } else {
            System.out.println("Sorry, the class is already full.");
        }
    }

    public boolean maxCapacityReached() {
        return enrolledStudents == maxCapacity;
    }

    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getEnrolledStudents() {
        return enrolledStudents;
    }
}


