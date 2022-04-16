package ru.niatomi;

import ru.niatomi.classes.MyRunnableThread;
import ru.niatomi.classes.MyThread;

/**
 * @author niatomi
 */
public class Application {
    public static void main(String[] args) {

        MyThread myThread1 = new MyThread();
        Thread thread = new Thread(new MyRunnableThread());
        myThread1.start();

        try {
//            thread.join();
            myThread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("123");

    }
}
