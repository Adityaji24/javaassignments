import java.util.Scanner;

public class TableGenerator {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number N");
        int N = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + "x" + i + "=" + N * i);
        }
    }
}