package Lesson4.ThreadExamples.basic;

/**
 * Created by eduardo on 10/01/17.
 */
public class SomeRunnable implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println("thread name " + Thread.currentThread().getName() + " i= " + i);
        }
    }
}
