package Lesson4.ThreadExamples.samples;

import java.awt.*;

/**
 * Created by eduardomedina on 11/01/17.
 */
public class BeepRunnable implements Runnable {

    private Toolkit toolkit;

    public BeepRunnable() {
        toolkit = Toolkit.getDefaultToolkit();
    }

    @Override
    public void run() {

        for (int i = 0; i <3 ; i++) {
            System.out.println("Beep!");
            toolkit.beep();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
