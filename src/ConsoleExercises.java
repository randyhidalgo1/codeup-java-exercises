import java.util.Scanner;
public class ConsoleExercises {

     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;
        scanner.useDelimiter("\n");
        System.out.printf("The value of pi is %.2f.%n", pi);

        System.out.println("Enter an Integer");
        int userInteger = scanner.nextInt();
        System.out.println("This your integer: " + userInteger);

        System.out.println("Enter 3 words");
        String words = scanner.nextLine();
        System.out.println("The user entered: " + words);

        System.out.println("Enter a sentence");
        String nextSentence = scanner.nextLine();
        System.out.println((nextSentence));

        System.out.println("Enter the length and width of the classroom");
        String length = scanner.nextLine();
        String width = scanner.nextLine();
        System.out.println("The area of the classroom is: " + Integer.parseInt(length) * Integer.parseInt(width));
        System.out.println("The perimeter of the classroom is: " + (Integer.parseInt(length) * 2 +  (Integer.parseInt(width)) * 2));


     }
}
