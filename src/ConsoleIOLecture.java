import java.sql.SQLOutput;
import java.util.Scanner;
public class ConsoleIOLecture {

    public static void main (String [] args) {
        String cohort = "Bigfoot";
        String timeOfDay = "morning";
        int week = 9;
        // %s is a placeholder for a string and %n is a placeholder for a new line. Printf is a method that allows us to print a formatted string.
//        System.out.printf("Good %s, %s!%n",  timeOfDay, cohort);
//        System.out.println("It's week " + week + " of " + cohort + "!");
//        float myFloat = 123.456f;
//        System.out.printf("My float is %.2f%n", myFloat);
//        System.out.println("will this be a new line?");
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a word");
//        String userinput = scanner.next();
////        System.out.println("The user enter: " + userinput);
//        System.out.printf("Your string was: %s, userinput);

        Scanner scanner = new Scanner(System.in);
        System.out.print(" True or False");
        String userInput=scanner.next();
        System.out.println("You entered");
    }
}
