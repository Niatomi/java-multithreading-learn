package ru.niatomi;

import ru.niatomi.classes.Counter;

/**
 * @author niatomi
 */
public class JointCounterSyncByClassApplication {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread incrementThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++)
                counter.increment();

                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });

        Thread decrementThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++)
                counter.decrement();

                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        try {
            incrementThread.start();
            decrementThread.start();
            incrementThread.join();
            decrementThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter.getX());
    }
}
