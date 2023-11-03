package org.example;

import java.util.HashSet;
import java.util.Set;

public class Arrays2 {
    public static void main(String[] args) {
        String name = "my name is vamshi";
        reverseWord(name);

    }

    public static void findUniqueInString(String name) {
        char[] chars = name.toCharArray();
        Set<Character> hashset = new HashSet<>();
        for (char c : chars) {
            hashset.add(c);
        }
        System.out.println(hashset);
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : hashset) {
            stringBuilder.append(ch);
        }
        System.out.println(stringBuilder.toString());

    }

    public static void findUniqueInStringWithoutCol(String name) {
        char[] chars = name.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < chars.length; j++) {
                if (i != j && chars[i] == chars[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.print(chars[i]);
            }
        }
    }

    public static void reverseWord(String name) {
        String[] s = name.split(" ");
        String reverse = "";
        for (String str : s) {
            for (int i = str.length() - 1; i >= 0; i--) {
                reverse = reverse + str.charAt(i);

            }
            reverse = reverse + " ";
        }
        System.out.println(reverse);
    }

    public static void reverseWordWithStringBuilder(String name) {
        String[] split = name.split(" ");
        StringBuilder reverse = new StringBuilder();
        for (String word : split) {
            for (int i = word.length() - 1; i >= 0; i--) {
                reverse.append(word.charAt(i));
            }
            reverse.append(" ");
        }
        System.out.println(reverse);

    }
}

