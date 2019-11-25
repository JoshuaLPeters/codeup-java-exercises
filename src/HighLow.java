import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
public class HighLow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        //Game Development 101
//        Welcome to the world of game development!
//        You are going to build a high-low guessing game. Create a class named HighLow inside of src.
//        The specs for the game are:
//        Game picks a random number between 1 and 100.
//        Prompts user to guess the number.
//        All user inputs are validated.
//        If user's guess is less than the number, it outputs "HIGHER".
//        If user's guess is more than the number, it outputs "LOWER".
//        If a user guesses the number, the game should declare "GOOD GUESS!"
    int gameRandomNumber = rand.nextInt(100);
    gameRandomNumber += 1;

        System.out.println("Welcome to the High Low game! Please enter a number to begin.");
        int guess = sc.nextInt();
        do {
            if (guess > gameRandomNumber) {
                System.out.println("LOWER");
                System.out.println("Please enter another guess");
                guess = sc.nextInt();
                if (guess > gameRandomNumber) {
                    System.out.println("LOWER");
                    System.out.println("Please enter another guess");
                    guess = sc.nextInt();
                } else if (guess < gameRandomNumber) {
                    System.out.println("HIGHER");
                }
            } else if (guess < gameRandomNumber) {
                System.out.println("HIGHER");
                System.out.println("Please enter another guess");
                guess = sc.nextInt();
                if (guess > gameRandomNumber) {
                    System.out.println("LOWER");
                    System.out.println("Please enter another guess");
                    guess = sc.nextInt();
                }
            }
        } while (guess != gameRandomNumber);
        System.out.println("GOOD GUESS!");

    }
}