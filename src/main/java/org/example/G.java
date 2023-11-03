package org.example;

public class G {
    public static void main(String[] args) {
//        prime(100);
        int[] array = {1, 2, 32, 2, 4, 5, 14, 6, 6, 3, 0};
        minMax(array);
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

    public static void minMax(int array[]) {
        int max = 0;
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);

        for (int i = 0; i < array.length; i++) {
            if (array[i]<min){
                min=array[i];
            }
        }
        System.out.println(min);
    }
}
