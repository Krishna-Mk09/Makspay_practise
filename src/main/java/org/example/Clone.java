package org.example;

public class Clone {
    int length = 10;
    int breath = 20;

    public static void main(String[] args) {

        Clone clone1 = new Clone();
        Clone clone2 = new Clone();
        clone2.length = clone1.length;
        clone2.breath = clone1.breath;
        clone1.length = 100;
        System.out.println(clone2.length + " " + clone2.breath);
        clone1.length = 50;
        System.out.println(clone2.length + "sdaf " + clone2.breath);


    }
}
