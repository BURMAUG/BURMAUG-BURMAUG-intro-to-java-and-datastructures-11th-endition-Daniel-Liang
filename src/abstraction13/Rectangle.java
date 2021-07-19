package abstraction13;

public class Rectangle extends GeometricObject implements Comparable<Rectangle>, Cloneable{

    //variables
    private double radius;
    private static int number0fObjects = 0;
    private double height;
    private double base;
    private double sideA;
    private double sideB;

    public Rectangle(String color, boolean filled, double radius, double height, double base, double sideA, double sideB) {
        super(color, filled);
        this.radius = radius;
        this.height = height;
        this.base = base;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static int getNumber0fObjects() {
        return number0fObjects;
    }

    public static void setNumber0fObjects(int number0fObjects) {
        Rectangle.number0fObjects = number0fObjects;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return (height*base)/ 2;
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + base;
    }

    @Override
    public int compareTo(Rectangle o) {
        return 0;
    }
}
