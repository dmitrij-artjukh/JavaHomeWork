package com.pb.artjukh.hw13;


import java.util.Stack;

public class potreb implements Runnable {
    Stack<Integer> A = new Stack<>();

    public potreb(Stack<Integer> A) {
        this.A = A;
    }

    public synchronized void consume() {
        synchronized (A) {
            while (A.isEmpty()) {
                System.err.println("List is empty" + A + A.size());
                try {
                    System.err.println("wait");
                    A.wait();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.err.println(A.pop() + " Consumed " + A);
            A.notifyAll();
        }
    }

    @Override
    public void run() {
        System.out.println("New consumer get started");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (true) {
            consume();
        }
    }
}
