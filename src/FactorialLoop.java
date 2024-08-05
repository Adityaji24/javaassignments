import java.util.Scanner;
public class FactorialLoop {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int N = scanner.nextInt();
            scanner.close();

            int factorial = 1;
            int i = 1;

            while (i <= N) {
                factorial *= i;
                i++;
            }

            System.out.println("Factorial of " + N + " = " + factorial);
        }
    }



