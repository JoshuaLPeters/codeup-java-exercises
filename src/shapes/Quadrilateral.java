package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
//    public abstract void setLength();
////    public abstract void setWidth();


}


//    Inside of shapes, create an abstract Quadrilateral class that extends Shape and implements
//    Measurable. This class should have:
//    - Protected properties for length and width.
//    - A constructor that accepts two numbers for the length and width and sets those properties.
//    - Methods for getting the length and width.
//    - Abstract methods for setting the length and width.