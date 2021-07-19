package abstraction13.cloneables;

import java.util.Date;

public class House implements  Comparable<House>, Cloneable{

    private int id;
    private double area;
    java.util.Date whenBuild;

    public House() {
    }

    public House(int id, double area) {
        this.id = id;
        this.area = area;
        whenBuild = new java.util.Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Date getWhenBuild() {
        return whenBuild;
    }

    public void setWhenBuild(Date whenBuild) {
        this.whenBuild = whenBuild;
    }


    @Override
    public Object clone()
    {
        try {
            return super.clone();
        }catch (CloneNotSupportedException ex)
        {
            return null;
        }
    }

    @Override
    public int compareTo(House o) {
        if (area > o.area)
            return 1;
        else if (area < o.area)
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", area=" + area +
                ", whenBuild=" + whenBuild +
                '}';
    }
}
