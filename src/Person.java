import java.util.Scanner;
public class Person {
    private String name;
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

    }
        public Person(String name){
            this.name = name;
        }
        // returns the person's name
        public String getName(){
            return name;
        };

        // changes the name property to the passed value
        public void setName(String Name){
            this.name = name;
        };

        // prints a message to the console using the person's name
        public void sayHello(){
            System.out.printf("Hello from %s", name);
        };

    };

//    Object basics
//
//    Create Person class inside of src that has a private name property that is a string, and the following methods:
//
//    The class should have a constructor that accepts a String value and sets the person's name to the passed string.
//
//    Create a main method on the class that creates a new Person object and tests the above methods.








