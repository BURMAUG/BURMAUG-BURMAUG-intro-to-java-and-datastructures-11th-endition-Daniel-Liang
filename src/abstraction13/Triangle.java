package abstraction13;

import java.util.Date;
import java.util.InputMismatchException;

public class Triangle extends GeometricObject implements Comparable<Triangle>{
    private int sideA;
    private int sideB;
    private int sideC;
    private int height;
    private String color;
    private Boolean isFilled;
    private java.util.Date whenCreate;

    public Triangle(String color, boolean filled, int sideA, int sideB, int sideC, int height) {
        super(color, filled);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled() {
        return isFilled;
    }

    public void setFilled(Boolean filled) {
        isFilled = filled;
    }

    public Date getWhenCreate() {
        return whenCreate;
    }

    public void setWhenCreate(Date whenCreate) {
        this.whenCreate = whenCreate;
    }

    @Override
    public double getArea() {
        return  (height*sideB)/2;
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public int compareTo(Triangle o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                ", height=" + height +
                ", color='" + getColor() + '\'' +
                ", isFilled=" + isFilled +
                ", whenCreate=" + getDateCreated() +
                '}';
    }
}

class Test{
    public static void main(String[] args) {
        double sideA = 0, sideB =0 , sideC =0 ;
        boolean flag = true;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        do {
            try {
                System.out.println("Please enter a value for side A : ");
                sideA = scanner.nextDouble();
                flag = false;
            }catch (InputMismatchException e)
            {
                System.err.println("Please Enter Correct value!");
                scanner.nextLine();
            }
        }while (flag);

        flag = true;

        do {
            try {
                System.out.println("Please enter a value for side B : ");
                sideB = scanner.nextDouble();
                flag = false;
            }catch (InputMismatchException e)
            {
                System.err.println("Please Enter Correct value!");
                scanner.nextLine();
            }
        }while (flag);

        flag = true;

        do {
            try {
                System.out.println("Please enter a value for side c : ");
                sideC = scanner.nextDouble();
                flag = false;
            }catch (InputMismatchException e)
            {
                System.err.println("Please Enter Correct value!");
                scanner.nextLine();
            }
        }while (flag);

        Triangle triangle = new Triangle("Red", true, (int)sideA, (int)sideB, (int)sideC, 23 );
        System.out.println(triangle.toString());
        System.out.println(triangle.getArea()+ " " +triangle.getDateCreated() + " " +triangle.getPerimeter());
    }

}