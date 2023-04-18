package Inheritance;

public class Fraction {
    private int numerator;   // Zähler
    private int denominator; // Nenner

    // Konstruktor
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify(); // kürzen des Bruchs
    }

    // Getter-Methoden
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    // Methode, die den Bruch als Dezimalzahl zurückliefert
    public double toDecimal() {
        return (double) numerator / denominator;
    }

    // Methode, die den Bruch als String ausgibt
    public void print() {
        System.out.println(numerator + " / " + denominator);
    }

    // Methode, die den Bruch mit einem anderen Bruch multipliziert
    public Fraction multiply(Fraction b2) {
        int newNumerator = numerator * b2.getNumerator();
        int newDenominator = denominator * b2.getDenominator();
        return new Fraction(newNumerator, newDenominator);
    }

    // Methode, die den Bruch mit zwei anderen Brüchen multipliziert
    public Fraction multiply(Fraction b2, Fraction b3) {
        Fraction temp = b2.multiply(b3); // Multiplikation der beiden Brüche
        return multiply(temp); // Aufruf der anderen multiply-Methode mit dem Ergebnis
    }

    // Methode, die den Bruch mit einem anderen Bruch addiert
    public Fraction add(Fraction b2) {
        int newDenominator = denominator * b2.getDenominator();
        int newNumerator = numerator * b2.getDenominator() + b2.getNumerator() * denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // interne Methode zum Kürzen des Bruchs
    private void simplify() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    // interne Methode zur Bestimmung des größten gemeinsamen Teilers (ggT)
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}
