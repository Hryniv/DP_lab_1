package org.example.models;

public class SynchronousCounter implements Counter {
    private int count = 0;

    public synchronized void increment() {
        System.out.printf("%s incremented count from %d", Thread.currentThread().getName(), count);
        count++;
        System.out.printf(" to %d\n", count);
    }

    public synchronized int getCount() {
        return count;
    }
}
