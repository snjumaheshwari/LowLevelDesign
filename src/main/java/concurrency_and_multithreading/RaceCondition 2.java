import java.util.Random;

public class RaceCondition {
    volatile int randInt;
    Random random = new Random(System.currentTimeMillis());

    void printer(){
        for(int i=0 ; i<1000; ++i){
            synchronized (this) {
                System.out.println("first thread : " + i + " " + randInt );
                if (randInt % 2 == 0) {
                    System.out.println("first thread : " + i + " " + randInt );
                    if (randInt % 2 != 0) {
                        System.out.println(" randInt incorrect " + i + " " + randInt);
                    }
                }
            }
        }
    }

    void modifier(){
        for(int i=0; i<1000; ++i){
//            synchronized (this) {
            System.out.println("second thread : " +  i + " " + randInt);
            randInt = random.nextInt(1000);
            System.out.println("second thread : " +  i + " " + randInt);

//            }
        }
    }

    public static void RaceConditionDemo() throws InterruptedException {
        RaceCondition rc = new RaceCondition();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                rc.printer();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                rc.modifier();
            }
        });
        t1.start(); t2.start();
        t1.join(); t2.join();
    }


}
