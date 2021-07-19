//package abstraction13.interfaces;
//
//
//public abstract class Animal {
//   private double weight;
//   private Name name;
//   public final int as;
//   public Animal(double weight, int as) {
//      this.weight = weight;
//      this.as = as;
//   }
//
//   public Animal(double weight, Name name) {
//      this.weight = weight;
//      this.name = name;
//   }
//
//   public Name getName() {
//      return name;
//   }
//
//   public void setName(Name name) {
//      this.name = name;
//   }
//
//   public double getWeight() {
//      return weight;
//   }
//
//   public void setWeight(double weight)throws IllegalArgumentException
//   {
//      if (weight <= 0)
//         throw new IllegalArgumentException("CANNOT HAVE A WEIGHT ZERO OR LESS");
//      else
//         this.weight = weight;
//   }
//
//   abstract String sounds();
//   abstract String kingdom();
//   abstract Types type();
//}
