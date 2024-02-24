public class RangeSumThreads {
    int start;
    int end;
    long sum;
    static int MAX_NUM = Integer.MAX_VALUE/10;

    public RangeSumThreads(int start, int end){
        this.start = start;
        this.end = end;
        this.sum = 0;
    }

    void add(int jump){
        for(int i=start; i<=end; i+=jump){
            sum += i;
        }
    }

    static public void oneThread(){
        long start = System.currentTimeMillis();
        RangeSumThreads s1 = new RangeSumThreads(0, MAX_NUM);
        s1.add(1);
        long end = System.currentTimeMillis();
        System.out.println("Single thread final time: " + (end-start) + " result : " + s1.sum);
    }

    static public void TwoThread() throws InterruptedException {
        long start = System.currentTimeMillis();
        RangeSumThreads s1 = new RangeSumThreads(0, MAX_NUM/2);
        RangeSumThreads s2 = new RangeSumThreads((MAX_NUM/2) +1, MAX_NUM);

        Thread t1 = new Thread(() -> s1.add(1));
        Thread t2 = new Thread(() -> s2.add(1));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        long result = s1.sum + s2.sum;
        long end = System.currentTimeMillis();
        System.out.println("Two thread final time: " + (end-start) + " result: " + result);

    }


}
