import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lets play Blackjack, \nEnter your first number ");
        int num1 = scanner.nextInt();
        System.out.println("Enter your second number ");
        int num2 = scanner.nextInt();
        
        if (num1 > 21 && num2 > 21){
            System.out.println("0");
        } else if (num1 > 21 && num2 <= 21) {
            System.out.println(num2);
        } else if (num1 <= 21 && num2 > 21) {
            System.out.println(num1);
        } else if (num1 <= 21 && num2 <= 21) {
            System.out.println(Math.max(num1,num2));
        } else {
            System.out.println("Enter a number over 0");
        }


    }
}
