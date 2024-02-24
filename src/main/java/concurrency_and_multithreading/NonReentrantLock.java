public class NonReentrantLock {
    boolean isLocked;

    public NonReentrantLock(){
        isLocked = false;
    }

    public  synchronized void lock() throws InterruptedException {
        while(isLocked){
            wait();
        }
        isLocked = true;
    }

    public synchronized void unblock(){
        isLocked = false;
        notify();
    }


    public static void NonReentrantLockDemo() throws InterruptedException {
        NonReentrantLock nonReentrantlock = new NonReentrantLock();
        nonReentrantlock.lock();
        System.out.println(" Acquired first Lock" + Thread.currentThread().getName());

        System.out.println("Trying to acquire second lock" + Thread.currentThread().getName());
        nonReentrantlock.lock();
        System.out.println("Acquired second Lock -- never printed");
    }
}
