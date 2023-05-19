import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

        addition(4,5);
        subtraction(10,5);
        multiplication(4,5);
        division(10,2);
        modulus(13,2);

        getInteger(1, 10);

    }

    public static void addition (int x, int y) {
        int result = x + y;
        System.out.println(result);
    }

    public static void subtraction (int x, int y) {
        int result = x - y;
        System.out.println(result);
    }

    public static void multiplication (int x, int y) {
        int result = x * y;
        System.out.println(result);
    }

    public static void division (int x, int y) {
        int result = x / y;
        System.out.println(result);
    }

    public static void modulus (int x, int y) {
        int result = x % y;
        System.out.println(result);
    }

    public static int getInteger (int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 10");
        int userInput = sc.nextInt();
        if(userInput < min || userInput > max) {
            System.out.println("Invalid Number");
            return getInteger(min, max);
        }
        return userInput;
    }

    public static int getFactorial (int num) {
        System.out.println(num);
        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want to get the factorial?");
        String confirm = sc.nextLine();

        if(confirm.equalsIgnoreCase("y")) {

        }
        return num;
    }


}
