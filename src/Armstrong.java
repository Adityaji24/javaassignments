    import java.util.Scanner;
 public class Armstrong {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a three-digit number: ");
            int N = scanner.nextInt();
            scanner.close();

            int original = N;
            int sum = 0;

            while (N > 0) {
                int digit = N % 10;
                sum += digit * digit * digit;
                N/=10;

            }

            if (sum == original) {
                System.out.println(original + " is an Armstrong number");
            } else {
                System.out.println(original + " is not an Armstrong number");
            }
        }
    }




