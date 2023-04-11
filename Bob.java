public class Bob {
    Public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = "y";
        do {
            System.out.print("Ask A question to Bob: ");
            String question = scanner.next();
            String answer;

            if (question.endsWith ("?") || question.endsWith ("?!")) {
                System.out.println("Sure");
            } else if (question.endsWith ("!") {
                System.out.println("Whoa, chill out!");
            } else if (question.isBlank ())
                System.out.println("Fine. Be that way! ");
            } else {
            System.out.println("Whatever");
            }

            System.out.println(" " + answer);

            System.out.print("Do you want to ask another question? (y/n): ");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("y"));

        scanner.close();
    }
}
