package movies;
import util.Input;
import java.util.Scanner;
import java.util.Arrays;
public class MoviesApplication {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie[] movieArray = MoviesArray.findAll();
        System.out.println("Welcome to the movies application!");
        int userInput;
        do{
            System.out.println("What would you like to do? Please enter a number 1-5.");
            System.out.println("1: Exit Application");
            System.out.println("2: View drama movies.");
            System.out.println("3: View horror movies.");
            System.out.println("4: View scifi movies.");
            System.out.println("5: View musical movies.");
            userInput = sc.nextInt();
            if(userInput == 2){
                for(int i = 0; i < movieArray.length; i++){
                    if (movieArray[i].getCategory().equalsIgnoreCase("drama")) {
                        System.out.println(movieArray[i].getMovie() + " --- " + movieArray[i].getCategory());
                    }
                }
            } else if(userInput == 3){
                for(int i = 0; i < movieArray.length; i++){
                    if (movieArray[i].getCategory().equalsIgnoreCase("horror")) {
                        System.out.println(movieArray[i].getMovie() + " --- " + movieArray[i].getCategory());
                    }
                }
            } else if(userInput == 4){
                for(int i = 0; i < movieArray.length; i++){
                    if (movieArray[i].getCategory().equalsIgnoreCase("scifi")) {
                        System.out.println(movieArray[i].getMovie() + " --- " + movieArray[i].getCategory());
                    }
                }
            } else if(userInput == 5) {
                for (int i = 0; i < movieArray.length; i++) {
                    if (movieArray[i].getCategory().equalsIgnoreCase("musical")) {
                        System.out.println(movieArray[i].getMovie() + " --- " + movieArray[i].getCategory());
                    }
                }
            } else if(userInput == 1){
                System.out.println("Thank you for using the movie application!");
            } else{
                System.out.println("please enter a number 1-5");
            }
        } while (userInput != 1);
    }
}
