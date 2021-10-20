package com.pb.artjukh.hm3;

import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        int count = 23;
        int x;
        Scanner scan = new Scanner(System.in);
        for (int y=1; ; y++) {
            System.out.println("Угадайте число от 1 до 100 или введите 101 что бы прервать программу:");
            x = scan.nextInt();

            if (x==101) break;
            if (x == count) {
                System.out.println("Поздравляю! Вы угадали число c "+y+" попыток");
                break;
            }
            else {
                if (x>count) System.out.println("Число больше загаданного"); else System.out.println("Число меньше загаданного");
            }
        }
    }
}
