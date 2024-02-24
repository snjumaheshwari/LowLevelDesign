package design_problems.Cache;

import design_problems.Cache.evictionPolicy.LRUBasedEvictionPolicy;
import design_problems.Cache.storage.HashMapBasedStorage;

public class CacheFactory<Key, Value> {
    public Cache<Key, Value> defaultCache(final int capacity) {
        return new Cache<Key, Value>(
                new HashMapBasedStorage<Key, Value>(capacity),
                new LRUBasedEvictionPolicy<Key>());
    }
}
