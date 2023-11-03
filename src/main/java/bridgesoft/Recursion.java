package bridgesoft;

public class Recursion {
    public static void main(String[] args) {
        int sum = fibo(10);
        System.out.println(sum);
    }

    public static int sum(int number) {
        if (number <= 1) {
            return 1;
        }
        return number + sum(number - 1);
    }

    public static int fact(int num) {
        if (num == 0 | num == 1) {
            return 1;
        }
        return num * fact(num - 1);
    }

    public static int sumOfDigits(int number) {
        if (number < 10) {
            return number;
        }
        return number % 10 + sumOfDigits(number / 10);
    }

    public static int fibo(int num) {
        if (num <= 0) {
            return 1;
        } else
            return fibo(num - 1) + fibo(num - 2);
    }



}
