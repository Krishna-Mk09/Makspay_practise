package bridgesoft;

import java.util.*;

public class BridgeSoft {
    public static void main(String[] args) {
        String name = "vamhsikrishna";
        BridgeSoft bridgeSoft = new BridgeSoft();
//        String result = bridgeSoft.stringReversal(name);
//        System.out.println(result);
        String[] aray = {"vamshi", "krishna", "mom", "acb"};
        removeDuplicateWithLogic("abcabcabd");

    }

    public static String removeDuplicateFromString(String name) {
        char[] chars = name.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        HashSet<Character> hashSet = new HashSet<>();
        for (char character : chars) {
            if (hashSet.add(character)) {
                stringBuilder.append(character);
            }
        }
        String s = stringBuilder.toString();
        return s;

    }

    public static void removeDuplicateWithLogic(String name) {
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


    public static void sortString(String name) {
        char[] chars = name.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < i; j++) {
                if (chars[i] < chars[j]) {
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
        System.out.println(chars);
    }


    public static void sortString(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (String str : array) {
            System.out.println(str);
        }
    }

    public static String palindromeCheck(String name) {
        String reverse = "";
        char[] chars = name.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
        }
        if (name.equals(reverse)) {
            System.out.println(name + " is palindrome ");
        } else {
            System.out.println("not palindrome");
        }
        return reverse;
    }

    public static String reverseString(String name){
        char[] chars=name.toCharArray();
        String reverse ="";
        for(int i=chars.length-1;i>=0;i--){
            reverse = reverse +name.charAt(i);
        }
        return reverse;
    }



    public String stringReversal(String name) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = name.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            stringBuilder.append(name.charAt(i));
        }
        String s = stringBuilder.toString();
        return s;
    }




    public static void anagrams(String nameOne, String nameTwo) {
        if (nameOne.length() != nameTwo.length()) {
            System.out.println("these are not anagrams");
        } else {
            char[] chars = nameOne.toLowerCase().toCharArray();
            char[] chars1 = nameTwo.toLowerCase().toCharArray();
            Arrays.sort(chars1);
            Arrays.sort(chars);
            if (Arrays.equals(chars, chars1)) {
                System.out.println("these are anagrams");
            } else {
                System.out.println("not anagrams");
            }
        }
    }
    public static void insertion(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void insertion2(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i-1;
            while (j>=0&& array[j]>key){
                array[j+1]=array[j];
                j=j-1;
            }
            array[j+1]=key;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
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
}
