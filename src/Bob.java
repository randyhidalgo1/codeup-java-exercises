import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        System.out.println("Ask A question to Bob: ");
        Scanner input = new Scanner(System.in);
        String question = input.nextLine();

            if (question.endsWith("?") || question.endsWith("?!")) {
                System.out.println("Sure");
            } else if (question.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (question.isEmpty()) {
                System.out.println("Fine. Be that way! ");
            } else {
                System.out.println("Whatever");
            }
        }
    }

