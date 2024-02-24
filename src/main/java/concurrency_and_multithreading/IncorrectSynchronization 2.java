public class IncorrectSynchronization {
    Boolean flag = Boolean.TRUE;


    public void test() throws InterruptedException {

        Thread t1 = new Thread(() -> {

            synchronized (flag){
                try {
                    while (flag) {
                        System.out.println("First thread");
                        Thread.sleep(5000);
                        System.out.println("wake up");
                        flag.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
                flag = false;
                System.out.println("Boolean set to false by second thread");
        });
        t1.start();
        Thread.sleep(100);
        t2.start();

        t1.join();
        t2.join();
        System.out.println("done");
    }
}

// q1. what if we add synchronization in t2 -->
// Still t1 will be in wait queue and will not be able to join.

// q2. what if we add notify?
// notify will be on different object since flag is re-assigned; resulting in IllegalMonitorStateException