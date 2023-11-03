package Maxpay;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Array {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 21, 22, 3};
        int target = 28;
        String name = "vamshi";
        String n2 = "vamshi";
        anagrams(n2,name);
//        target(array, target);
//        stringOcc(name);
    }


    public static void reverseSentence(String name) {
        String[] split = name.split(" ");
        String reverse = "";
        for (String word : split) {
            for (int i = word.length() - 1; i >= 0; i--) {
                reverse = reverse + word.charAt(i);
            }
            reverse = reverse + " ";
        }
        System.out.println(reverse);
    }

    public static void reverseString(String name) {
        char[] chars = name.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            stringBuilder.append(name.charAt(i));
        }
        String s = stringBuilder.toString();
        System.out.println(s);
    }

    public static void target(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] + array[j] == target) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }

    public static void stringOcc(String name) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char[] chars = name.toCharArray();
        for (char c : chars) {
            if (hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c) + 1);
            } else {
                hashMap.put(c, 1);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void secondLargest(int[] array) {
        Arrays.sort(array);
        int secondLargest = array[array.length - 2];
        System.out.println(secondLargest);
    }

    public static void findMaxMin(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }

    public static void removeDuplicateInArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.print(array[i]);
            }
        }
    }

    public static void removeDuplicateUsingCollections(int[] array) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int arr : array) {
            hashSet.add(arr);
        }
        System.out.print(hashSet);
    }

    public static void removeDuplicateInString(String name) {
        HashSet<Character> hashSet = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = name.toCharArray();
        for (char ch : chars) {
            if (hashSet.add(ch)) {
                stringBuilder.append(ch);
            }
        }
        String s = stringBuilder.toString();
        System.out.println(s);
    }

    public static void removeDuplicateInStringWithoutCol(String name) {
        char[] chars = name.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (chars[i] == chars[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.print(chars[i]);
            }
        }
    }

    public static void anagrams(String n1, String v2) {
        char[] chars = n1.toLowerCase().toCharArray();
        char[] chars1 = v2.toLowerCase().toCharArray();

        if (n1.length() != v2.length()) {
            System.out.println("not anagarms");
        }

        if (Arrays.equals(chars, chars1)) {
            System.out.println("these are anagrams");
        }

    }
}
