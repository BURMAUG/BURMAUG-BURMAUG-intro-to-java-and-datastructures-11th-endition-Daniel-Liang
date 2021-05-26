package abstraction13.interfaces;


public abstract class Animal {
   private double weight;

   public Animal(double weight) {
      this.weight = weight;
   }

   public double getWeight() {
      return weight;
   }

   public void setWeight(double weight)throws IllegalArgumentException
   {
      if (weight <= 0)
         throw new IllegalArgumentException("CANNOT HAVE A WEIGHT ZERO OR LESS");
      else
         this.weight = weight;
   }

   abstract String sounds();
   abstract String kingdom();
   abstract Types type();
}
