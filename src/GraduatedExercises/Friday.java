package GraduatedExercises;

import java.util.Scanner;

public class Friday {

    public static void emotion(){
        System.out.println("Press 1 if Mochi is happy, press 2 if Mochi is sad :(");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        emotion();
        int number = sc.nextInt();

        if(number == 1){
            System.out.println("Yay, Mochi is so happy!");
        } else {
            System.out.println("Aww... Mochi is sad... Grab his stick thing and play with him!");
        }
    }
}
