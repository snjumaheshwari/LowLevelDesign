public class InterruptingThread {


    public void test() throws InterruptedException {

        Thread sleepyThread = new Thread(() -> {
            System.out.println("Sleepy Thread");
            try {
//                int a = 1;
//                while(a == 1){
//                    a = 1;
//                }
                Thread.sleep(1000 * 60);


            } catch (InterruptedException e) {
                System.out.println("Exception Thrown ");
                System.out.println("The interrupt flag is cleard : " + Thread.currentThread().isInterrupted());
                System.out.println("note:  Thread.interrupted() : " + Thread.interrupted());
                Thread.currentThread().interrupt();
                System.out.println("The interrupt flag is set now : " + Thread.currentThread().isInterrupted());
                System.out.println("note:  Thread.interrupted() : " + Thread.interrupted());
                System.out.println("note:  Thread.interrupted() : " + Thread.interrupted());

            }
        });

        sleepyThread.start();

        Thread.sleep(100);
        System.out.println("About to wake up the sleepy thread ...");
        sleepyThread.interrupt();
        System.out.println("Woke up sleepy thread ...");

        sleepyThread.join();

    }
}
//  Thread.interrupted() is similar as Thread.currentThread().isInterrupted()

// The important difference between the two is that the static method would return the interrupt status and
// also clear it at the same time.
//
// On line 22 we deliberately call the object method first followed by the static method.
// If we reverse the ordering of the two method calls on line 22,
// the output for the line would be true and false, instead of true and true.


//    Thread.currentThread().interrupt() is same as sleepyThread.interrupt()  here.
// as we interpupt -->
// boolean set to true
// exception thrown (if thread sleeps or wait) .. and boolean again set to false
