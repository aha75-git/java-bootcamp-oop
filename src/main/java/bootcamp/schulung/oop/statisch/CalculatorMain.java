package bootcamp.schulung.oop.statisch;

public class CalculatorMain {
    public static void main(String[] args) {
        double num1 = 12.5;
        double num2 = 3.5;

        System.out.println("Summe: " + Calculator.add(num1, num2));

        System.out.println("Differenz: " + Calculator.subtract(num1, num2));

        System.out.println("Produkt: " + Calculator.multiply(num1, num2));

        System.out.println("Quotient: " + Calculator.divide(num1, num2));

        try {
            System.out.println("Quotient: " + Calculator.divide(num1, 0)); // divide by Zero
        } catch (ArithmeticException e) {
            System.out.println("2) Quotient - Fehlermeldung: " + e.getMessage());
        }
    }
}
