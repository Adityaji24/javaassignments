import java.util.Scanner;
public class MagicNewNumber {
    public static void main(String[] args) {
        int magicNumber = 8;
        Scanner scanner = new Scanner(System.in);
        int userNumber;

        do {
            System.out.println("Guess the magic number:");
            userNumber = scanner.nextInt();

            if (userNumber == magicNumber ) {
                System.out.println("Winner!");
            }else if(userNumber==0){
               break;
            }else {
                System.out.println("Try again!");
            }
        } while (userNumber != magicNumber);

    }
}


