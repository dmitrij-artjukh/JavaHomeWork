package com.pb.artjukh.hw13;


import java.util.Random;
import java.util.Stack;


public class poizvod implements Runnable {
    int result;
    Random rand = new Random();
    Stack<Integer> A = new Stack<>();

    public poizvod(Stack<Integer> A) {
        this.A = A;
    }

    public synchronized void produce(){
    synchronized (A) {
        while (A.size() >= 5) {
            System.out.println("List is Full");
            try {
                A.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        result = rand.nextInt(10);

        System.out.println(result + " produced ");
        A.push(result);
        System.out.println("stack ---"+A);

        A.notifyAll();

    }
         ;}
    @Override
    public void run() {
        System.out.println("Producer get started");

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (true) {
            produce();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
