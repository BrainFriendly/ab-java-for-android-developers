package Lesson3.decorator;

/**
 * Created by eduardomedina on 5/01/17.
 */
public class Frappuccino extends Bebida {

    public Frappuccino() {
        desc= "Bebida Frappuccino";
    }

    @Override
    public double cost() {
        return 12.00;
    }
}
