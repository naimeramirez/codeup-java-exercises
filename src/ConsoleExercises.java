import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

//        double pi = 3.14159;

//        System.out.println(pi);
//        System.out.format("The Value of pi is approximately %s", pi);

//        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter something: ");
//        String userInput = scanner.next();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");


//        int userInput;
//        System.out.println("Enter and interger: ");
//        userInput = Integer.parseInt(scanner.nextLine());
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

//        System.out.println("Enter 3 words: ");
//        String word1 = sc.next();
//        String word2 = sc.next();
//        String word3 = sc.next();

//        System.out.println("You entered: ");
//        System.out.println(word1);
//        System.out.println(word2);
//        System.out.println(word3);

//        System.out.println("Enter a sentence: ");
//        String sentence = sc.nextLine();
//        System.out.println("You entered: ");
//        System.out.println(sentence);

        System.out.println("Enter length of classroom: ");
        String lengthInput = sc.nextLine();
        double length = Double.parseDouble(lengthInput);

        System.out.println("Enter width of classroom: ");
        String widthInput = sc.nextLine();
        double width = Double.parseDouble(widthInput);

        System.out.println("Area is: " + (length*width) + " SqFt");
        System.out.println("Perimeter: " + 2* (length*width)+ "ft");

    }
}
