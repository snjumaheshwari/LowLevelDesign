package design_problems.Cache.storage;

import java.util.HashMap;

import design_problems.Cache.exceptions.KeyNotFoundException;
import design_problems.Cache.exceptions.StorageFullException;
import design_problems.Cache.storage.Storage;

public class HashMapBasedStorage<Key, Value> implements Storage<Key, Value> {

    HashMap<Key, Value> storage;
    private final Integer capacity;

    public HashMapBasedStorage(Integer capacity) {
        this.capacity = capacity;
        storage = new HashMap<>();
    }

    @Override
    public void add(Key key, Value value) throws StorageFullException {
        if(isFull()) {
            throw new StorageFullException(" Storage Full ");
        }
        storage.put(key, value);
    }

    @Override
    public void remove(Key key) throws KeyNotFoundException {
        if(!storage.containsKey(key)) throw new KeyNotFoundException("key not present");
        storage.remove(key);
    }

    @Override
    public Value get(Key key) throws KeyNotFoundException {
        if(!storage.containsKey(key)) throw new KeyNotFoundException("key not present");
        return storage.get(key);
    }

    private boolean isFull(){
        if(storage.size() == capacity) return true;
        return false;
    }
}