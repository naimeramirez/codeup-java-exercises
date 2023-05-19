import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

//        addition(4,5);
//        subtraction(10,5);
//        multiplication(4,5);
//        division(10,2);
//        modulus(13,2);

//        int userInput = getInteger(1, 10);

//        getConfirm(userInput);

        diceSides();

    }

//    public static void addition (int x, int y) {
//        int result = x + y;
//        System.out.println(result);
//    }
//
//    public static void subtraction (int x, int y) {
//        int result = x - y;
//        System.out.println(result);
//    }
//
//    public static void multiplication (int x, int y) {
//        int result = x * y;
//        System.out.println(result);
//    }
//
//    public static void division (int x, int y) {
//        int result = x / y;
//        System.out.println(result);
//    }
//
//    public static void modulus (int x, int y) {
//        int result = x % y;
//        System.out.println(result);
//    }

//    public static int getInteger(int min, int max) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number from 1 to 10");
//        int userInput = sc.nextInt();
//        if (userInput < min || userInput > max) {
//            System.out.println("Invalid Number");
//            getInteger(min, max);
//        }
//        return userInput;
//    }

//    public static void getConfirm(int userInput) {
//        System.out.println(userInput);
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Do you want to continue?");
//        String confirm = sc.nextLine();
//
//        if (confirm.equalsIgnoreCase("y")) {
//            getFactorial(userInput);
//        }
//    }

//    public static void getFactorial(int userInput) {
//        long factorial = 1;
//        for (int i = 1; i <= userInput; i++) {
//            factorial = factorial * i;
//            System.out.println(factorial);
//        }
//    }

    public static void diceSides () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of sides for a pair of dice?");
        int inputSides = Integer.parseInt(sc.nextLine());
        System.out.println("Do you want to roll the dice?");
        String confirm = sc.nextLine();
        if (confirm.equalsIgnoreCase("y")) {
            rollDice(inputSides);
        }
    }

    public static void rollDice (int sides) {
        int sidesPerDice = sides / 2;
        int dice1 = 0;
        int dice2 = 0;
        int random1 = (int)(Math.random() * sidesPerDice + 1);
        int random2 = (int)(Math.random() * sidesPerDice + 1);

        int dice1Roll = dice1 + random1;
        int dice2Roll = dice2 + random2;

        System.out.println("First dice : " + dice1Roll);
        System.out.println("Second dice : " + dice2Roll);

        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want to roll again?");
        String confirm = sc.nextLine();
        if (confirm.equalsIgnoreCase("y")) {
            rollDice(sides);
        }
    }


}
