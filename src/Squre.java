//public class Squre implements Cloneable{
//    private double length;
//
//    public Squre(double length) {
//        this.length = length;
//    }
//
//    public double getLength() {
//        return length;
//    }
//
//    public void setLength(double length) {
//        this.length = length;
//    }
//    public Object clone()throws CloneNotSupportedException{
//        return super.clone();
//    }
//}
//
//class Mysq implements Cloneable{
//    public Squre s1 = new Squre(1.0);
//    public Squre s2 = new Squre(1.0);
//    public  Object clone(){
//        try {
//            Mysq clone = (Mysq) super.clone();
//            clone.s2 = (Squre) s2.clone();
//        } catch (CloneNotSupportedException e) {
//            return null;
//        }
//
//    }
//}
