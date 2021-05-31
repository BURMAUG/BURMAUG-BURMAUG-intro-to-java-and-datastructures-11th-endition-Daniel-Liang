package abstraction13;

public class Triangle extends GeometricObject implements Comparable<Triangle>{
    private int sideA;
    private int sideB;
    private int sideC;
    private String color;
    private Boolean isFilled;
    private java.util.Date whenCreate;

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public int compareTo(Triangle o) {
        return 0;
    }
}
