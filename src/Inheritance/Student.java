package Inheritance;

import java.util.Arrays;

public class Student {
    private static int counter = 0;
    private String firstName;
    private String lastName;
    private Class[] classes;

    private static int numStudents = 0;
    private int id;
    private String name;
    private int age;
    public Student(String name, int age){
        this.id = numStudents;
        numStudents++;
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void printInfo(){
        System.out.println("Name " + name);
        System.out.println("Alter " + age);
        System.out.println("ID " + id);
    }
    public static int getNumStudents(){
        return numStudents;
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.classes = new Class[3];
        counter++;
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


    public static int getCounter(){
        return counter;
    }
}
