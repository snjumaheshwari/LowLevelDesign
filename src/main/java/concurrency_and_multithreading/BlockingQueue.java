
class BlockingQueue<T> {
    int capacity;
    int front;
    int last;
    int size;
    T items[];

    BlockingQueue(int capacity){
        items = (T[]) new Object[capacity];
        front = 0;
        last = 0;
        size = 0;
        this.capacity = capacity;
    }

    void enqueue(T item) throws InterruptedException {
        synchronized (this) {
            while (size == capacity) {
                this.wait();
            }
            if(last == capacity){
                last = 0;
            }
            items[last] = item;
            size++;
            last++;
            System.out.println("Thread 1 added item " + item);
            notifyAll();
        }
    }

     synchronized T dequeue() throws InterruptedException {
        while(size == 0) {
            this.wait();
        }
        if(front == capacity){
             front = 0;
        }
        T item = items[front];
        front++;
        size--;

        notifyAll();
        System.out.println("item removed " + item);
         return item;
    }
}

class Demo{

    public static void main(String[] args) throws InterruptedException {

        BlockingQueue<Integer> blockingQueue = new BlockingQueue<>(4);

        Thread t1 = new Thread(() -> {
            for(int i=0; i<10; ++i){
                try {
                    System.out.println("Thread 1 trying to add " + i);
                    blockingQueue.enqueue(i);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=0; i<5; ++i){
                try {
                    System.out.println("Thread 2 trying to remove");
                    int item = blockingQueue.dequeue();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t3 = new Thread(() -> {
            for(int i=0; i<5; ++i){
                try {
                    System.out.println("Thread 3 trying to remove");
                    int item = blockingQueue.dequeue();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

    }
}
