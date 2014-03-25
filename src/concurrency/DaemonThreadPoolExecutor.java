package concurrency;

/**
 * Created by vlad on 25.03.14.
 */
import sun.nio.ch.ThreadPool;

import java.util.concurrent.*;

public class DaemonThreadPoolExecutor extends ThreadPoolExecutor{
    public DaemonThreadPoolExecutor() {
        super(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), new DaemonThreadFactory());
    }
}
