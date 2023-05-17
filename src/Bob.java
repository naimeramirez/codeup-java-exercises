import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String confirm;

        do {
            System.out.println("Say something to Bob");
            String userInput = sc.nextLine();
            String response;

            if(userInput.endsWith("?")) {
                response = "Sure.";
            } else if (userInput.endsWith("!")) {
                response = "Whoa, chill out!";
            } else if (userInput.isEmpty()) {
                response = "Fine. Be that way!";
            } else {
                response = "Whatever";
            }

            System.out.println("Bob: \n" + response);

            System.out.println("Do you want to continue?");
            confirm = sc.nextLine();

        } while (confirm.equals("y"));



    }
}
