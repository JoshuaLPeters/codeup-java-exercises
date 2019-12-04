package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(double length, double width) {
        super(length, width);
        this.length = length;
        this.width = width;
    }
    public double getPerimeter(){
        return width + width + length + length;
    };
    public double getArea(){
        return width * length;
    }

}

