package bridgesoft;

import java.util.*;

public class Bridge {
    public static void main(String[] args) {
//        int i = fibonacci(10);
//        System.out.println(i);
        replace("Tamshi", 'T', 'v');
    }


    public static int sumOfNumbers(int num) {
        if (num <= 0) {
            return 0;

        } else return num + sumOfNumbers(num - 1);
    }

    public static int sumOfDigits(int num) {
        if (num < 10) {
            return num;
        } else return num % 10 + sumOfDigits(num / 10);
    }

    public static int fact(int num) {
        if (num == 0 | num == 1) {
            return 1;
        } else return num * fact(num - 1);
    }

    public static int fibonacci(int num) {
        if (num <= 0) {
            return 1;
        } else return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static void removeDuplicateFromString(String name) {
        char[] chars = name.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            Boolean isUnique = true;
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

    public static void removeDuplicateFromStringwithcollecions(String name) {
        char[] chars = name.toCharArray();
        StringBuilder stringbuilder = new StringBuilder();
        HashSet<Character> hashset = new HashSet<>();
        for (char ch : chars) {
            if (hashset.add(ch)) {
                stringbuilder.append(ch);
            }
        }
        String n = stringbuilder.toString();
        System.out.print(n);
    }

    public static void sortString(String name) {
        char[] chars = name.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < i; j++) {
                if (chars[i] < chars[j]) {
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
        System.out.print(chars);
    }

    public static void sortString1(String name) {
        char[] chars = name.toCharArray();
        Arrays.sort(chars);
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder append = stringBuilder.append(chars);
        System.out.println(append);
    }

    public static void sortString2(String name) {
        char[] chars = name.toCharArray();
        TreeSet<Character> treeSet = new TreeSet<>();
        for (char ch : chars) {
            treeSet.add(ch);
        }
        System.out.println(treeSet);
    }

    public static void s(String name) {
        name.replace("T", "V");
    }

    public static void stringOccurance(String name) {
        char[] chars = name.toCharArray();
        HashMap<Character, Integer> hashmap = new HashMap<>();
        for (char ch : chars) {
            if (hashmap.containsKey(ch)) {
                hashmap.put(ch, hashmap.get(ch) + 1);
            } else {
                hashmap.put(ch, 1);
            }
            for (Map.Entry entry : hashmap.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }

        }
    }

    public static void replace(String name, char target, char replace) {
        char[] chars = name.toLowerCase().toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            char c = name.charAt(i);
            if (c == target) {
                stringBuilder.append(replace);
            } else {
                stringBuilder.append(c);
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
