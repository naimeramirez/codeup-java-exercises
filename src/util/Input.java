package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input () {
        this.scanner = new Scanner(System.in);
    }

    public String getString () {
        return scanner.nextLine();
    }

    public boolean yesNo () {
        String input = scanner.nextLine().toLowerCase();
        return input.equals("y") || input.equals("yes");
    }

    public int getInt (int min, int max) {
        while (true) {
            System.out.println("Enter number between " + min + " - " + max);
            int userInput = scanner.nextInt();

            if (userInput >= min && userInput <= max) {
                return userInput;
            }
            System.out.println("Invalid number");
        }
    }

    public int getInt () {
        return scanner.nextInt();
    }

    public double getDouble (int min, int max) {
        while (true) {
            System.out.println("Enter number between " + min + " - " + max);

            double userInput = scanner.nextDouble();
            if (userInput >= min && userInput <= max) {
                return userInput;
            }
            System.out.println("Invalid number");
        }
    }

    public double getDouble () {
        return scanner.nextDouble();
    }

}