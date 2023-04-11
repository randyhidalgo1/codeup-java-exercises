import java.util.Scanner;

public class StringExercise {

    public static void main(String[] args) {
        String message1 = "We don't need no education\nWe don't need no thought control";
        System.out.println(message1);
        String message2 = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(message2);
        String message3 = "In windows, the main drive is usually C:\\";
        System.out.println(message3);
        String message4 = "I can do backslashes \\, double backslashes \\\\,\nand the amazing triple backslash \\\\\\!";
        System.out.println(message4);




                Scanner scanner = new Scanner(System.in);
                String choice = "y";
        do {
                System.out.print("Ask A question: ");
                String question = scanner.next();
                String answer;

                if (question == "?") {
                answer = "Sure";
                } else if (question == "!") {
                answer = "Whoa, chill out!";
                } else if (question == " ") {
                answer = "Fine. Be that way! ";
                } else {answer = "Whatever";
                }

                System.out.println(" " + answer);

                System.out.print("Do you want to ask another question? (y/n): ");
                choice = scanner.next();
                } while (choice.equalsIgnoreCase("y"));

                scanner.close();
                }
                }
