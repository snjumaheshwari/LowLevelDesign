package design_problems.Cache;

import design_problems.Cache.evictionPolicy.EvictionPolicy;
import design_problems.Cache.exceptions.KeyNotFoundException;
import design_problems.Cache.exceptions.StorageFullException;
import design_problems.Cache.storage.Storage;

public class Cache<Key, Value> {

    Storage<Key, Value> storage;
    EvictionPolicy<Key> evictionPolicy;

    public Cache(Storage storage, EvictionPolicy evictionPolicy){
        this.storage = storage;
        this.evictionPolicy = evictionPolicy;
    }

    public void put(Key key, Value value) throws Exception {
        try {
            storage.add(key, value);
            evictionPolicy.accessedKey(key);

        } catch (StorageFullException e) {
           System.out.println("Storage found full while adding key: "+  key);
           System.out.print("Trying to evict some key...");

           Key evictedKey = evictionPolicy.evict();
           if(evictedKey == null){
               throw new RuntimeException("No key found to be evicted "+  evictedKey);
           }

           storage.remove(evictedKey);
           System.out.println("Done");
           put(key, value);
        }
    }

    public Value get(Key key) throws Exception {
        try {
            Value value = this.storage.get(key);
            this.evictionPolicy.accessedKey(key);
            return value;
        }
        catch (KeyNotFoundException exception){
            System.out.println("Tried to access non-existing key... Returned Null");
            return null;
        }
    }
}
