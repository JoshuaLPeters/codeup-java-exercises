import java.util.Scanner;
public class Person {
    private String name;

    public static void main(String[] args) {
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
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








