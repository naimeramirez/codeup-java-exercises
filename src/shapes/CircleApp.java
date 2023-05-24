package shapes;
import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input userInput = new Input();
        boolean confirm;

        do {
            System.out.println("Enter the radius of the circle: ");
            double radius = userInput.getDouble();

            Circle circle = new Circle(radius);
            System.out.println("Circumference is: " + circle.getCircumference());
            System.out.println("Area is: " + circle.getArea());

            System.out.println("Continue?");
            confirm = userInput.yesNo();
        } while (confirm);


    }
}
