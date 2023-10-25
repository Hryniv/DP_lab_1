package org.example.models;

public class AsynchronousCounter implements Counter {
    public int count = 0;

    public void increment() {
        System.out.printf("%s incremented count from %d",
                Thread.currentThread().getName(), count);
        count++;
        System.out.printf(" to %d\n", count);
    }

    public int getCount() {
        return count;
    }
}
