import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.printf("Addition => %d%n", addition(1, 20));
        System.out.println(subtraction(10, 5));
        System.out.println(multiplication(3, 2));
        System.out.println(division(0, 30));
        System.out.println(modulus(30, 4));
//        System.out.println(getInteger(1, 10));
        System.out.println(diceRoll());
    }

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

//    public static int getInteger(int min, int max) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number between 1 and 10: ");
//        long userInput = scanner.nextInt();
//
//        int i, fact = 1;
//        for (i = 1; i <= userInput; i++) {
//            fact = fact * i;
//        }
//
//        if (userInput >= min && userInput <= max) {
//            System.out.println("You entered: " + userInput);
//        } else {
//            System.out.println("Invalid input");
//        }
//        System.out.println("Factorial of " + userInput + " is: " + fact);
//        System.out.println("Do you want to continue? (y/n): ");
//        String choice = scanner.next();
//        if (choice.equalsIgnoreCase("y")) {
//            getInteger(1, 10);
//        } else {
//            System.out.println("Goodbye");
//        }
//        return (fact);
//    }
//}

    public static int diceRoll() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to roll the dice? If so Enter a number of sides for a pair of dice: ");
        int userInput = scanner.nextInt();
        int dice1 = (int) (Math.random() * userInput) + 1;
        int dice2 = (int) (Math.random() * userInput) + 1;
        int sum = dice1 + dice2;
        System.out.println("You rolled " + dice1 + " and " + dice2 + " for a total of " + sum);
        System.out.println("Do you want to roll dice again? (y/n): ");
        String choice = scanner.next();
        if (choice.equalsIgnoreCase("y")) {
            diceRoll();
        } else {
            System.out.println("Have a Good Day");
        }
        return (sum);
    }
}

