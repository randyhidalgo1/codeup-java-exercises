package util;

import java.util.Scanner;

public class Input {
    private final Scanner scanner;

    public Scanner getScanner() {
        return scanner;
    }

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString(String prompt) {
        if (prompt != null) {
            System.out.print(prompt);
        }
        return this.scanner.nextLine();
    }

    public boolean yesNo(String prompt) {
        if (prompt != null) {
            System.out.print(prompt);
        }
        String input = this.scanner.next();
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max, String prompt) {
        int num;
        do {
            if (prompt != null) {
                System.out.print(prompt);
            }
            while (!this.scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                this.scanner.next();
            }
            num = this.scanner.nextInt();
        } while (num < min || num > max);
        return num;
    }

    public int getInt(String prompt) {
        if (prompt != null) {
            System.out.print(prompt);
        }
        while (!this.scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            this.scanner.next();
        }
        return this.scanner.nextInt();
    }

    public double getDouble(double min, double max, String prompt) {
        double num;
        do {
            if (prompt != null) {
                System.out.print(prompt);
            }
            while (!this.scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a decimal number.");
                this.scanner.next();
            }
            num = this.scanner.nextDouble();
        } while (num < min || num > max);
        return num;
    }

    public double getDouble(String prompt) {
        if (prompt != null) {
            System.out.print(prompt);
        }
        while (!this.scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a decimal number.");
            this.scanner.next();
        }
        return this.scanner.nextDouble();
    }
}

