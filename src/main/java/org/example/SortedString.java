package org.example;

public class SortedString {
    public static void main(String[] args) {
        String str = "dcza";
        sortedString(str);
    }

    public static void sortedString(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] > chars[j]) {
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
        System.out.print("sorted output is ;");
        System.out.print(chars);
    }


}
