package org.example;

public class B {
    public static void main(String[] args) {
        int fact = fact1(7);
        System.out.println(fact);
    }

    public static int fact(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * fact(num - 1);
        }

    }

    public static int fact1(int num) {
        int fact = 1;
        for (int i = 1; i < num; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
        return fact;
    }

}
