package org.example;

import java.util.*;

public class Array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = scanner.nextInt();
        int[] arrq = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("enteer thye elemets");
            arrq[i] = scanner.nextInt();
        }
        for (int i = 0; i < arrq.length; i++) {
            System.out.println("elemenats before remobving duplicate s");
        }



//        int[] array = {1, 2, 1, 2, 3, 3, 4};
        String name = "krishna nani ";
//      removeDuplicateUsingCollectionsName(name);
        String s1 = "vamshi";
        String s2 = "amvmis";
        anagrams(s1, s2);
    }

    public static void anagrams(String string1, String string2) {
        if (string1.length() != string2.length()) {
            System.out.println("these are not anagrams");
        } else {
            char[] chars = string1.toLowerCase().toCharArray();
            char[] chars1 = string2.toLowerCase().toCharArray();
            Arrays.sort(chars);
            Arrays.sort(chars1);
            if (Arrays.equals(chars, chars1)) {
                System.out.println("anagrams");
            } else {
                System.out.println("not anagrams");
            }
        }
    }


    public static void reverseString(String name) {
//        char[] letters = name.toCharArray();
//        String reverse = " ";
//        for (int i = name.length() - 1; i >= 0; i--) {
//            reverse = reverse + name.charAt(i);
//        }
//        System.out.println(reverse);

        char[] chars = name.toCharArray();
        String reverse=" ";
        for (int i =chars.length-1; i >=0; i--) {
            reverse=reverse+name.charAt(i);
        }
    }


    public static void removeDuplicateUsingCollections(int[] array) {
        Set<Integer> hashset = new HashSet<>();
        for (int newArray : array) {
            hashset.add(newArray);
        }
        System.out.println(hashset);
    }

    public static void removeDuplicateUsingCollectionsName(String name) {
        char[] chars = name.toLowerCase().toCharArray();
        Set<Character> hashset = new HashSet<>();
        for (char newArray : chars) {
            hashset.add(newArray);
        }
        System.out.println("before:   " + hashset);
        StringBuilder result = new StringBuilder();
        for (char c : hashset) {
            result.append(c);
        }
        System.out.println("string result : " + result);
        Iterator<Character> iterator = hashset.iterator();
        StringBuilder result1 = new StringBuilder();
        while (iterator.hasNext()) {
            result1.append(iterator.next());
        }
        System.out.println("converted to string : " + result1);
    }

    public static void target(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }

    public static void uniqueNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println(array[i]);
            }
        }
    }

    public static void removeDuplicate(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean isUnique = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isUnique = true;
                    break;
                }
            }
            if (!isUnique) {
                System.out.print(array[i]);
            }
        }
    }

    public static void repeatedNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean isUnique = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isUnique = true;
                    break;
                }
            }
            if (isUnique) {
                System.out.print(array[i]);
            }
        }
    }

}
