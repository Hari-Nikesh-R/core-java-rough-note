package org.example.collections;

import java.util.*;

public class CollectionsPractice {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("4");
        list.add("2");
        list.add("2");
        list.add("Listing");

        System.out.println(list.get(2));

        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("1");
        set.add("1");
        set.add("1");
        set.add("2");
        List<String> listSet = new  ArrayList<>(set);
        System.out.println(listSet.get(1));

        Map<String, Integer> map = new HashMap<>();
        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);
        map.put("1", 4);
        map.put("3", 4);
        map.put("4", 4);
        System.out.println(map.get("3"));


    }
}
