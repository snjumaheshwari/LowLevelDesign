
// Problem Statement : Suppose we are given a number n based on which a program creates the series 010203...0n.
// There are three threads t1, t2 and t3 which print a specific type of number from the series.
// t1 only prints zeros,
// t2 prints odd numbers and t3 prints even numbers from the series.
// 0 is printed after each no.

import java.util.concurrent.Semaphore;

interface ZeroOddEven {

    void printZero() throws InterruptedException;

    void printOdds() throws InterruptedException;

    void printEvens() throws InterruptedException;
}

class ZeroOddEvenUsingWait implements ZeroOddEven {
    int cnum;
    int state;
    int N;

    ZeroOddEvenUsingWait(int limit) {
        state = 0;
        cnum = 0;
        this.N = limit;
    }

    public void printZero() throws InterruptedException {
        synchronized (this) {
            while (cnum <= N) {
                while (state != 0) {
                    wait();
                }
                if(cnum > N) break;
                System.out.print(0);
                state = 1;
                notifyAll();
            }
        }
    }

    @Override
    public void printOdds() throws InterruptedException {
        synchronized (this) {
            while (cnum <= N) {
                while (state != 1 || (cnum % 2 == 1)) {
                    wait();
                }
                if(cnum > N) break;
                System.out.println(cnum);
                state = 0;
                cnum++;
                notifyAll();
            }
        }
    }

    @Override
    public void printEvens() throws InterruptedException {
        synchronized (this) {
            while (cnum <= N) {
                while (state != 1 || (cnum % 2 == 0)) {
                    wait();
                }
                if(cnum > N) break;
                System.out.println(cnum);
                state = 0;
                cnum++;
                notifyAll();

            }
        }
    }
}

class ZeroOddEvenUsingSemaphore implements ZeroOddEven {
    int currentNumber;
    int N;
    ZeroOddEvenUsingSemaphore(int N) {
        this.N = N;

    }
    Semaphore zeroPermits = new Semaphore(1);
    Semaphore oddPermits = new Semaphore(0);
    Semaphore evenPermits = new Semaphore(0);

    @Override
    public void printZero() throws InterruptedException {
        while(currentNumber <= N) {
            zeroPermits.acquire();
            if(currentNumber > N) {
                break;
            }
            System.out.print(0);
            if(currentNumber % 2 == 0){
                oddPermits.release();
            }
            else{
                evenPermits.release();
            }
        }
    }

    @Override
    public void printOdds() throws InterruptedException {
        while(currentNumber <= N){
            oddPermits.acquire();
            if(currentNumber > N) {
                evenPermits.release();
                break;
            }
            System.out.println(currentNumber);
            currentNumber++;
            zeroPermits.release();
        }
    }

    @Override
    public void printEvens() throws InterruptedException {
        while(currentNumber <= N){
            evenPermits.acquire();
            if(currentNumber > N) {
                oddPermits.release();
                break;
            }
            System.out.println(currentNumber);
            currentNumber++;
            zeroPermits.release();
        }
    }
}

class ZeroOddEvenThread extends Thread {
    private ZeroOddEven zeroOddEven;
    private String name;

    ZeroOddEvenThread(ZeroOddEven zeroOddEven, String name) {
        this.zeroOddEven = zeroOddEven;
        this.name = name;
    }

    public void run() {
        switch (name) {
            case "zero": {
                try {
                    zeroOddEven.printZero();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            }
            case "odd": {
                try {
                    zeroOddEven.printOdds();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            }
            case "even": {
                try {
                    zeroOddEven.printEvens();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            }

        }
    }
}

class ZeroOddEvenDemo {
    public static void main(String[] args) throws InterruptedException {
//        ZeroOddEven zeroOddEven = new ZeroOddEvenUsingWait(10);
//        ZeroOddEvenThread t1 = new ZeroOddEvenThread(zeroOddEven, "zero");
//        ZeroOddEvenThread t2 = new ZeroOddEvenThread(zeroOddEven, "even");
//        ZeroOddEvenThread t3 = new ZeroOddEvenThread(zeroOddEven, "odd");
//
//        t1.start();
//        t2.start();
//        t3.start();
//
//        Thread.sleep(5000);
        ZeroOddEven zeroOddEven1 = new ZeroOddEvenUsingSemaphore(10);
        ZeroOddEvenThread t4 = new ZeroOddEvenThread(zeroOddEven1, "zero");
        ZeroOddEvenThread t5 = new ZeroOddEvenThread(zeroOddEven1, "even");
        ZeroOddEvenThread t6 = new ZeroOddEvenThread(zeroOddEven1, "odd");

        t4.start();
        t5.start();
        t6.start();

    }
}