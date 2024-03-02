import java.util.concurrent.locks.ReentrantLock;

public class PR46_MultiThreadingReentrantLock {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<15; i++){
                    c.increment();
                    System.out.println(c.getCount());
                }
            }
        });

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<15; i++){
                    c.increment();
                    System.out.println(c.getCount());
                }
            }
        });

        t.start();
        t1.start();

        t.join();
        t1.join();
    }
}

class Counter{
    private int count = 0;
    private ReentrantLock lock = new ReentrantLock();

    public void increment(){
        lock.lock();

        try {
            count++;
        }finally {
            lock.unlock();
        }
    }
    public int getCount(){
        return count;
    }
}
