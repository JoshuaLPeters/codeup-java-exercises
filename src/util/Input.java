package util;
import java.util.Scanner;
public class Input {

    private static Scanner scanner = new Scanner(System.in);

    public static String getString(){
        System.out.println("Please enter a string");
        return scanner.nextLine();
    };
    public static boolean yesNo(){
        System.out.println("Please enter yes or no: y/n");
        String newBoolean = scanner.next();
        return newBoolean.equalsIgnoreCase("y") || newBoolean.equalsIgnoreCase("yes");
    };
    public static int getInt(int min, int max) {
        System.out.printf("Please enter a value between the min and max of the values assigned to the function.%n");
        int userInput = scanner.nextInt();
        do {
            if (userInput >= min && userInput <= max) {
                System.out.printf("You've entered a value within the correct range!%n");
            } else {
                System.out.printf("You potatoe. %d is not between %d and %d. Try again%n", userInput, max, min);
                System.out.println("Please enter the correct input");
                userInput = scanner.nextInt();
                if (userInput >= min && userInput <= max) {
                    System.out.printf("You've entered a value within the correct range!%n");
                }

            }

        }while(userInput > max || userInput < min);
        return userInput;
    };
    public static int getInt(){
        System.out.println("Give me a number: ");
        int number;
        try{
            number = Integer.valueOf(getString());
            return number;
        } catch (NumberFormatException nfe){
            System.out.println("Wrong input, try again: ");
            return getInt();
        }
    }

    public static double getDouble(double min, double max){
        System.out.printf("Please enter a value between the min and max of the values assigned to the function.%n");
        double userInput = scanner.nextDouble();
        do {
            if (userInput >= min && userInput <= max) {
                System.out.printf("You've entered a value within the correct range!%n");
            } else {
                System.out.printf("You potatoe. %d is not between %d and %d. Try again%n", userInput, max, min);
                System.out.println("Please enter the correct input");
                userInput = scanner.nextDouble();
                if (userInput >= min && userInput <= max) {
                    System.out.printf("You've entered a value within the correct range!%n");
                }
            }
        }while(userInput > max || userInput < min);
        return userInput;
    }
    public static double getDouble(){
        System.out.println("Give me a decimal: ");
        double number;
        try{
            number = Double.valueOf(getString());
            return number;
        } catch (NumberFormatException nfe){
            System.out.println("Wrong input, try again: ");
            return getDouble();
        }
    }






//    String getString()
//    boolean yesNo()
//    int getInt(int min, int max)
//    int getInt()
//    double getDouble(double min, double max)
//    double getDouble()
//    The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
//    The getInt(int min, int max) method should keep prompting the user for input
//    until they give an integer within the min and max. The getDouble method should do the same thing, but with decimal numbers.
//    Create another class named InputTest that has a static main method that uses all of the methods from the Input class.



}
