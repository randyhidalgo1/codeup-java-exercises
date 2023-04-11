public class MethodsExercisesLecture {
    public static void main(String[] args) {
        System.out.println(sayHello("Randy"));
        System.out.println(returnThree());
        System.out.println(highFive("Randy", "Randy"));
        count(5);
    }

    public static String sayHello(String name) {
        String message = "Hello, " + name + "!";
        return message;

    }

    public static int returnThree() {
        return 3;

    }
    public static String highFive (String name1, String name2) {
        String message = "High five, " + name1 + " and " + name2 + "!";
        return message;
    }

    public static void count(int n) {
       if (n <=0) {
            System.out.println("All Done!");
            return;
        }
        System.out.println(n);
       count(n - 1);
    }
}



