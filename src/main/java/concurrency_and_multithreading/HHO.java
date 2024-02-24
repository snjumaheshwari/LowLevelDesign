package concurrency_and_multithreading;

import java.util.Random;

class HHOMolecule{

    int count = 0;
    int h = 0;
    int o = 0;

    public void hydrogen(int id) throws InterruptedException {
        synchronized (this){
            while (h == 2){
                wait();
            }
            System.out.println("Hydrogen Ready " + id);
            h++;
            count++;

            if(count == 3){
                System.out.println("water formed ");
                count = 0;
                h = 0;
                o = 0;
                this.notifyAll();
            }
        }
    }
    public  void oxygen(int id) throws InterruptedException {
        synchronized (this){
            while (o == 1){
                wait();
            }
            o++;
            count++;
            System.out.println("Oxygen Ready" + id);
            if(count == 3){
                System.out.println("water formed ");
                count = 0;
                o = 0;
                h = 0;
                this.notifyAll();
            }
        }
    }
}

class HHOThreads extends Thread{
    String type;
    int id;
    HHOMolecule hhoMolecule;

    HHOThreads(int id, String type, HHOMolecule hhoMolecule){
        this.id = id;
        this.type = type;
        this.hhoMolecule = hhoMolecule;
    }

    public void run(){
        switch (type){
            case "hydrogen": {
                try {
                    System.out.println("Hydrogen : " + id);
                    hhoMolecule.hydrogen(id);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            }
            case "oxygen": {
                try {
                    System.out.println("Oxygen : " + id);
                    hhoMolecule.oxygen(id);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            }
        }
    }
}
class HHODemo {

    private static Random random = new Random();
    private static String getRandomType(){
        if(random.nextInt(10) % 5 > 3) {
            return "oxygen";
        }
        return "hydrogen";
    }

    public static void main(String[] args){
        HHOMolecule hhoMolecule = new HHOMolecule();

        for(int i=0; i<10; ++i){
            HHOThreads hhoThreads = new HHOThreads(i, getRandomType(), hhoMolecule);
            hhoThreads.start();
        }
    }
}