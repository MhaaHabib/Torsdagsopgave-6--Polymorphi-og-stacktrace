public class Square implements Shape{

    int length;

    int width;

    public Square(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length*width;
    }
}
