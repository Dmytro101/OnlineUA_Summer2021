package com.lesson12.task1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, -6, 4, 5, 3, 4, 2, 4, 5, 7};
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int num : arr) {
            numbers.add(num);
        }
        System.out.println(numbers);

        Map<Integer, Integer> entries = countEntries(numbers);
        System.out.println(entries);
    }

    public static Map countEntries(ArrayList<Integer> numbers) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer number : numbers) {
            if (map.containsKey(number)) {
                int value = map.get(number);
                map.put(number, ++value);
            } else {
                map.put(number, 1);
            }
        }
        return map;
    }
}
