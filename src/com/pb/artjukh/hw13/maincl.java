package com.pb.artjukh.hw13;

import java.util.Stack;

public class maincl {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        poizvod thread1 = new poizvod(stack);// p
        potreb thread2 = new potreb(stack);// c
        Thread A = new Thread(thread1);
        Thread B = new Thread(thread2);
        Thread C = new Thread(thread2);
        A.start();

        B.start();
        C.start();
    }
}
