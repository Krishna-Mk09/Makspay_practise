package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class E {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 2, 3, 3, 33, 5, 5, 5, 5, 5, 7};
//        leastNumberRepeated(array);
        String[] name = {"vamshi", "krishna", "kiran", "nani", "amma",};
        sortStringsArray1(name);
    }

    public static void sortStringsArray(String[] array) {
        Arrays.sort(array);
        for (String s : array) {
            System.out.print(s + " ");
        }
    }

    public static void sortStringsArray1(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (String str : array) {
            System.out.print(str + " ");
        }

    }




    public static void sort(String name) {
        char[] chars = name.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        HashSet<Character> hashSet = new HashSet<>();
        for (char ch : chars) {
            if (hashSet.add(ch)) {
                stringBuilder.append(ch);
            }
        }
        String s = stringBuilder.toString();
        System.out.println(s);
        ;

    }

    public static void leastNumberRepeated(int[] array) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int number : array) {
            hashMap.put(number, hashMap.getOrDefault(number, 0) + 1);
        }
        int leastRepeatedNum = array[0];
        int minCount = Integer.MAX_VALUE;

        for (int numb : array) {
            if (hashMap.get(numb) < minCount) {
                minCount = hashMap.get(numb);
                leastRepeatedNum = numb;
            }
        }
        System.out.println(leastRepeatedNum);
    }
}


