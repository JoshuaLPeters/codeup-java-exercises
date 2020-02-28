import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;



//public class ArraysExercises {
//
//
//    public static void main(String[] args) {
//    String[] test = new String[]{"Alex", "Apple", "Earth"};
//        System.out.println(changeString(test));
//    }
//
//    public static ArrayList<String> changeString(String[] words) {
//        ArrayList<String> finalWords = new ArrayList<>();
//        for (String thing : words) {
//            String first = thing.replace('a', '?');
//            first = first.replace('A', '?');
//            finalWords.add(first);
//        }
//        return finalWords;
//    }
//}
public class ArraysExercises{

//    public static void main(String[]args){
//        String[] test = new String[]{"Apple","Earth","Anna"};
//        System.out.println(interviewFunction(test));
//    }
//    public static ArrayList<String> interviewFunction(String[] words){
//        ArrayList<String> output = new ArrayList<String>();
//        for(String letter : words){
//            String initial = letter.replace('a','?');
//            initial = initial.replace('A','?');
//            output.add(initial);
//        }
//        return output;
//    }

// CODE STUDY GUIDE FOR ACCENTURE

//    Inheritance
//    We can define classes that extend, or inherit from
//    another class with the extends keyword in the class definition.
//    We call these subclasses, and the classes that are being inherited from / extended superclasses.
//    A subclass inherits all the fields of it's superclass, and can re-use any of it's functionality.

//    Polymorphism
//    Polymorphism is a feature of inheritance that allows us
//    to treat objects of different subclasses that have the same
//    superclass as if they were of the superclass type. Methods or
//    variables that are defined with a superclass type can accept
//    objects that are a subclass of that type.

//    Method Overloading

//    Method overloading is defining multiple methods with the same name,
//    but with different parameter type, parameter order, or number of parameters.

//    Overloaded methods can call other versions of themselves,
//    and are commonly used to provide default values for arguments.

//    Let's take a look at an example that overloads the sayHello method. For easier explanation,
//    we'll label each version of the method in the comments.

    // version 1
    public static void sayHello() {
        sayHello("Hello", "World");
    }

    // version 2
    public static void sayHello(int times) {
        for (int i = 0; i < times; i += 1) {
            sayHello();
        }
    }

    // version 3
    public static void sayHello(String name) {
        sayHello("Hello", name);
    }

    // version 4
    public static void sayHello(String greeting, String name) {
        System.out.println(greeting + ", " + name + "!");
    }


    public static void main(String[]Args){
    int[] numbers = new int[4];
    numbers[0] = 7;
    numbers[1] = 18;
    numbers[2] = 32;
    numbers[3] = 787;
    for(int i = 0; i < numbers.length; i++){
        System.out.println(i);
    }

    Integer[] sortArray = new Integer[6];
    for(int i = 0; i <= 5; i++){
        sortArray[i] = i;
    }
    Arrays.sort(sortArray);
    System.out.println(Arrays.toString(sortArray));

    Arrays.sort(sortArray, Collections.reverseOrder());
    System.out.println(Arrays.toString(sortArray));


    Integer[] myArray = new Integer[7];
    for(int i = 0; i <=6; i++){
        myArray[i] = i;
    }
    // Remember to use Arrays.toString to convert the object to a string so we can print the array.
    System.out.println(Arrays.toString(myArray));

    // If we want to reverse the order, we can resort the array with Arrays.sort(myArray, Collections.reverseOrder());
    Arrays.sort(myArray, Collections.reverseOrder());

    //After we sort; we still need to convert the object to a string from the object that we sorted.
    System.out.println(Arrays.toString(myArray));

    Integer[] forthAttempt = new Integer[5];
    for(int i = 0; i <= 4; i++){
        forthAttempt[i] = i;
    }
    System.out.println(Arrays.toString(forthAttempt));
    Arrays.sort(forthAttempt, Collections.reverseOrder());
    System.out.println(Arrays.toString(forthAttempt));




    sayHello("Should", "Work");
    sayHello(7);

}



















    //    public static void main(String[] args) {
//        String[] test = new String[]{"Alex","Apple","Earth"};
//        System.out.println(interviewFunction(test));
//    }
//    public static ArrayList<String> interviewFunction(String[] words){
//        ArrayList<String> output = new ArrayList<String>();
//        for(String letter : words){
//            String initial = letter.replace('a','?');
//            initial = initial.replace('A','?');
//            output.add(initial);
//        }
//        return output;
//    }
}









































        // LECTURE NOTES
//        int num = 5;
//        String[] cheeses = new String[4];
//        cheeses[0] = "Muenster";
//        cheeses[1] = "Swiss";
//        cheeses[2] = "Spray";
//        cheeses[3] = "Kraft American Singles";
//
//
//        for(String cheese : cheeses){
//            System.out.println(cheese);
//        }
//        // Same array iteration.
//        for(int i = 0; i < cheeses.length; i++){
//            System.out.println(cheeses[i]);
//        }
//        int[] nums = new int[6];
//        // iterates through an array with a length of 6 and fills each index with the number 17
//        Arrays.fill(nums, 17);
//        for(int n : nums){
//            System.out.println(n);
//        }
//
//        // compares both arrays; if identical(every index is the same) returns true
//        int[] nums2 = {17, 17, 17, 17, 17, 17};
//        System.out.println(Arrays.equals(nums, nums2));
//
//        // makes a copy of nums 2; copies first 3 indexes and assigns it to the new array nums 3. Prints out iteration.
//        int[] nums3 = Arrays.copyOf(nums2, 3);
//        for(int n : nums3){
//            System.out.println(n);
//        }
//
//        // prints out [ x , x , x] format for an array
//        System.out.println(Arrays.toString(nums3));
//
//        // sorts in numerical order or alphabetical order; either num or string
//        Arrays.sort(cheeses);
//        System.out.println(Arrays.toString(cheeses));
//
//        // 2D Array [x][y] x goes right, y goes down to isolate index
//        char [][] ticTacToeBoard = {
//                {'A', 'B', 'C'},
//                {'D', 'E', 'F'},
//                {'G', 'H', 'I'}
//        };
//
//        System.out.println(ticTacToeBoard[1][1]);
//        for (char[] row : ticTacToeBoard) {
//            System.out.println("+---+---+---+");
//
//            System.out.print("| ");
//
//            for (char n : row) {
//                System.out.print(n + " | ");
//            }
//
//            System.out.println();
//        }
//
//        System.out.println("+---+---+---+");

        // EXERCISES
//        What happens when you run the following code? Why is Arrays.toString necessary?
//          Necessary to print out array properly; otherwise prints out memory location of array
//
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
//        Create an array that holds 3 Person objects. Assign a new instance of the Person class
//        to each element. Iterate through the array and print out the name of each person in the array.
//        Create a static method named addPerson. It should accept an array of Person objects,
//        as well as a single person object to add to the passed array. It should return
//        an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.

//        String[] person = new String[3];
//        person[0] = "David";
//        person[1] = "Fer";
//        person[2] = "Sophia";
//        for(int i = 0; i < person.length; i++){
//            System.out.println(person[i]);
//        }
//        addPerson();



//    public static String addPerson(){
//        Person[] person = new Person[3];
//        person[0] = new Person("David");
//        person[1] = new Person("Fer");
//        person[2] = new Person("Sophia");
//        for(int i = 0; i < person.length; i++){
//            System.out.println(person[i]);
//        }
//
//        Scanner sc = new Scanner(System.in);
//        Person[] finalPerson = Arrays.copyOf(person, 4);
//        System.out.println("Please enter the name that you'd like added to the array.");
//        String addedPerson = sc.next();
//        finalPerson[3] = new Person(addedPerson);
//        for(int i = 0; i < finalPerson.length; i++){
//            System.out.println(finalPerson[i].getName());
//        }
//        return addPerson();
//    }

