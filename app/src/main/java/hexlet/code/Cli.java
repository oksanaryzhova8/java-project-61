package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String name;
    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May i have you name? ");

        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();

        System.out.println("Hello, " + name + "!");
    }
}
