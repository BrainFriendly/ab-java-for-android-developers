package Lesson3.factory;

/**
 * Created by eduardo on 06/01/17.
 */
public class BaseBallField implements Field {
    @Override
    public void drawField() {
        System.out.println("Dibujando un campo de BaseBall");
    }
}
