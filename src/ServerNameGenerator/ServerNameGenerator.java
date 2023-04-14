package ServerNameGenerator;
import java.util.Random;
public class ServerNameGenerator {
    public static void main(String[] args) {

        String[] adjectives = {"beautiful", "clever", "delightful", "elegant", "fierce", "graceful", "happy", "innovative", "jolly"};
        String[] nouns = {"apple", "book", "chair", "dog", "elephant", "flower", "guitar", "house", "island", "jacket"};
        System.out.println("Here is your server name:");
        System.out.println(getRandomElement(adjectives) + "-" + getRandomElement(nouns));
    }
    private static String getRandomElement(String[] array) {
        return array[new Random().nextInt(array.length)];
    }
}

