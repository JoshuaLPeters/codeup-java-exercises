package shapes;

public class ShapedTest {


    public static void main(String[] args) {

        Measurable myShape = new Rectangle(5, 4);
        Measurable myShapeTwo = new Square(4);
        System.out.println(myShape.getArea());
        System.out.println(myShapeTwo.getPerimeter());
    }
}
