package concurrency;

/**
 * Created by vlad on 25.03.14.
 */
import java.util.concurrent.*;

public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++)
            exec.execute(new LiftOff());
        exec.shutdown();
        System.out.println("Waiting for LiftOff");
    }
}
