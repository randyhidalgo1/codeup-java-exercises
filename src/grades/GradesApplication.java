package grades;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student ruben = new Student("Ruben");
        ruben.addGrade(95);
        ruben.addGrade(80);
        ruben.addGrade(85);
        students.put("rubmendo", ruben);

        Student John = new Student("John");
        John.addGrade(100);
        John.addGrade(80);
        John.addGrade(90);
        students.put("johnlara", John);

        Student Tommy = new Student("Tommy");
        Tommy.addGrade(80);
        Tommy.addGrade(90);
        Tommy.addGrade(75);
        students.put("tommygunns", Tommy);

        Student fernando = new Student("Fernando");
        fernando.addGrade(75);
        fernando.addGrade(80);
        fernando.addGrade(75);
        students.put("frios", fernando);

        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students:\n");
        for (String username : students.keySet()) {
            System.out.print("|" + username + "| ");
        }
        System.out.println("\n\nWhat student would you like to see more information on?\n");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        while (true) {
            if (students.containsKey(userInput)) {
                Student student = students.get(userInput);
                System.out.println("\nName: " + student.name() + " - GitHub Username: " + userInput);
                System.out.println("Students Grade Average: " + student.getGradeAverage() + "\n");
            } else {
                System.out.println("\nSorry, no student found with the GitHub username of \"" + userInput + "\".\n");
            }
            System.out.println("Would you like to see another student? (y/n)");
            userInput = scanner.nextLine();
            if (!userInput.toLowerCase().startsWith("y")) {
                System.out.println("\nGoodbye, and have a wonderful day!");
                break;
            }
            System.out.println("\nWhat student would you like to see more information on?\n");
            userInput = scanner.nextLine();
        }
    }
        }


