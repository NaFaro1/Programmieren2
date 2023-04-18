package Inheritance;

public class FractionDemo {
        public static void main(String[] args) {
            Fraction f1 = new Fraction(2, 3);
            Fraction f2 = new Fraction(3, 4);
            Fraction f3 = new Fraction(4, 5);

            f1.print();
            f2.print();
            f3.print();

            Fraction f4 = f1.multiply(f2);
            Fraction f5 = f1.multiply(f2, f3);
            Fraction f6 = f1.add(f2);

            f4.print();
            f5.print();
            f6.print();

            System.out.println("Decimal value of f1: " + f1.toDecimal());
            System.out.println("Decimal value of f4: " + f4.toDecimal());
        }
    }

