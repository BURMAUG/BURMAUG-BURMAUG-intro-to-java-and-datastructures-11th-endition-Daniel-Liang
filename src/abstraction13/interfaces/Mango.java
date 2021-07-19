package abstraction13.interfaces;

public class Mango extends Fruits implements Edible{
    boolean seed = true;
    @Override
    public String howToEat() {
        return "make sure its ripe, wash, and dont eat seed";
    }

    @Override
    public boolean seedless() {
        return !seed;
    }

    @Override
    public boolean seed() {
        return seed;
    }
}
