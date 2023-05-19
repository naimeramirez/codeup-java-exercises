import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        int randomNum = (int) (Math.random() * 100 + 1);
        System.out.println(randomNum);

        guessNum(3, randomNum);
    }

    public static void guessNum(int guesses, int randomNum) {
        int numOfGuesses = guesses - 1;
        System.out.println("turns left: " + numOfGuesses);

        if (numOfGuesses > 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Guess the number between 1 - 100?");
            int userGuess = Integer.parseInt(sc.nextLine());

            checkGuess(numOfGuesses, randomNum, userGuess);
        } else {
            System.out.println("You exceeded the allowed number of guesses");
        }
    }

    public static void checkGuess(int numOfGuesses, int randomNum, int userGuess) {
        if (userGuess == randomNum) {
            System.out.println("GOOD GUESS!");
        } else if (userGuess < randomNum) {
            System.out.println("HIGHER");
            guessNum(numOfGuesses, randomNum);
        } else if (userGuess > randomNum) {
            System.out.println("LOWER");
            guessNum(numOfGuesses, randomNum);
        }
    }
}
