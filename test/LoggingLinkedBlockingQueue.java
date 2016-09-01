import java.util.Collection;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

public class LoggingLinkedBlockingQueue<T> extends LinkedBlockingQueue<T> {
    private final String name;

    public LoggingLinkedBlockingQueue(String name) {
        this.name = name;
    }

    @Override
    public void put(T t) throws InterruptedException {
        System.out.println(name + " size0: " + size() + " thread: " + Thread.currentThread().getName());
        new Exception().printStackTrace();
        super.put(t);
    }

    @Override
    public boolean offer(T t, long timeout, TimeUnit unit) throws InterruptedException {
        System.out.println(name + " size0: " + size() + " thread: " + Thread.currentThread().getName());
        new Exception().printStackTrace();
        return super.offer(t, timeout, unit);
    }

    @Override
    public boolean offer(T t) {
        System.out.println(name + " size0: " + size() + " thread: " + Thread.currentThread().getName());
        new Exception().printStackTrace();
        return super.offer(t);
    }

    @Override
    public T take() throws InterruptedException {
        System.out.println(name + " size0: " + size() + " thread: " + Thread.currentThread().getName());
        new Exception().printStackTrace();
        return super.take();
    }

    @Override
    public T poll(long timeout, TimeUnit unit) throws InterruptedException {
        System.out.println(name + " size0: " + size() + " thread: " + Thread.currentThread().getName());
        new Exception().printStackTrace();
        return super.poll(timeout, unit);
    }

    @Override
    public T poll() {
        System.out.println(name + " size0: " + size() + " thread: " + Thread.currentThread().getName());
        new Exception().printStackTrace();
        return super.poll();
    }

    @Override
    public boolean remove(Object o) {
        System.out.println(name + " size0: " + size() + " thread: " + Thread.currentThread().getName());
        new Exception().printStackTrace();
        return super.remove(o);
    }

    @Override
    public void clear() {
        System.out.println(name + " size0: " + size() + " thread: " + Thread.currentThread().getName());
        new Exception().printStackTrace();
        super.clear();
    }

    @Override
    public int drainTo(Collection<? super T> c) {
        System.out.println(name + " size0: " + size() + " thread: " + Thread.currentThread().getName());
        new Exception().printStackTrace();
        return super.drainTo(c);
    }

    @Override
    public int drainTo(Collection<? super T> c, int maxElements) {
        System.out.println(name + " size0: " + size() + " thread: " + Thread.currentThread().getName());
        new Exception().printStackTrace();
        return super.drainTo(c, maxElements);
    }

    @Override
    public boolean add(T t) {
        System.out.println(name + " size0: " + size() + " thread: " + Thread.currentThread().getName());
        new Exception().printStackTrace();
        return super.add(t);
    }

    @Override
    public T remove() {
        System.out.println(name + " size0: " + size() + " thread: " + Thread.currentThread().getName());
        new Exception().printStackTrace();
        return super.remove();
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        System.out.println(name + " size0: " + size() + " thread: " + Thread.currentThread().getName());
        new Exception().printStackTrace();
        return super.addAll(c);
    }

    @Override
    public T element() {
        System.out.println(name + " size0: " + size() + " thread: " + Thread.currentThread().getName());
        new Exception().printStackTrace();
        return super.element();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        System.out.println(name + " size0: " + size() + " thread: " + Thread.currentThread().getName());
        new Exception().printStackTrace();
        return super.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        System.out.println(name + " size0: " + size() + " thread: " + Thread.currentThread().getName());
        new Exception().printStackTrace();
        return super.retainAll(c);
    }

    @Override
    public boolean removeIf(Predicate<? super T> filter) {
        System.out.println(name + " size0: " + size() + " thread: " + Thread.currentThread().getName());
        new Exception().printStackTrace();
        return false;
    }
}
