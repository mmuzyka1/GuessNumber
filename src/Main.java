import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numberToGuess = new Random().nextInt(100);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number from 0 to 99.");
        int count = 0;
        while (count < 5) {
            if (scanner.hasNextInt()) {
                int usersNumber = scanner.nextInt();
                if (usersNumber > 99) {
                    System.out.println("Your number is GREATER than the one you are trying to guess");
                } else if (usersNumber < 0) {
                    System.out.println("Your number is LOWER than the one you are trying to guess");
                } else {
                    if (usersNumber != numberToGuess && count < 4) {
                        count++;
                        System.out.println("Please try again. You have " + (5 - count) + " tries left.");
                    } else if (usersNumber == numberToGuess) {
                        System.out.println("You guessed it!");
                        break;
                    } else {
                        System.out.println("Sorry, you didn't guess the number, the answer was: " + numberToGuess);
                        break;
                    }
                }
            } else {
                System.out.println("This is not a number!");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}