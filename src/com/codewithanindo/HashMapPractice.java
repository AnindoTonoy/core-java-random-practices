package com.codewithanindo;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        //Mapping int values to string values
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);

        System.out.println("Size of the map is: " + map.size());
        System.out.println("Map is: " + map);
        System.out.println("\"a\" is: " + map.get('a'));

        //containsKey check
        String key = "a";
        if (map.containsKey(key)){
            int value = map.get(key);
            System.out.println("Value for key \"" + key + "\" is: " + value);
        }
        // keySet in HashMap
        for (String each: map.keySet()) {
            System.out.println(each +" = " + map.get(each));
        }

        // entrySet in HashMap
        for (Map.Entry entry: map.entrySet()){
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
