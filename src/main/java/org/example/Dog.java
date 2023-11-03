package org.example;

public class Dog extends Animal {

    public void run() {
        System.out.println("dogs tsjndsij");
        super.run();
    }

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.run();
    }
}
