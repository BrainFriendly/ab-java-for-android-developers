package Lesson4.ThreadExamples.basic;

import java.util.Scanner;

/**
 * Created by eduardo on 10/01/17.
 */
public class MainThread {

    public static void main(String[] args) {
        System.out.println("Threads samples");

        //RUNNABLES

        Runnable runnable = new SomeRunnable();
        Thread threadA = new Thread(runnable);
        Thread threadB = new Thread(runnable);

//        runnable.run();

//        threadA.start();
//        threadB.start();

        //THREADS

//        Thread threadC= new SomeThread();
//        threadC.setName("My Thread");
//        threadC.start();

        //SLEEP

//        Runnable someSleepRunnable= new SomeSleepRunnable();
//        Thread threadD= new Thread(someSleepRunnable);
//        threadD.start();

        //STOP

        MyThread myThread = new MyThread();
        myThread.start();

        System.out.print("Please enter username and hit enter: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Welcome " + name);
        myThread.shutdown();


        //JOIN
        //Run MainJoin

    }
}
