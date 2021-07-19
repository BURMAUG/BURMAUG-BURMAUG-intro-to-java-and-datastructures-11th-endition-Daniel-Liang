package abstraction13.interfaces;

public class Apple extends Fruits implements Edible{
    @Override
    public String howToEat() {
        return "JUST EAT";
    }

    @Override
    public boolean seedless() {
        return false;
    }

    @Override
    public boolean seed() {
        return true;
    }
}
