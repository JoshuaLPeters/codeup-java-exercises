package shapes;
import util.Input;

public class circleApp {
    public static void main(String[] args) {
        do{
            System.out.println("Please enter the radius of the circle.");
            Circle circle = new Circle(Input.getDouble());
            System.out.printf("The area for your circle is: %f%n", circle.getArea());
            System.out.printf("The circumference of your circle is: %f%n", circle.getCircumference());
            System.out.printf("The number of circles you've created is: %d%n", circle.getCount());
        }while(Input.yesNo());
    }
}
