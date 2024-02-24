interface FooBarPrinter {

    void printFoo() throws InterruptedException;
    void printBar() throws InterruptedException;
}

class FooBarUsingWait implements FooBarPrinter {

    boolean turnFoo = true;
    final int count;

    FooBarUsingWait(int count){
        this.count = count;
    }

    @Override
    public void printFoo() throws InterruptedException {

        synchronized (this) {
            for (int i = 0; i < count; ++i) {
                while (!turnFoo) {
                    wait();
                }
                System.out.println("Foo " + i);
                turnFoo = false;
                this.notifyAll();
            }
        }
    }

    @Override
    public void printBar() throws InterruptedException {
        synchronized (this) {
            for (int i = 0; i < count; ++i) {
                while (turnFoo) {
                    wait();
                }
                System.out.println(" Bar " + i);
                turnFoo = true;
                this.notifyAll();
            }
        }
    }
}

class FooBarThread extends Thread {

    private String name;
    private FooBarPrinter fooBar;

    FooBarThread(String name, FooBarPrinter fooBar) {
        this.name = name;
        this.fooBar = fooBar;
    }

    @Override
    public void run() {
        if (name.equals("foo")) {
            try {
                fooBar.printFoo();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            if(name.equals("bar")){
                try{
                    fooBar.printBar();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class FooBarDemo {

    public static void main(String[] args) throws InterruptedException {
        FooBarPrinter fooBarPrinter = new FooBarUsingWait(5);

        FooBarThread t1 = new FooBarThread("foo", fooBarPrinter);
        FooBarThread t2 = new FooBarThread("bar", fooBarPrinter);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

    }
}
