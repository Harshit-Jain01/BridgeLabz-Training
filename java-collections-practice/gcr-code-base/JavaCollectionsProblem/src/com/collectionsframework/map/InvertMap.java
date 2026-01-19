package com.collectionsframework.map;
import java.util.*;

public class InvertMap {

    public static Map<Integer, List<String>> invertMap(Map<String, Integer> map) {
        Map<Integer, List<String>> invertedMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            if (!invertedMap.containsKey(value)) {
                invertedMap.put(value, new ArrayList<>());
            }

            invertedMap.get(value).add(key);
        }

        return invertedMap;
    }

    public static void main(String[] args) {
        Map<String, Integer> input = new HashMap<>();
        input.put("A", 1);
        input.put("B", 2);
        input.put("C", 1);
        input.put("D", 2);
        input.put("C", 1);

        System.out.println(invertMap(input));
    }
}
