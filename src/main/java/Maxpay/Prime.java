package Maxpay;

public class Prime {
    public static void main(String[] args) {
        int number = 12;
        if (prima(number)) {
            System.out.println("its prime");
        } else {
            System.out.println("its not");
        }
    }

    public static boolean prima(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }



}

