package org.example;

import org.example.models.Counter;

public class Worker extends Thread {
    private static volatile long executionTime;
    private volatile boolean isRunning = true;
    private volatile static Counter counter; // у всіх потоків один обєкт для додавання
    private volatile static int limit; // у вміх потокі одна межа для додавання

    public static void setLimit(int limit) {
        Worker.limit = limit;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        while (counter.getCount() < limit) {
            if (isRunning) {
                counter.increment();
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println(this.getName() + " execution time: " + (endTime - startTime));
        //addExecutionTime(endTime - startTime);
    }

    private static void addExecutionTime(long time) {
        if (executionTime < time) {
            executionTime = time;
        }
    }

    public static long getExecutionTime() {
        return executionTime;
    }

    public static void setCounter(Counter counter) {
        Worker.counter = counter;
    }

    public static Counter getCounter() {
        return counter;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + " Priority: " + this.getPriority();
    }
}
