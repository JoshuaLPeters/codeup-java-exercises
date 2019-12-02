import java.util.Arrays;
import java.util.Random;
public class ServerNameGenerator {


    public static void randomElement(){
        Random rand = new Random();
        int randomNumber = rand.nextInt(10);
        String adjective = new String();
        String noun = new String();

        String[] adjectives = new String[10];
        adjectives[0] = "Merciless";
        adjectives[1] = "Wrathful";
        adjectives[2] = "Deadly";
        adjectives[3] = "Brutal";
        adjectives[4] = "Primal";
        adjectives[5] = "Furious";
        adjectives[6] = "Relentless";
        adjectives[7] = "Vicious";
        adjectives[8] = "Tyrannical";
        adjectives[9] = "Malevolent";
        for(int i = 0; i < adjectives.length; i++) {
            if(i == randomNumber){
                adjective = adjectives[i];
            }
        }

        randomNumber = rand.nextInt(10);
        String[] nouns = new String[10];
        nouns[0] = "Runescaper";
        nouns[1] = "World of Warcrafter";
        nouns[2] = "Gamer";
        nouns[3] = "cat";
        nouns[4] = "dog";
        nouns[5] = "Streamer";
        nouns[6] = "Software-Developer";
        nouns[7] = "Heaven";
        nouns[8] = "Hell";
        nouns[9] = "Rainbow";
        for(int x = 0; x < nouns.length; x++) {
            if(x == randomNumber){
                noun = nouns[x];
            }
        }
        System.out.println(adjective + " " + noun);
    }


    public static void main(String[] args) {
        randomElement();
    }
}
