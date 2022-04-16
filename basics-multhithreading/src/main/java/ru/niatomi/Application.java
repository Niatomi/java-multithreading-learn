package main.java.ru.niatomi;

import main.java.ru.niatomi.classes.MyRunnableThread;
import main.java.ru.niatomi.classes.MyThread;

/**
 * @author niatomi
 */
public class Application {
    public static void main(String[] args) {

        MyThread myThread1 = new MyThread();
        Thread thread = new Thread(new MyRunnableThread());
        myThread1.start();

        try {
            myThread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("123");

    }
}
