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

    public double getDouble (double min, double max) {
        while (true) {
            System.out.println("Enter number between " + min + " - " + max);

            String userInput = getString();
            try {
                double userNum = Double.valueOf(userInput);
                if (userNum >= min && userNum <= max) {
                    return userNum;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
            }
        }
    }

    public double getDouble () {
        return scanner.nextDouble();
    }

    public int getInt(String s, int x, int y) {
        while (true) {
            System.out.println("Please enter a number between " + s + " and " + y);
            String userInput = getString();
            try {
                int num = Integer.valueOf(userInput);
                if (num < x || num > y) {
                    System.out.println("Input out of range. Please try again.");
                } else {
                    return num;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }

    public double getDouble(String s, double x, double y) {
        while (true) {
            System.out.println("Please enter a number between " + s + " and " + y);
            String userInput = getString();
            try {
                double num = Double.valueOf(userInput);
                if (num < x || num > y) {
                    System.out.println("Input out of range. Please try again.");
                } else {
                    return num;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }
}
