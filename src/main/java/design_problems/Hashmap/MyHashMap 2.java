package design_problems.Hashmap;

public class MyHashMap<Key, Value> implements Map<Key, Value> {

    private static final int  INITIAL_SIZE = 1<<4; //16
    private static final int MAXIMUM_CAPACITY = 1 << 30;
    Entry[] hashTable;

    public MyHashMap(){
        hashTable =  new Entry[INITIAL_SIZE];
    }
    public MyHashMap(int size) {
        hashTable =  new Entry[size];
    }

    final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }


    @Override
    public Value get(Key key){

        int hashCode = key.hashCode() % hashTable.length;
        Entry node = hashTable[hashCode];
        System.out.println(node);
        while(node != null) {
            if(node.key.equals(key)) {
                return (Value)node.value;
            }
            node = node.next;
        }
        return null;

    }

    @Override
    public void put(Key key, Value value) {
        int hashCode = key.hashCode() % hashTable.length;
        Entry node = hashTable[hashCode];


        if(node == null) {
            Entry newNode = new Entry(key, value);
            System.out.println(newNode);
            hashTable[hashCode] = newNode;
        } else {
            Entry previousNode = node;
            while (node != null) {

                if (node.key == key) {
                    node.value = value;
                    return;
                }
                previousNode = node;
                node = node.next;
            }
            Entry newNode = new Entry(key,value);
            previousNode.next = newNode;
        }

    }

    @Override
    public int getSize() {
        return 0;
    }
}


