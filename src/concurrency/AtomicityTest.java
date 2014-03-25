package concurrency;

/**
 * Created by vlad on 25.03.14.
 */

import java.util.concurrent.*;

public class AtomicityTest implements Runnable {
    private volatile int i = 0;
    public synchronized int getValue() {
        return i;
    }
    private synchronized void evenIncrement() {
        i++;
        Thread.yield();
        i++;
    }
    public void run() {
        while(true)
            evenIncrement();
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        AtomicityTest at = new AtomicityTest();
        exec.execute(at);
        while(true) {
            int val = at.getValue();
            if (val % 2 != 0) {
                System.out.println(val);
                System.exit(0);
            }
        }
    }
}
