package design_problems.Hashmap;

public interface Map<Key, Value> {

    Value get(Key key);
    void put(Key key, Value value);

    int getSize();
}
