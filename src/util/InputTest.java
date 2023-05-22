package util;

public class InputTest {

    public static void main(String[] args) {
        Input userInput = new Input();

        System.out.println("getString");
        String userString = userInput.getString();
        System.out.println("String: " + userString);

        System.out.println("yesNo");
        boolean userYesNo = userInput.yesNo();
        System.out.println("Yes: " + userYesNo);

        System.out.println("getInt int min, int max");
        int userIntMinMax = userInput.getInt(1,6);
        System.out.println("Int: " + userIntMinMax);

        System.out.println("getInt");
        int userInt = userInput.getInt();
        System.out.println("Int: " + userInt);

        System.out.println("getDouble double min, double max");
        double userDoubleMinMax = userInput.getDouble(1,6);
        System.out.println("Double: " + userDoubleMinMax);

        System.out.println("getDouble");
        double userDouble = userInput.getDouble();
        System.out.println("Double: " + userDouble);



    }
}
