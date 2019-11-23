import java.util.Scanner;
import java.util.Random;
public class MethodsExercises {

//    public static void orderFood(){
//        System.out.printf("I would like fries please!%n");
//    }
//    public static void favoriteSong(){
//        System.out.printf("In the End by Linkin Park%n");
//    }
//    public static void  weeksIn(){
//        System.out.printf("It has been 10 weeks!%n");
//    }
//    public static void orderFood(String food){
//        System.out.printf("I would like a %s please!%n", food);
//    }
//    public static void orderFood(String item, int number){
//        System.out.printf("I would like %d %s%n", number, item);
//    }
//    public static void orderFood(String item1, String item2){
//        System.out.printf("I would like %s and %s%n", item1, item2);
//    }
    //Recursion

//    public static void count(int n) {
//        if (n <= 0) {
//            System.out.println("All done!");
//            return;
//        }
//        System.out.println(n);
//        count(n - 1);
//    }
    public static void addition(int num1, int num2){
        int additionSum = num1 + num2;
        System.out.printf("The sum of your two numbers is: %d%n", additionSum);
    }
    public static void subtraction(int num1, int num2){
        int subtractionDifference = num1 - num2;
        System.out.printf("The difference of your two numbers is: %d%n", subtractionDifference);
    }
    public static void multiplication(int num1, int num2){
        int multiplicationProduct = num1 * num2;
        System.out.printf("The product of your two numbers is: %d%n", multiplicationProduct);
    }
    public static void division(int num1, int num2){
        int divisionQuotient = num1 / num2;
        System.out.printf("The quotient of your two numbers is: %d%n", divisionQuotient);
    }
    public static void modulus(int num1, int num2){
        int modulusResult = num1 % num2;
        System.out.printf("The result of your two numbers is: %d%n", modulusResult);
    }
    public static void getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please enter a value between the min and max of the values assigned to the function.%n");
        int userInput = sc.nextInt();

        do {
            if (userInput >= min && userInput <= max) {
                System.out.printf("You've entered a value within the correct range!%n");
            } else {
                System.out.printf("You potatoe. %d is not between %d and %d. Try again%n", userInput, max, min);
                System.out.println("Please enter the correct input");
                userInput = sc.nextInt();
                if (userInput >= min && userInput <= max) {
                    System.out.printf("You've entered a value within the correct range!%n");
                }
            }
        }while(userInput > max || userInput < min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        count(5);
        // print 5, call count (4)
        // print 4, call count (3)
        // print 3, call count (2)
        // print 2, call count (1)
        // print 1, call count (0) -> "All done!"


        //  METHODS in java main components:
        // Visibility modifier (public) other classes can see this method
        // optional static keyword (static) this method belonds to the class, not instances of it
        // Return type
        // Name
        // Parameters
        // Body

//    orderFood();
//    orderFood("burger");
//    orderFood("pizza", 5);
//    orderFood("pozole", "taco");
//    favoriteSong();
//    weeksIn();

        //BEGINNING OF EXERCISE
//      1. Basic Arithmetic
//
//        Create four separate methods. Each will perform an arithmetic operation:
//
//        Addition
//        Subtraction
//        Multiplication
//        Division
//        Each function needs to take two parameters/arguments so that the operation can be performed.
//        Test your methods and verify the output.
//        Add a modulus method that finds the modulus of two numbers.
        addition(1, 1);
        subtraction(4, 3);
        multiplication(5,2);
        division(6,3);
        modulus(10,5);

//       Create a method that validates that user input is in a certain range
//       The method signature should look like this:
//        public static int getInteger(int min, int max);
//        and is used like this:
//
//
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
//        If the input is invalid, prompt the user again.
//
//                Hint: recursion might be helpful here!
    getInteger(2, 8);

//        Calculate the factorial of a number.
//        Prompt the user to enter an integer from 1 to 10.
//        Display the factorial of the number entered by the user.
//        Ask if the user wants to continue.
        System.out.println("Please enter an integer from 1 to 10");
        int factorialInt = sc.nextInt();
        System.out.println("Would you like to continue? yes or no");
        String userContinue = sc.next();

        if(userContinue.equals("yes")){
            if (factorialInt <= 10 && factorialInt >= 1) {
                int fact = 1;
                for (int i = 1; i <= factorialInt; i++) {
                    fact = fact * i;
                }
                System.out.printf("%d! = %d%n", factorialInt, fact);
            }
        } else {
            System.out.println("Fine, I didn't want to tell you a factorial calculation anyways. I'm tired.");
        }
//        Use a for loop to calculate the factorial.
//        Assume that the user will enter an integer, but verify it’s between 1 and 10.
//        Use the long type to store the factorial.
//        Continue only if the user agrees to.
//        A factorial is a number multiplied by each of the numbers before it.
//        Factorials are denoted by the exclamation point (n!). Ex:
//        1! = 1               = 1
//        2! = 1 x 2           = 2
//        3! = 1 x 2 x 3       = 6
//        4! = 1 x 2 x 3 x 4   = 24

//        Create an application that simulates dice rolling.
//
//        Ask the user to enter the number of sides for a pair of dice.
//        Prompt the user to roll the dice.
//        "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//        Use static methods to implement the method(s) that generate the random numbers.
//        Use the .random method of the java.lang.Math class to generate random numbers.

        Random rand = new Random();
        System.out.println("Please enter the number of sides for the first dice");
        int firstDice = sc.nextInt();
        firstDice += 1;
        int firstDiceRoll = rand.nextInt(firstDice);
        System.out.println("Please enter the number of sides for the second dice");
        int secondDice = sc.nextInt();
        secondDice += 1;
        int secondDiceRoll = rand.nextInt(secondDice);
        System.out.println("Would you like to roll the dice?");
        String userDiceAnswer = sc.next();
        if(userDiceAnswer.equalsIgnoreCase("yes")){
            System.out.printf("The first dice you rolled was a %d, the second dice you rolled was a %d", firstDiceRoll, secondDiceRoll);
        } else {
            System.out.println("No dice rolling for you");
        }

    }
}