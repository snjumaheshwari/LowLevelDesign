
public class Deadlock {

    private int counter = 0;
    private Object lock1 = new Object();
    private Object lock2 = new Object();

    void increment() throws InterruptedException {

        synchronized (lock1){
            System.out.println("Acquiring Lock 1 by increment");
            Thread.sleep(100);

            synchronized (lock2){
                System.out.println("Acquiring Lock 2 by increment");
                counter++;
            }
        }
    }

    void decrement() throws InterruptedException {
        synchronized (lock2){
            System.out.println("Acquiring Lock 2 by decrement");
            Thread.sleep(100);

            synchronized (lock1){
                System.out.println("Acquiring Lock 1 by decrement");

                counter--;
            }
        }
    }

    public static void DeadLockTest() throws InterruptedException {
        Deadlock deadlock = new Deadlock();
        Thread t1 = new Thread(() -> {
            for(int i=0; i<100; ++i){
                try {
                    deadlock.increment();
                    System.out.println("increment " + i);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=0; i<100; ++i){
                try {
                    deadlock.decrement();
                    System.out.println("decrement " + i);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Done");

    }

}
