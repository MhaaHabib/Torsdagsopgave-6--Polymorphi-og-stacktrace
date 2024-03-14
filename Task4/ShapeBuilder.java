import java.util.ArrayList;

public class ShapeBuilder {
    ArrayList<Shape> shapes = new ArrayList<>();

    public void addShape(Shape s) {
        shapes.add(s);
    }
    public double getTotalArea(){

        double sum = 0;
        // for hvert shape i shapes
        for(Shape shape : shapes){
            sum = sum + shape.getArea();

        }
        return sum;

        //for (int i = 0; i < shapes.size(); i++) {
           // sum = sum + shapes.get(i).getArea();
       // }


    }
}