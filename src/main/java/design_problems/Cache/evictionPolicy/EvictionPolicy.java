package design_problems.Cache.evictionPolicy;

public interface EvictionPolicy <Key> {

    Key evict();

    void accessedKey(Key key);
}
