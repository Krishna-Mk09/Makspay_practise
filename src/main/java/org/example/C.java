package org.example;

import java.util.HashMap;
import java.util.Map;

public class C {
    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5};
//        int target = 4;
//        diff(array,target);

    }

    public static void diff(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] - array[j] == target) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }



    }

