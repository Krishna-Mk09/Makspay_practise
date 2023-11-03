package Maxpay;

public class Nani {
    public static void main(String[] args) {
        String name = "vamhi";
//        StringBuilder stringBuilder = new StringBuilder();
//        char[] chars = name.toCharArray();
//        for (int i = chars.length - 1; i >= 0; i--) {
//            stringBuilder.append(name.charAt(i));
//        }
//        String s = stringBuilder.toString();
//
//
//        if (name.equals(s)) {
//            System.out.println("palindrome");
//        } else {
//            System.out.println("o");
//        }
//    }
//

        int num = 5;
        int i = sumOfNumbers(num);
        System.out.println(i);
    }


    public static void sum(int num) {
//        int reverse = 0;
//        while (num != 0) {
//            int digit = num % 10;
//            reverse = reverse * 10 + digit;
//            num = num / 10;
//        }
//        System.out.println(reverse);


        while(num!=0){
            int reverse = 0;
            int digit=num%10;
             reverse = reverse*10+digit;
             num= num/10;

        }
    }

    public static void sumof(int num) {
        int sum = 0;
        while (num != 0) {
            int dig = num % 10;
            sum = sum + dig;
            num = num / 10;
        }
        System.out.println(sum);
    }

    public static int sumOfNumbers(int number) {
        if (number <= 0) {
            return 0;
        } else {
            return number + sumOfNumbers(number - 1);
        }
    }
}
