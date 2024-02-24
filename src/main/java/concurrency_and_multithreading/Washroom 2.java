package concurrency_and_multithreading;


import java.util.Random;
import java.util.concurrent.Semaphore;

public class Washroom {
    int capacity;
    Gender turn;
    int currentOccupied ;
    Semaphore semaphore;
    Semaphore genderSemaphore;

    Washroom(int capacity){
        this.capacity = capacity;
        this.currentOccupied = 0;
        turn = null;
        semaphore = new Semaphore(this.capacity);
        genderSemaphore = new Semaphore(1);
    }

    void occupiedWashroom(String name) throws InterruptedException {
        System.out.println("[USING] " + name );
        Thread.sleep(10000);
    }

    void maleUseWashroom(String name) throws InterruptedException {
        if(turn == null) {
            genderSemaphore.acquire();
        }
        semaphore.acquire();
        turn = Gender.MALE;
        currentOccupied++;
        occupiedWashroom(name);
        currentOccupied--;
        System.out.println("[DONE] --" + name);

        semaphore.release();
    }

    void femaleUseWashroom(String name) throws InterruptedException {

        if(turn == null) {
            genderSemaphore.acquire();
        }
        semaphore.acquire();
        turn = Gender.FEMALE;
        currentOccupied++;
        occupiedWashroom(name);
        currentOccupied--;
        System.out.println("Person " + name + " ******* Done *********");


        if(currentOccupied == 0){
            turn = null;
        }
        semaphore.release();

    }

}

enum Gender {
    MALE,
    FEMALE
}


class Person {
    String name;
    Gender gender;

    public Person(String name, Gender gender){
        this.name = name;
        this.gender = gender;
    }
}


class PersonWashroomThread extends Thread {
    Person person;
    Washroom washroom;

    public PersonWashroomThread(Person person, Washroom washroom){
        this.person = person;
        this.washroom = washroom;
    }

    public void run(){
        switch (person.gender){
            case MALE -> {
                try {
                    System.out.println(person.name + " trying to use washroom");
                    washroom.maleUseWashroom(person.name);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            }
            case FEMALE -> {
                try {
                    System.out.println(person.name + " trying to use washroom");
                    washroom.femaleUseWashroom(person.name);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            }
        }
    }
}

class WashRoomDemo {
    static Random random = new Random();
    private static String getName(int n, Gender gender){
        String temp = "Male";
        if(gender == Gender.FEMALE){
            temp = "female";
        }
        return "person : " +  n + " -> " + temp;
    }
    private static Gender getRandomGender(int n){
       int num = random.nextInt(100);
       if(num % 2 == 0) {
           return Gender.FEMALE;
       }
       return Gender.MALE;
    }
    private static int getRandomPerson(int n){
        return random.nextInt(n);
    }
    public static void main(String[] args){
        int washRoomCapacity = 3;
        Washroom washroom = new Washroom(washRoomCapacity);

        int totalPerson = 25;
        Person[] persons = new Person[totalPerson];

        for(int i=0; i<totalPerson; ++i){
            Gender gender = getRandomGender(i);
            String name = getName(i, gender);
            persons[i] = new Person(name, gender);
        }

        for(int i=0; i<25; ++i){
//            int p = getRandomPerson(totalPerson);
//            System.out.println(p);
            PersonWashroomThread pwt = new PersonWashroomThread(persons[i], washroom);
            pwt.start();
        }
    }
}