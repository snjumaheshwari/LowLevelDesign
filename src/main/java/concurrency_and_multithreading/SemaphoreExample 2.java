import java.util.concurrent.Semaphore;

public class SemaphoreExample {

    public void test() throws InterruptedException {
        final Semaphore semaphore = new Semaphore(1);


        Thread bad = new Thread( () -> {
            try {
                semaphore.acquire();
                System.out.println("bad thread acquired");
                throw new RuntimeException(" random");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            catch (RuntimeException e){
                System.out.println(" hey exception ");
            }

//            finally {
//                semaphore.release();
//            }
        });

        Thread good = new Thread( () -> {

            System.out.println("Good thread patiently waiting to be signalled.");
            try {
                Thread.sleep(100);
                semaphore.acquire();
                System.out.println("Good thread acquired");

            } catch (InterruptedException ie) {
                // handle thread interruption
            }
        });

        bad.start();
        good.start();

        good.join();
        bad.join();

    }
}

class SemaphoreExampleDemo {
    public static void main(String[] args){

    }
}