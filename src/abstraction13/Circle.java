package abstraction13;


public class Circle extends GeometricObject{

    private static int number_of_objects = 0;
    private double radius;

    public Circle( double radius)
    {
       setRadius(radius);
       number_of_objects++;
    }
    public Circle()
    {
        this(1.0);
    }
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        setRadius(radius);
        number_of_objects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws IllegalArgumentException {
        if (radius <= 0)
            throw new IllegalArgumentException("RADIUS CAN'T BE LESS THAN OR EQUAL TO ZER0");
        else
            this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2)*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    public static int getNumber_of_objects() {
        return number_of_objects;
    }

    public void setNumber_of_objects(int number_of_objects) {
        this.number_of_objects = number_of_objects;
    }


    //MAIN
    public static void main(String[] args) {
        try{
            GeometricObject circle = new Circle(2);
            GeometricObject circle2 = new Circle(23);
            GeometricObject circle3 = new Circle(23);
            GeometricObject circle4 = new Circle("Red", true, 23);
            GeometricObject circle5 = new Circle(-1);
        }catch (IllegalArgumentException ex)
        {
            System.out.println("++++++++===========================+++++++++++++");
            System.out.println(ex.getMessage());
        }finally {
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        }
        System.out.println(getNumber_of_objects());
    }
}
