package com.eldus;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static Map<String, Integer> mapTypeSwap(Map<Integer, String> map) {
        Map<String, Integer> map1 = new HashMap<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            map1.put(entry.getValue(), entry.getKey());
        }
        return map1;
    }

    public static void twoTheBiggestValues(Map<String, Integer> map) {
        Map.Entry<String, Integer> maxEntry1 = null;
        Map.Entry<String, Integer> maxEntry2 = null;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (maxEntry1 == null || entry.getValue() > maxEntry1.getValue()) {
                maxEntry2 = maxEntry1;
                maxEntry1 = entry;
            } else if (maxEntry2 == null || entry.getValue() > maxEntry2.getValue()) {
                maxEntry2 = entry;
            }
        }
        System.out.println(maxEntry1 + " " + maxEntry2);
    }

    public static void main(String[] args) throws IOException {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "Ноль");
        map.put(1, "Один");
        map.put(2, "Два");
        map.put(3, "Три");
        map.put(4, "Четыре");
        map.put(5, "Пять");
        map.put(6, "Шесть");
        map.put(7, "Семь");
        map.put(8, "Восем");
        map.put(9, "Девять");
        Map<String, Integer> map1 = mapTypeSwap(map);


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            String name = reader.readLine();
            if (map.containsKey(name)) {
                map2.put(name, map2.get(name) + 1);
            } else {
                map2.put(name, 1);
            }
        }
        twoTheBiggestValues(map2);
    }
}
