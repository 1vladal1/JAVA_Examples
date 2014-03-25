package concurrency;

/**
 * Created by vlad on 25.03.14.
 */
import java.util.concurrent.*;

public class FixedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++)
            exec.execute(new LiftOff());
        System.out.println("Waiting for LiftOff");
        exec.shutdown();
    }
}
