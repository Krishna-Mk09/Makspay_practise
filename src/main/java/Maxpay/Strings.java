package Maxpay;

public class Strings {
    public static void main(String[] args) {
//        String name = "V=mshikrihsn=";
        char target = '=';
        char replace = 'a';
//        stringReplace(name, target, replace);
        String[] arr = {"dog", "cat", "mom", "add"};
        stirngCompare(arr);
    }


    public static void sort(String charss) {
        char[] chars = charss.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (chars[i] < chars[j]) {
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
        System.out.println(chars);
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


    public static void replace(String name) {
        String s = name.toUpperCase();
        String replace = s.replace("T", "I");
        System.out.println(replace);

    }

    public static void primeNumber(int num) {
        for (int i = 0; i <= num; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
    }

    public static void prime(int number) {
        for (int i = 0; i <= number; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i + " ");
            }
        }

    }


    public static void Stri(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (String s : array) {
            System.out.print(s + " ");
        }
    }


    public static void stirngCompare(String[] array) {
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
            System.out.print(str + " ");
        }

    }

    public static void replace(String string, char target, char replace) {


//
//            StringBuilder s = new StringBuilder();
//            for (int i = 0; i < string.length(); i++) {
//                char c = string.charAt(i);
//                if (c == target) {
//                    s.append(replace);
//                } else {
//                    s.append(c);
//                }
//
//                String result = s.toString();
//                System.out.println(replace);
//            }
//        }

    }
}
