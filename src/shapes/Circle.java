package shapes;

public class Circle {
    private static double radius;
    private static int count;

    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
//        A=πr2
        return Math.PI * Math.pow(radius, 2);
    }
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
    public int getCount(){
        count++;
        return count;
    }
}








//Inside of src, create a directory named shapes. Inside of shapes, create a
//class named Circle. This class should have a private radius property
// that is set through the constructor, and various methods for getting information about the circle, detailed below.
//
//
//public Circle(double radius)
//public double getArea()
//public double getCircumference()