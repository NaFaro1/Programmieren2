package Inheritance;

public class Demo {
          public static void main(String[] args) {
              Class mathClass = new Class("Mathematics", 3, 30);
              Class physicsClass = new Class("Physics", 2, 20);
              Class chemistryClass = new Class("Chemistry", 2, 25);
              Class literatureClass = new Class("Literature", 1, 15);

              Student john = new Student("John", "Doe");
              Student jane = new Student("Jane", "Doe");
              Student Melissa = new Student("Meli", "Sa");
              Student Nina = new Student("Nina", "Köln");

              john.enroll(mathClass);
              john.enroll(physicsClass);
              john.enroll(chemistryClass);
              john.enroll(literatureClass); // should add class and increase array

              jane.enroll(mathClass);
              jane.enroll(physicsClass);
              jane.enroll(chemistryClass); // should add class
              jane.enroll(literatureClass); // should print
              System.out.println( "Es sind gerade " + Student.getCounter() + " Student(s) Da");

              Student.getNumStudents();
              Student.getCounter();
              Nina.printInfo();
              System.out.println(" Das ist "+ Student.getNumStudents() + "  " + Student.getCounter()+  " " +  Nina.getName()+ " " + Nina.getId());

          }
      }