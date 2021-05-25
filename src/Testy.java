import abstraction13.Circle;
import abstraction13.GeometricObject;
import abstraction13.Rectangle;

public class Testy {
    public static void main(String[] args) throws Exception {
        GeometricObject circle = new Circle(23);
        GeometricObject rect = new Rectangle("Red", true,23.0, 3.1, 23.1,22.22, 21.1);
        System.out.println(eq(circle, rect));
    }
    public static boolean eq(GeometricObject object, GeometricObject object2)
    {
        return object.getArea() == object2.getArea();
    }
}
