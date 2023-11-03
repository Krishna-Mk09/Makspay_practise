package org.example;

public class H {
    public static void main(String[] args) {
        prime(100);


    }

    public  static void prime(int number) {

        for (int i = 0; i <= number; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(i+" ");
            }
        }

    }
}
