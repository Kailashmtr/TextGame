import java.util.Scanner;

public class TextGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Text Game!");

        String name = getName(scanner);
        int health = 100;
        int attack = 10;
        int defense = 5;

        System.out.println("Hello, " + name + "! Your health is " + health + ", attack is " + attack
                + ", and defense is " + defense + ".");

        while (health > 0) {
            System.out.println("What do you want to do? (f)ight or (r)un away?");
            String choice = scanner.nextLine().toLowerCase();

            if (choice.equals("f")) {
                int damage = (int) (Math.random() * (attack - defense + 1)) + defense;
                health -= damage;
                System.out.println("You dealt " + damage + " damage to the enemy. Your health is now " + health + ".");
            } else if (choice.equals("r")) {
                System.out.println("You ran away from the enemy.");
                break;
            } else {
                System.out.println("Invalid input. Please enter 'f' to fight or 'r' to run away.");
            }
        }

        if (health <= 0) {
            System.out.println("You have been defeated. Game over.");
        } else {
            System.out.println("Congratulations, you have won the game!");
        }

        scanner.close();
    }

    private static String getName(Scanner scanner) {
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        return name;
    }
}
