package abstraction13.interfaces;

public class TestingInterface {
    public static void main(String[] args) {
        Animal[] animals = {new Beef(23),
                            new Chicken(2),
                            new Dog(90),
                            new Gorilla(200),
                            new lion(1002),
                            new Tiger(789),
                            new Fish(.2)};
        for(int i = 0; i < animals.length; i++)
        {
            if (animals[i] instanceof Animal)
            {
                System.out.println("Animal (");
                System.out.println(animals[i].kingdom());
                System.out.println(")");
            }
            if (animals[i] instanceof  Edible) {
                System.out.println("Edibles (");
                System.out.println(((Edible) animals[i]).howToEat());
                System.out.println(")");
            }
        }
    }
}
