package abstraction13.interfaces;

public class Tiger extends Animal {

    public Tiger(double weight) {
        super(weight);
    }

    @Override
    String sounds() {
        return "Tigers make: roar or growl or snarl sounds";
    }

    @Override
    String kingdom() {
        return "Animal kingdom";
    }

    @Override
    Types type() {
        return Types.MAMMALS;
    }
}
class lion extends Animal{
    @Override
    String sounds() {
        return null;
    }

    @Override
    String kingdom() {
        return null;
    }

    @Override
    Types type() {
        return null;
    }
}
class Gorilla extends Animal{
    @Override
    String sounds() {
        return null;
    }

    @Override
    String kingdom() {
        return null;
    }

    @Override
    Types type() {
        return null;
    }
}
class Monkey extends Animal{
    @Override
    String sounds() {
        return null;
    }

    @Override
    String kingdom() {
        return null;
    }

    @Override
    Types type() {
        return null;
    }
}
class Chicken extends Animal implements Edible{
    @Override
    String sounds() {
        return null;
    }

    @Override
    String kingdom() {
        return null;
    }

    @Override
    Types type() {
        return null;
    }

    @Override
    public String howToEat() {
        return null;
    }
}
class Beef extends Animal implements Edible{
    @Override
    String sounds() {
        return null;
    }

    @Override
    String kingdom() {
        return null;
    }

    @Override
    Types type() {
        return null;
    }

    @Override
    public String howToEat() {
        return null;
    }
}
class Fish extends Animal implements Edible{
    @Override
    String sounds() {
        return null;
    }

    @Override
    String kingdom() {
        return null;
    }

    @Override
    Types type() {
        return null;
    }

    @Override
    public String howToEat() {
        return null;
    }
}
class Dog extends Animal{
    @Override
    String sounds() {
        return null;
    }

    @Override
    String kingdom() {
        return null;
    }

    @Override
    Types type() {
        return null;
    }
}
