import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the maximum number for FizzBuzz: ");
         int num1 = scanner.nextInt();

         for (int i = 0; i < num1 + 1; i++){
             if (i % 3 == 0 && i % 5 == 0){
                 System.out.println("FizzBuzz");
             }
             else if (i % 3 == 0) {
                 System.out.println("Fizz");
             }
             else if (i % 5 == 0) {
                 System.out.println("Buzz");
             }
             else {
                 System.out.println(i);
             }
         }
    }
}