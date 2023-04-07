package com.codewithanindo;

import java.util.TreeMap;

public class TreeMapPractice {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "A");
        treeMap.put(2, "B");
        treeMap.put(1, "C");

        System.out.println("TreeMap: " + treeMap);
    }
}
