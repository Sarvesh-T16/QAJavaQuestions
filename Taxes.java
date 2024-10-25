import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Taxes {
    public static void main(String[] args) {
        float tax;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your pay:");
        int pay = scanner.nextInt();

        if (pay >= 0 && pay< 15000){
            tax = 0;
        }
        else if (pay >= 15000 && pay < 20000){
            tax = (float) (pay * 0.1);
        }
        else if (pay >= 20000 && pay < 30000) {
            tax = (float) (pay * 0.15);
        }
        else if (pay >= 30000 && pay < 45000) {
            tax = (float) (pay * 0.2);
        }
        else if (pay >= 45000) {
            tax = (float) (pay * 0.25);
        }
        else {
            System.out.println("Pay cannot be negative");
            tax = 0;
        }

        System.out.println("Tax to be paid: " + tax + "\nPay after tax: " + (pay - tax));

    }
}