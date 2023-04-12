import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Are you ready to start? Type 'yes' to begin.");
        String readyToStart = scanner.nextLine();

        if (readyToStart.equalsIgnoreCase("yes")) {
            System.out.println("Welcome to the adventure! What's your name?");
            String playerName = scanner.nextLine();
            int heroHealth;
            int heroAttack;
            int heroPotions;
            int enemyHealth;
            int enemyAttack;

            System.out.println("Enter your hero stats: Health, Attack Points, Potions (separated by commas)");
            String[] heroStats = scanner.nextLine().split(",");
            heroHealth = Integer.parseInt(heroStats[0]);
            heroAttack = Integer.parseInt(heroStats[1]);
            heroPotions = Integer.parseInt(heroStats[2]);

            System.out.println("Enter the enemy stats: Health, Attack Points");
            String[] enemyStats = scanner.nextLine().split(",");
            enemyHealth = Integer.parseInt(enemyStats[0]);
            enemyAttack = Integer.parseInt(enemyStats[1]);

            // display enemy and hero stats
            System.out.println("Enemy stats: Health=" + enemyHealth + " Attack Points=" + enemyAttack);
            System.out.println("Hero stats: " + playerName + " Health=" + heroHealth + " Attack Points=" + heroAttack + " Potions=" + heroPotions);

            while (heroHealth > 0 && enemyHealth > 0) {
                System.out.println("What do you want to do? Type 'attack' to attack, 'potion' to use a health potion, or 'run' to end the game.");
                String action = scanner.nextLine();

                switch (action.toLowerCase()) {
                    case "attack":
                }
            }
        }
    }
}