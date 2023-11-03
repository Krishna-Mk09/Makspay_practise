package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class D {
    public static void main(String[] args) {
//        String str = "#j!%a*v$a";
//        String plainStr = str.replaceAll("[^a-zA-Z]", "");
//        System.out.println(plainStr);
//        stringSort("abdefs");

        String name = "helloe woerds ";
//        char target = 's';
//        char replace = 'Z';
//       String replace = name.replace('t', 'i');
//        System.out.println(replace);
//        stringReplace(name, target, replace);
        uniqueString1(name);
    }

    public static void stringReverse(String name) {

        StringBuilder stringBuilder = new StringBuilder(name);
        StringBuilder reverse = stringBuilder.reverse();
        System.out.println(reverse);
    }

    public static void stringSort(String name) {
        char[] chars = name.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (chars[i] < chars[j]) {
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }

        }
        System.out.print(chars);
    }

    public static void stringReplace(String name, char target, char replace) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c == target) {
                stringBuilder.append(replace);
            } else {
                stringBuilder.append(c);
            }

        }
        String s = stringBuilder.toString();
        System.out.println(s);
    }

    public static void uniqueString(String name) {
        HashSet<Character> hashSet = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = name.toCharArray();
        for (char c : chars) {
            if (hashSet.add(c)) {
                stringBuilder.append(c);
            }
        }
        String s = stringBuilder.toString();
        System.out.println(s);
    }

    public static void uniqueString1(String name) {
        String[] s = name.split(" ");
        String reverse = " ";
        for (String word : s) {
            for (int i = word.length() - 1; i >= 0; i--) {
                reverse = reverse + word.charAt(i);
            }
            reverse = reverse + " ";
        }
        System.out.println(reverse);
    }
}


