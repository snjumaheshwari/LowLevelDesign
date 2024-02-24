import java.util.concurrent.CountDownLatch;

// 1. Solution using basic wait() and notify()
  // a.  - Using
    // b. - Using Thread class

interface OrderedPrinting {
    void printFirst();
    void printSecond() throws InterruptedException;
    void printThird() throws InterruptedException;
}

class OrderedPrintingUsingWait implements OrderedPrinting {
    int state = 0;
    public synchronized void printFirst(){
        System.out.println("First");
        state = 1;
        notifyAll();
    }
    public synchronized void printSecond() throws InterruptedException {
        while(state != 1) {
            wait();
        }
        System.out.println("Second");
        state = 2;
        notifyAll();
    }
    public synchronized void printThird() throws InterruptedException {
        while(state != 2) {
            wait();
        }
        System.out.println("Third");
    }
}

// 2. Solution Using Count Down Latch
class OrderPrintingUsingCountDownLatch implements OrderedPrinting {
    CountDownLatch latch1 = new CountDownLatch(1);
    CountDownLatch latch2 = new CountDownLatch(1);

    public void printFirst(){
        System.out.println("First");
        latch1.countDown();

    }
    public void printSecond() throws InterruptedException {
        latch1.await();
        System.out.println("Second");
        latch2.countDown();
    }
    public void printThird() throws InterruptedException {
        latch2.await();
        System.out.println("Third");
    }
}

class OrderPrintingThread extends Thread{
    private OrderedPrinting obj;
    private String method;

    OrderPrintingThread(OrderedPrinting obj, String method){
        this.obj = obj;
        this.method = method;
    }

    public void run(){
        switch (method){
            case "first": {
                obj.printFirst();
                break;
            }
            case "second": {
                try {
                    obj.printSecond();
                    break;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            case "third": {
                try {
                    obj.printThird();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


class OrderPrintingDemo {

    //     // first method
    public static void test(OrderedPrinting obj) throws InterruptedException {
            Thread t1 = new Thread( () -> {
                obj.printFirst();
            });
            Thread t2 = new Thread( () -> {
                try {
                    obj.printSecond();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            Thread t3 = new Thread( () -> {
                try {
                    obj.printThird();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            t1.start();
            t2.start();
            t3.start();

            t1.join();
            t2.join();
            t3.join();
        }

    public static void main(String[] args) throws InterruptedException {

        System.out.println("first approach");
        OrderedPrinting orderedPrintingUsingWait = new OrderedPrintingUsingWait();
        test(orderedPrintingUsingWait);

        Thread.sleep(1000);
        System.out.println("Second Approach");

        OrderPrintingThread t1 = new OrderPrintingThread(orderedPrintingUsingWait, "first");
        OrderPrintingThread t2 = new OrderPrintingThread(orderedPrintingUsingWait, "second");
        OrderPrintingThread t3 = new OrderPrintingThread(orderedPrintingUsingWait, "third");

        t1.start();
        t2.start();
        t3.start();

        Thread.sleep(1000);
        System.out.println("Third Approach");

        OrderPrintingUsingCountDownLatch orderPrintingUsingCountDownLatch = new OrderPrintingUsingCountDownLatch();

        OrderPrintingThread t4 = new OrderPrintingThread(orderPrintingUsingCountDownLatch, "first");
        OrderPrintingThread t5 = new OrderPrintingThread(orderPrintingUsingCountDownLatch, "second");
        OrderPrintingThread t6 = new OrderPrintingThread(orderPrintingUsingCountDownLatch, "third");

        t4.start();
        t5.start();
        t6.start();

    }
}
