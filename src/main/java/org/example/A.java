package org.example;

import java.util.*;

public class A {
    public static void main(String[] args) {
        int[] num = {1, 2, 3,4,8,5,3 };
//        stringOccur("vamshikrishnazzz");
//        String name = "vamshi";
//        String name2 = "krishna";
//        String name3 = name.concat(name2);
//        System.out.println(name3);

        secondLargest(num);
    }

    public static void secondLargest(int[] array) {
        Arrays.sort(array);
        int result = array[array.length - 2];
        System.out.println(result);
    }




    public static void removeDuplicate(int[] num) {
//        char[] chars = name.toCharArray();

//        for (int i = 0; i < num.length; i++) {
//            boolean isUnique = true;
//            for (int j = 0; j < i; j++) {
//                if (num[i] == num[j]) {
//                    isUnique = false;
//                    break;
//                }
//            }
//            if (isUnique) {
//                System.out.print(num[i]);
//            }
//        }


        for (int i = 0; i < num.length; i++) {
            boolean isUnique=true;
            for (int j = 0; j < i; j++) {
                if (num[i]==num[j]){
                    isUnique=false;
                    break;
                }
            }
            if (isUnique){
                System.out.println(num[i]);
            }
        }
    }

    public static void removeDuplicate(String name) {
        char[] chars = name.toLowerCase().toCharArray();
        TreeSet<Character> set = new TreeSet<>();
        for (char c : chars) {
            set.add(c);
        }
        System.out.print(set);
    }

    public static void stringOccur(String name) {
        char[] chars = name.toCharArray();
        HashMap<Character, Integer> hashSet = new HashMap<>();
        for (char ch : chars) {
            if (hashSet.containsKey(ch)) {
                hashSet.put(ch, hashSet.get(ch) + 1);
            } else {
                hashSet.put(ch, 1);
            }
        }
        for (Map.Entry entry : hashSet.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
    }


}
