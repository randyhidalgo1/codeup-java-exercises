package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Enter a string:");
        return scanner.nextLine();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Do you want to continue?[y/n]");
        String userChoice = scanner.nextLine();
        return userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes");
    }

    // use this yesNo method in combination
    // with getString(). Pass the return from a getString()
    // to this method
    public boolean yesNo(String input){
        return input.trim().equalsIgnoreCase("y") || input.trim().equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        int userNum = scanner.nextInt();
        if (userNum >= min && userNum <= max) {
            return userNum;
        }
        return getInt(min, max);
    }

    public int getInt(){
        System.out.println("Enter an integer:");
        return scanner.nextInt();
    }

    public int getInt(String prompt){
        System.out.println(prompt);
        return scanner.nextInt();
    }

    public double getDouble(double min, double max){
        System.out.printf("Enter a number between %.1f and %.1f:", min, max);
        double userNum = scanner.nextDouble();
        if (userNum >= min && userNum <= max) {
            return userNum;
        }
        return getDouble(min, max);
    }

    public double getDouble(){
        System.out.println("Enter a number (decimals allowed):");
        return scanner.nextDouble();
    }

    public double getDouble(String prompt){
        System.out.println(prompt);
        return scanner.nextDouble();
    }

    public void getGhost(){
        System.out.println("");
        String ghost = scanner.nextLine();
    }

}








//package util;
//import java.util.Scanner;
//public class Input {
//    private Scanner scanner;
//    public Scanner getScanner() {
//        return scanner;
//    }
//    public Input(Scanner scanner) {
//        this.scanner = new Scanner(System.in);
//    }
//    public String getString(String prompt) {
//        if (prompt != null) {
//            System.out.print(prompt);
//        }
//        return this.scanner.nextLine();
//    }
//
//    public boolean yesNo(String prompt) {
//        if (prompt != null) {
//            System.out.print(prompt);
//        }
//        String input = this.scanner.next();
//        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
//    }
//
//    public int getInt(int min, int max, String prompt) {
//        int num;
//        do {
//            if (prompt != null) {
//                System.out.print(prompt);
//            }
//            while (!this.scanner.hasNextInt()) {
//                System.out.println("Invalid input. Please enter an integer.");
//                this.scanner.next();
//            }
//            num = this.scanner.nextInt();
//        } while (num < min || num > max);
//        return num;
//    }
//
//    public int getInt(String prompt) {
//        if (prompt != null) {
//            System.out.print(prompt);
//        }
//        while (!this.scanner.hasNextInt()) {
//            System.out.println("Invalid input. Please enter an integer.");
//            this.scanner.next();
//        }
//        return this.scanner.nextInt();
//    }
//
//    public double getDouble(double min, double max, String prompt) {
//        double num;
//        do {
//            if (prompt != null) {
//                System.out.print(prompt);
//            }
//            while (!this.scanner.hasNextDouble()) {
//                System.out.println("Invalid input. Enter a decimal number.");
//                this.scanner.next();
//            }
//            num = this.scanner.nextDouble();
//        } while (num < min || num > max);
//        return num;
//    }
//
//    public double getDouble(String prompt) {
//        if (prompt != null) {
//            System.out.print(prompt);
//        }
//        while (!this.scanner.hasNextDouble()) {
//            System.out.println("Invalid input. Enter a decimal number.");
//            this.scanner.next();
//        }
//        return this.scanner.nextDouble();
//    }
//
//    public static void main(String[] args) {
//        Input input = new Input(new Scanner(System.in));
//
//        System.out.println(input.yesNo("Do you want to continue? Yes or No?"));
//        String num = "Enter a integer between 1 and 10";
//        System.out.println(input.getInt(1, 10, num));
//        String dec = "Enter a decimal number between 1.0 and 10.0";
//        System.out.println(input.getDouble(1.0, 10.0, dec));
//    }
//}
//
