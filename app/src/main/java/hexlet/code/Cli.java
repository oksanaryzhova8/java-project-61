package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String name;

    public static void greet(Scanner scanner) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have you name? ");

        name = scanner.nextLine();

        System.out.println("Hello, " + name + "!");
    }
}
