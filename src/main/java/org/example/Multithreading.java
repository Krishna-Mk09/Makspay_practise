package org.example;

public class Multithreading  implements  Runnable{

    public void run(){
        System.out.println("DFSZGVDSZ");
    }

    public static void main(String[] args) {
      Thread thread = new Thread(new Multithreading());
      thread.start();

    }
}
