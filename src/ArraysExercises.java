import java.util.Scanner;
import java.util.Arrays;
public class ArraysExercises {


    public static void main(String[] args) {

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
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
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
        addPerson();


    }
    public static String addPerson(){
        Person[] person = new Person[3];
        person[0] = new Person("David");
        person[1] = new Person("Fer");
        person[2] = new Person("Sophia");
        for(int i = 0; i < person.length; i++){
            System.out.println(person[i]);
        }

        Scanner sc = new Scanner(System.in);
        Person[] finalPerson = Arrays.copyOf(person, 4);
        System.out.println("Please enter the name that you'd like added to the array.");
        String addedPerson = sc.next();
        finalPerson[3] = new Person(addedPerson);
        for(int i = 0; i < finalPerson.length; i++){
            System.out.println(finalPerson[i].getName());
        }
        return addPerson();
    }
}
