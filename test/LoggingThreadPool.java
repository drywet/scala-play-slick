import play.core.NamedThreadFactory;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class LoggingThreadPool extends ThreadPoolExecutor {

    private final String name;

    public LoggingThreadPool(String name, int corePoolSize,
                             int maximumPoolSize,
                             long keepAliveTime,
                             TimeUnit unit,
                             BlockingQueue<Runnable> workQueue) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, new NamedThreadFactory(name));
        this.name = name;
    }

    private final AtomicLong busyThreads = new AtomicLong();

    protected void beforeExecute(Thread t, Runnable r) {
        //System.out.println(name + " busy threads + : " + busyThreads.incrementAndGet());
    }

    protected void afterExecute(Runnable r, Throwable t) {
        //System.out.println(name + " busy threads - :" + busyThreads.decrementAndGet());
    }

    protected void terminated() {
        System.out.println("Terminated");
    }
}