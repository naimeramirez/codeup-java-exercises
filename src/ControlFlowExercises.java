import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }

//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);

//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= 0);

//        long i = 2;
//        do {
//            System.out.println(i);
//            i = i * i;
//        } while (i <= 1000000);

//        for (int i = 5; i <= 15; i++) {
//            System.out.print(i + " ");
//        }

//        for (int i = 0; i <= 100; i += 2) {
//            System.out.println(i);
//        }

//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

//        for (long number = 2; number < 1_000_000; number *= number) {
//            System.out.println(number);
//        }

//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

        Scanner sc = new Scanner(System.in);

//        String userInput;
//        boolean confirm = true; // instead of string use boolean

//        do {
//            System.out.print("What number would you like to go up to? ");
//            int num = sc.nextInt();
//
//            System.out.println("\nHere is your table!\n");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//
//            for (int i = 1; i <= num; i++) {
//                int squared = i * i;
//                int cubed = i * i * i;
//                System.out.printf("%-6d | %-7d | %-5d\n", i, squared, cubed);
//            }
//
//            System.out.print("\nDo you want to continue? (y/n) ");
//            confirm = sc.next().equalsIgnoreCase("y");
//        } while (confirm);


        boolean confirm = true;

        do {
            int gradeNum = 0;
            String gradeLetter;

            do {
                System.out.println("Enter a grade:");
                gradeNum = sc.nextInt();
            } while ((gradeNum < 1) || (gradeNum > 100));

            if (gradeNum >= 88) {
                gradeLetter = "A";
            } else if (gradeNum >= 80) {
                gradeLetter = "B";
            } else if (gradeNum >= 67) {
                gradeLetter = "C";
            } else if (gradeNum >= 60) {
                gradeLetter = "D";
            } else {
                gradeLetter = "F";
            }

            System.out.println("Your grade is: " + gradeLetter);

            System.out.println("Do you want to continue?");
            confirm = sc.next().equalsIgnoreCase("y");
        } while (confirm);


    }
}
