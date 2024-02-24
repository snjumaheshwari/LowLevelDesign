import java.util.Random;

public class ThreadUnsafeCounter {
    int count = 0;
    public void increment(){
        count++;
    }
    public void decrement() {
        count--;
    }
    public void print(){
        System.out.println(" counter is : " + count);
    }

    private static void sleepRandomlyForLessThanNSeconds(int n){
        try{
            Random random = new Random(System.currentTimeMillis());
            Thread.sleep(random.nextInt(n));
        }catch (InterruptedException e){

        }
    }

    public static void ThreadUnsafeCounterDemo() throws InterruptedException {
        ThreadUnsafeCounter counter = new ThreadUnsafeCounter();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10000; ++i) {
                    counter.increment();
                    sleepRandomlyForLessThanNSeconds(10);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10000; ++i) {
                    counter.decrement();
                    sleepRandomlyForLessThanNSeconds(10);
                }
            }
        });

        t1.start(); t2.start();
        t1.join(); t2.join();
        counter.print();
    }
}
