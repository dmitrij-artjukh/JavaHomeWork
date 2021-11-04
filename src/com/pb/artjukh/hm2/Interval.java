package com.pb.artjukh.hm2;

import java.util.Scanner;

public class Interval {
    
    public static void main(String[] args) {
        int x;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число в  диапазоне [0..100]:");
        x = scan.nextInt();
        if (x>=0 && x<=100)
        {
            if (x >= 0 && x <= 14) {
                System.out.println("Ваше число в промежутке [0..14]");
            }
            if (x >= 15 && x <= 35) {
                System.out.println("Ваше число в промежутке [15..35]");
            }
            if (x >= 36 && x <= 50) {
                System.out.println("Ваше число в промежутке [36..50]");
            }
            if (x >= 51 && x <= 100) {
                System.out.println("Ваше число в промежутке [51..100]");
            }
        }
        else System.out.println("Значение не в диапазоне [0..100]");
    }

}
