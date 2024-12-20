package Threads.javaConcurrency.ThreadSafeCollections;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class CreatingThreadSafeCollection {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();

        concurrentHashMap.put("key1", "value 1");
        concurrentHashMap.put("key2", "value 2");

        System.out.println(concurrentHashMap);

    }
}
