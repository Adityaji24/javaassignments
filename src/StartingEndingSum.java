import java.util.Scanner;
public class StartingEndingSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the starting point: ");
        int startPoint = scanner.nextInt();

        System.out.println("Enter the end point: ");
        int endPoint = scanner.nextInt();

        int sum = 0;
        int i = startPoint;

        do {
            sum += i;
            i++;
        } while (i <endPoint);

        System.out.println("The sum of all values between " + startPoint + " and " + endPoint + " is: " + sum);
    }
}


