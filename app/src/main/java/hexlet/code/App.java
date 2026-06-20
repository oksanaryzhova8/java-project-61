package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        System.out.println("You choice: " + choice);

        switch (choice) {
            case 1:
                Cli.greet();
                break;

            case 2:
                Even.parityCheck();
                break;

            case 0:
                break;
            default:
                System.out.println("Unknown game number.");
        }
    }
}
