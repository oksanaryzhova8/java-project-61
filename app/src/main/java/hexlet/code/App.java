package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n0 - Exit");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Your choice: " + choice);

        switch (choice) {
            case 1:
                Cli.greet(scanner);
                break;

            case 2:
                Even.parityCheck(scanner);
                break;

            case 3:
                Calc.calculate(scanner);
                break;

            case 4:
                GCD.find(scanner);
                break;

            case 5:
                Progression.missing(scanner);
                break;

            case 0:
                break;
            default:
                System.out.println("Unknown game number.");
        }
    }
}
