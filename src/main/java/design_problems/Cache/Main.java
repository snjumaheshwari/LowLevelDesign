package design_problems.Cache;

public class Main {
    public static void main(String [] args) throws Exception {

        CacheFactory<String, String> cacheFactory = new CacheFactory<>();
        Cache cache = cacheFactory.defaultCache(2);

        cache.put("a", "apple");
        cache.put("b", "boy");

        System.out.println(cache.get("a"));
        System.out.println(cache.get("b"));

        cache.put("c", "cat");

        cache.get("a");


    }
}
