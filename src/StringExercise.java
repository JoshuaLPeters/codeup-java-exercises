import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        // LECTURE NOTES
        //        System.out.println("Please enter your name:");
//        String input = sc.next();
//        String name = "Jane Doe";
        /*
         *  TO DO: Write the control statements below to check the input
         *  String using Java methods.
         */

        //  If the input is an exact match to String name...
        //  Print message: "Welcome Jane Doe!"
//        if(input.equals(name)){
//            System.out.println("welcome Jane Doe!");
//        }
//
//        //  If the input is not capitalized correctly...
//        //  Print message: "Names are proper nouns."
//        if(input.equalsIgnoreCase(name)){
//            System.out.println("Names are proper nouns");
//        }
//
//        //  If the input starts with "Jane"...
//        //  Print message: "Hi Jane!"
//        if(input.startsWith("Jane")){
//            System.out.println("Hi Jane!");
//        }
//
//        //  If the input ends with "Doe"...
//        //  Print message: "Doe, a deer..."
//        if(input.endsWith("Doe")){
//            System.out.println("Doe, a deer...");
//        }


        // STRING MANIPULATION

//        System.out.println(name.charAt(3));
//        // prints "e"
//        System.out.println(name.indexOf("Doe"));
//        // prints 5
//        System.out.println(name.lastIndexOf("e"));
//        // index of e in doe
//        System.out.println(name.length());
//        // 8 returns length of string
//        System.out.println(name.replace("Doe", "Smith"));
//        // Jane Smith
//        System.out.println(name.substring(3));
//        // e Doe
//        System.out.println(name.substring(0,3));
//        // Jan
//        System.out.println(name.toLowerCase());
//        // jane doe
//        System.out.println(name.toUpperCase());
//        // JANE DOE

        // trim is really useful for catching user errors on input.
//        String trimThis = "    too many spaces   ";

//        System.out.println(trimThis);
//        System.out.println(trimThis.trim());

        // How would we fix this?
//        System.out.println("Here is a backslash \\"); //fixed

        // EXERCISE

        //PRINT OUT WITH ONE VARIABLE

//        We don't need no education

//        We don't need no thought control

//        Check "this" out!, "s inside of "s!

//        In windows, the main drive is usually C:\

//        I can do backslashes \, double backslashes \\,
//        and the amazing triple backslash \\\!

        String education = "We don't need no education";
        System.out.printf("%s%n", education);

        String control = "We don't need no thought control";
        System.out.printf("%s%n", control);

        String checkThisOut = "Check \"this\" out!, \"s inside of \"s!";
        System.out.printf("%s%n", checkThisOut);

        String mainDrive = "In windows, the main drive is usually C:\\";
        System.out.printf("%s%n", mainDrive);

        String backSlashes = "I can do backslashes \\, double backslashes \\\\, " + "\n" +
                "and the amazing triple backslash \\\\\\!";
        System.out.printf("%s%n", backSlashes);








    }
}