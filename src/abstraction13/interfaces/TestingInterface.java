package abstraction13.interfaces;

public class TestingInterface {
    public static void main(String[] args) {
        Animal[] animals = {
                new Fish(12,Name.FISH),
                new Beef(480, Name.BEEF),
                new lion(897, Name.LION),
                new Tiger(1283, Name.TIGER),
                new Chicken(23, Name.CHICKEN),
                new Gorilla(568, Name.GORILLA),
                new Monkey(231, Name.MONKEY)
        };
        for(int i = 0; i < animals.length; i++)
        {
            if (animals[i] instanceof Animal)
                System.out.println(animals[i].kingdom() + " " + animals[i].getName());
            if (animals[i] instanceof  Edible)
                System.out.println(((Edible) animals[i]).howToEat() + " " + animals[i].getName());

        }
    }
}
