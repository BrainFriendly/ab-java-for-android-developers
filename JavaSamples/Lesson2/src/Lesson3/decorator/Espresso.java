package Lesson3.decorator;

/**
 * Created by eduardomedina on 5/01/17.
 */
public class Espresso extends Bebida {

    public Espresso() {
        desc= "Bebida Espresso";
    }

    @Override
    public double cost() {
        return 10.00;
    }
}
