package org.example.hashmapconcept;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapCollision {
    // hashcode % capacity
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,Integer> map1 = new ConcurrentHashMap<Integer,Integer>();
        HashMap<Key, Integer> map = new HashMap<>();
        map.put(new Key("A"), 100);
        map.put(new Key("B"), 200);
        map.put(new Key("C"), 300);
        map.put(new Key("A"), 300);

        System.out.println(map);
    }
}
