package concurrency;

/**
 * Created by vlad on 25.03.14.
 */

import java.util.concurrent.*;
import java.util.*;

class Accesor implements Runnable {
    private final int id;
    public Accesor(int id) {
        this.id = id;
    }
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            ThreadLocalVariableHolder.increment();
            System.out.println(this);
            Thread.yield();
        }
    }
    public String toString() {
        return "#" + id + " " + ThreadLocalVariableHolder.get();
    }
}

public class ThreadLocalVariableHolder {
    private static ThreadLocal<Integer> value = new ThreadLocal<Integer>() {
        private Random rand = new Random(47);
        protected synchronized Integer initialValue() {
            return rand.nextInt(10000);
        }
    };
    public static void increment() {
        value.set(value.get() + 1);
    }
    public static int get() {
        return value.get();
    }

    public static void main(String[] args) throws Exception {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++)
            exec.execute(new Accesor(i));
        TimeUnit.SECONDS.sleep(3);
        exec.shutdownNow();
    }

}
