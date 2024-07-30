
//Write a program to print the sum of all the even values entered by user until user enter 0 to stop.
import java.util.Scanner;
public class EvenSumGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        do {
            System.out.println("Enter a number (0 to stop): ");
            number = scanner.nextInt();

            if (number != 0 && number % 2 == 0) {
                sum += number;
            }
        } while (number != 0);

        System.out.println("Sum of even numbers: " + sum);
    }
}


