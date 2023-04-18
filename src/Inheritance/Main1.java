package Inheritance;

public class Main1 {
    public static void main(String[] args) {
        Class mathClass = new Class("Math", 20, 10);
        for (int i = 0; i < 20; i++) {
            mathClass.enroll();
        }
        System.out.println("Max capacity reached? " + mathClass.maxCapacityReached());
    }
}
