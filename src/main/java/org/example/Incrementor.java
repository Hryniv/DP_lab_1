package org.example;

import org.example.models.Counter;

public class Incrementor extends Thread {
    private static volatile long executionTime;
    private boolean isRunning = true;
    private static Counter counter;

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        while (counter.getCount() < 100 && isRunning) {
            counter.increment();
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println(this.getName() + " execution time: " + (endTime - startTime));
        addExecutionTime(endTime - startTime);
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
        Incrementor.counter = counter;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }
}
