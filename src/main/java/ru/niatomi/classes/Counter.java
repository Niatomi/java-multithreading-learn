package ru.niatomi.classes;

/**
 * @author niatomi
 */
public class Counter {
    private int x;

    public Counter() {
        this.x = 0;
    }

    public int getX() {
        return x;
    }

    public synchronized void increment() {
        this.x++;
    }

    public synchronized void decrement() {
        this.x--;
    }

}
