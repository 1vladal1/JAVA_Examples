package concurrency;

/**
 * Created by vlad on 25.03.14.
 */

import java.util.concurrent.*;

class ADaemon implements Runnable {
    public void run() {
        try {
            System.out.println("Running ADaemon");
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println("Exiting by InterruptedException");
        } finally {
            System.out.println("Should be execute?");
        }
    }
}

public class DaemonsDontRunFinally {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new ADaemon());
        t.setDaemon(true);
        t.start();
        TimeUnit.MILLISECONDS.sleep(100);
    }
}
