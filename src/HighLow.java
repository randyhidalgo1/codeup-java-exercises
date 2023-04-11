import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 101);
        int userGuess;
        int numberOfGuesses = 0;
        boolean hasWon = false;

        System.out.println("Try to guess a my number it's between 1 and 100. Good luck!!!");
        while (!hasWon) {
            System.out.print("What's your guess? ");
            userGuess = scanner.nextInt();
            numberOfGuesses++;
            if (userGuess < randomNumber) {
                System.out.println("HIGHER");
            } else if (userGuess > randomNumber) {
                System.out.println("LOWER");
            } else {
                hasWon = true;
                System.out.println("GOOD GUESS! The number was " + randomNumber);
                System.out.println("It only took you " + numberOfGuesses + " guesses. Haha!");
            }
        }
    }
}
