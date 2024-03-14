public class Circle implements Shape{

    private double radius;

    public Circle(double circleVerdi){

        this.radius = circleVerdi;

    }


    @Override
    public double getArea() {
        return (radius*radius)*3.14;
    }
}
