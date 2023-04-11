import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
//
//         int i = 5;
//         while (i <= 15){
//             System.out.println(+i);
//             i++;
//         }
//
//        int j = 0;
//         do {
//             System.out.println(j);
//             j+=2;
//         } while (j < 100);
//
//// Alter your loop to count backwards by 5's from 100 to -10.
//        int k = 100;
//        do {
//            System.out.println(k);
//            k-=5;
//        } while (k >=-10);
//
//// Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//
//          long l = 2;
//            do {
//                System.out.println(l);
//                l*= l;
//            } while (l < 1000000);
//
//
//   for (int m = 100; m >=-10; m-=5) {
//           System.out.println(m);
//       }
//
//   for (long n = 2; n < 1000000; n*=n) {
//           System.out.println(n);
//       }
//
//// FizzBuzz
//        for (int o = 1; o <= 100; o++) {
//            System.out.println(o);
//        }
//
//        for (int p = 1; p <= 100; p *= 3) {
//            System.out.println("Fizz");
//        }
//
//        for (int q = 1; q <= 100; q *= 5) {
//            System.out.println("Buzz");
//        }
//
//        for (int r = 1; r <= 100; r *= 15) {
//            System.out.println("FizzBuzz");
//        }
//////       Table of Powers
//
//            Scanner scanner = new Scanner(System.in);
//            String choice = "y";
//
//            do {
//            System.out.print("Enter an number: ");
//            int num = scanner.nextInt();
//
//            System.out.printf("%-10s%-10s%s%n", "Number", "Squared", "Cubed");
//            System.out.printf("%-10s%-10s%s%n", "======", "=======", "=====");
//
//            for (int i = 1; i <= num; i++) {
//            int squared = i * i;
//            int cubed = i * i * i;
//            System.out.printf("%-10d%-10d%d%n", i, squared, cubed);
//            }
//
//            System.out.print("Do you want to continue? (y/n) ");
//            choice = scanner.next();
//            } while (choice.equalsIgnoreCase("y"));
//}


//    Convert given number grades into letter grades.
        Scanner scanner = new Scanner(System.in);
        String choice = "y";

        do {
            System.out.print("Enter a numerical grade from 0 to 100: ");
            int grade = scanner.nextInt();
            String letterGrade;

            if (grade >= 93) {
                letterGrade = "A+";
            } else if (grade >= 88) {
                letterGrade = "A-";
            } else if (grade >= 83) {
                letterGrade = "B+";
            } else if (grade >= 80) {
                letterGrade = "B-";
            } else if (grade >= 70) {
                letterGrade = "C+";
            } else if (grade >= 67) {
                letterGrade = "C-";
            } else if (grade >= 63) {
                letterGrade = "D+";
            } else if (grade >= 60) {
                letterGrade = "D-";
            } else {
                letterGrade = "F";
            }

            System.out.println("Your letter grade is: " + letterGrade);

            System.out.print("Do you want to continue? (y/n): ");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("y"));

        scanner.close();
    }
}