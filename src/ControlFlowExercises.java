import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // EXERCISE
//        Loop Basics
//
//        A. While
//
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:

//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }


//        5 6 7 8 9 10 11 12 13 14 15
//
//        B. Do While
//
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        Alter your loop to count backwards by 5's from 100 to -10.
//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:

//        int i = 0;
//        do {
//            i += 2;
//            System.out.println(i);
//        } while (i < 100); // counts up to 100 by 2s.
//
//        do{
//            i -= 5;
//            System.out.println(i);
//        } while (i > -10); // then counts down by -5 until -10.

//        long i = 2;
//        do{
//            System.out.println(i);
//            i = i * i;
//        } while (i < 1000000);

//        2
//        4
//        16
//        256
//        65536
//        For
//
//        C. Refactor the previous two exercises to use a for loop instead.

//        for(int i = 0; i <= 100; i += 2){
//            System.out.println(i);
//        }
//        for(int i = 100; i >= -10; i -= 5){
//            System.out.println(i);
//        }
//        for(long i = 2; i < 1000000; i *= i) {
//            System.out.println(i);
//        }
//        Fizzbuzz
//
//        One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
//
//                Write a program that prints the numbers from 1 to 100.
//        For multiples of three: print “Fizz” instead of the number.
//        For the multiples of five: print “Buzz”.
//        For numbers which are multiples of both three and five: print “FizzBuzz”.

//        for(int i = 1; i <= 100; i++){
//            if(i % 3 == 0 && i % 5 == 0){
//                System.out.println("FizzBuzz");
//            } else if(i % 5 == 0){
//                System.out.println("Buzz");
//            } else if(i % 3 == 0){
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }   // working java fizzbuzz baby

//        3. Display a table of powers.
//
//        Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.
//        Example Output
//
//
//        What number would you like to go up to? 5
//
//        Here is your table!
//                number | squared | cubed
//                ------ | ------- | -----
//                1      | 1       | 1
//                2      | 4       | 8
//                3      | 9       | 27
//                4      | 16      | 64
//                5      | 25      | 125



//
//           System.out.println("What number would you like to go up to?");
//            int userNum = sc.nextInt();
//
//            System.out.println("Would you like to continue?");
//            String response = sc.next();
//            do{
//
//                System.out.println("number | squared | cubed");
//                System.out.println("------ | ------ | ------");
//                for(int i = 1; i <= userNum; i++){
//                    int squared = i * i;
//                    int cubed = i * i * i;
//                    System.out.printf("%d      |%d      |%d%n", i, squared, cubed);
//
//                }
//            } while (response == "yes");

//        Convert given number grades into letter grades.
//        Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//        Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Grade Ranges:
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0

//        System.out.println("Please enter a numerical grade from 0 to 100.");
//        int gradeOne = sc.nextInt();
//        System.out.println("Would you like to continue?");
//        String willContinue = sc.next();
//            do {
//                if (gradeOne >= 88) {
//                    System.out.println("Your letter grade is an A");
//                } else if (gradeOne < 88 && gradeOne > 79) {
//                    System.out.println("Your letter grade is a B");
//                } else if (gradeOne < 80 && gradeOne > 66) {
//                    System.out.println("Your letter grade is a C");
//                } else if (gradeOne < 67 && gradeOne > 59) {
//                    System.out.println("Your letter grade is a D");
//                } else {
//                    System.out.println("You have failed.");
//                }
//            } while (willContinue == "yes");
    // EXERCISE COMPLETE
    }
}
