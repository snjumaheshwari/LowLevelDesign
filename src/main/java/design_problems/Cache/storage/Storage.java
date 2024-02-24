package design_problems.Cache.storage;

import design_problems.Cache.exceptions.KeyNotFoundException;
import design_problems.Cache.exceptions.StorageFullException;

public interface Storage<Key, Value> {

    void add(Key key, Value value) throws StorageFullException;
    void remove(Key key) throws KeyNotFoundException;
    Value get(Key key) throws KeyNotFoundException;

}
