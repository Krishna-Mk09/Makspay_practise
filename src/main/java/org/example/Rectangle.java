package org.example;

public class Rectangle implements Shape {
    @Override
    public void calculateArea() {
        int length=10;int breath=20;
        int result =length+breath;
        System.out.println(result);

    }
}
