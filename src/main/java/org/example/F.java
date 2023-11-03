package org.example;

public class F {

    public static void main(String[] args) {

        String name = "v amshi k";
//        String replace = neme.replace(" ", "");
//        System.out.println(replace);
//        reverseNumber(name);
        int number = 100;
        prime(number);
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
                System.out.print(i + " ");
            }
        }
    }

    public static void reverseNumber(String name) {
        String updated = " ";
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c != ' ') {
                updated = updated + "";
            }
        }
        System.out.println(updated);
    }
}
