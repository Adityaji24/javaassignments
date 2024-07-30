import java.util.Scanner;

public class StartingEndingNewSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the starting point: ");
        int startPoint = scanner.nextInt();

        System.out.println("Enter the end point: ");
        int endPoint = scanner.nextInt();

        int sum = 0;
        int count=0;
        int i = startPoint;

        do {
            if(i%2==0){
            sum += i;
                count++;
            }

            i++;

        } while (i <=endPoint);

        System.out.println("The sum of even values between " + startPoint + " and " + endPoint + " is: " + sum);
        System.out.println("count:"+count);
    }
}




