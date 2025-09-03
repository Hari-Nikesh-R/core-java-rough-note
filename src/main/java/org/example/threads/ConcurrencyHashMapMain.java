package org.example.threads;

import java.util.HashMap;

public class ConcurrencyHashMapMain {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(1, 10);
        System.out.println(map);
    }
}
