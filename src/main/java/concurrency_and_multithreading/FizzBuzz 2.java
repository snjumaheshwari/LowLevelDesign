package concurrency_and_multithreading;

public class FizzBuzz {

    private int N;
    private int num;

    FizzBuzz(int N) {
        this.N = N;
        this.num = 1;
    }

    public synchronized void printFizz() throws InterruptedException {
        while(num <= N) {
            while(num % 3 != 0 || num % 5 == 0){
                this.wait();
            }
            System.out.println("Fizz ");
            num++;
            this.notifyAll();
        }
    }

    public synchronized void printBuzz() throws InterruptedException {
        while(num <=N ) {
            while (num % 5 != 0 || num % 3 == 0) {
                this.wait();
            }
            System.out.println("Buzz ");
            num++;
            this.notifyAll();
        }
    }

    public synchronized void printFizzBuzz() throws InterruptedException {
        while(num <=N) {
            while (num % 15 != 0) {
                this.wait();
            }
            System.out.println("FizzBuzz ");
            num++;
            this.notifyAll();
        }
    }

    public synchronized void printNumber() throws InterruptedException {
        while(num <= N) {
            while (num % 3 == 0 || num % 5 == 0) {
                this.wait();
            }
            System.out.println(num);
            num++;
            this.notifyAll();
        }
    }
}

class FizzBuzzThreads extends Thread {
    String name;
    FizzBuzz fizzBuzz;

    public FizzBuzzThreads(String name, FizzBuzz fizzBuzz){
        this.name = name;
        this.fizzBuzz = fizzBuzz;
    }

    public void run(){

        switch (name){
            case "1" : {
                try {
                    fizzBuzz.printFizz();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            }
            case "2" : {
                try {
                    fizzBuzz.printBuzz();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            }
            case "3" : {
                try {
                    fizzBuzz.printFizzBuzz();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            }
            case "4" : {
                try {
                    fizzBuzz.printNumber();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            }
        }
    }
}


class FizzBuzzDemo{

    public static void main(String[] args){
        FizzBuzz fizzBuzz = new FizzBuzz(20);
        FizzBuzzThreads t1 = new FizzBuzzThreads("1", fizzBuzz);
        FizzBuzzThreads t2 = new FizzBuzzThreads("2", fizzBuzz);
        FizzBuzzThreads t3 = new FizzBuzzThreads("3", fizzBuzz);
        FizzBuzzThreads t4 = new FizzBuzzThreads("4", fizzBuzz);


        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}