import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args){
        // lecture examples
//        System.out.println("Hello");
//
//        String name = "Josh";
//
//        int favNum = 7;
//        System.out.printf("Hello %s, how are you today? %n", name);
//        System.out.format("Hello %s, your favorite number is %d %n", name, favNum);
//
//        Scanner scanner = new Scanner(System.in); // MUST BE ABOVE SCANNER PRINTS TO WORK
//
//        System.out.println("Hey there friend. What is on your mind?");
//        String input = scanner.next();
//        System.out.printf("%s", input); // prints out the input variable
//
//        System.out.println("What is your favorite number?");
//        String num = scanner.next();
//        System.out.println(num);




        // EXERCISE
        double pi = 3.14159;
        // achieve output: The value of pi is approximately 3.14.
//        System.out.printf("The value of pi is approximately %.2f. %n", pi);

        Scanner scanner = new Scanner(System.in);
//        System.out.printf("Please enter a random number! %n");
//        int num = scanner.nextInt();
//        System.out.printf("%d %n", num);

//        System.out.println("Please enter three words!");
//        String firstWord = scanner.next();
//        String secondWord = scanner.next();
//        String thirdWord = scanner.next();
//        System.out.printf("These are the words you've entered: %n%s %n%s %n%s", firstWord, secondWord, thirdWord);

//        System.out.println("Please enter a sentence.");
//        String sentence = scanner.nextLine();
//        System.out.printf("You entered: %s", sentence);

        System.out.println("Please enter the width and length of the class room.");
        // working area / length as an int
//        int width = scanner.nextInt();
//        int length = scanner.nextInt();
//        int area = width * length;
//        int perimeter = width + width + length + length;
//        System.out.printf("The area of your classroom is: %d%n The perimeter of your classroom is: %d", area, perimeter);
        // bonus working as float rounded to two decimal places
        float width = scanner.nextFloat();
        float length = scanner.nextFloat();
        float area = width * length;
        float perimeter = width + width + length + length;
        System.out.printf("The area of your classroom is: %.2f%n The perimeter of your classroom is: %.2f", area, perimeter);






    }
}
