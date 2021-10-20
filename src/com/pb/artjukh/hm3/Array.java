package com.pb.artjukh.hm3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[10];
        int x = 0;
        int sum = 0;
        int y = 0;
        int z = 0;
        boolean sort = false;
        int buf =0;


        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Введите " + (x + 1) + "e число:");
            array[x] = scan.nextInt();
            x++;
        }
        while (x < 10);
        System.out.println("Вы ввели числа: ");
        for (x = 0; x < 10; x++) {
            System.out.print(array[x] + " ");
            sum = sum + array[x];
            if (array[x] > 0) y++;
            else z++;
        }
        System.out.println();
        System.out.println("Сумма введенных чисел равна: " + sum);
        System.out.println("Вы ввели положительных " + y + " и "+ z + " отрицательных числел");
        while(!sort) {
            sort = true;
            for (x = 0; x < array.length-1; x++) {
                if(array[x] > array[x+1]){
                    sort = false;

                    buf = array[x];
                    array[x] = array[x+1];
                    array[x+1] = buf;
                }
            }
        }
        System.out.println("Ваши числа отсортированы:"+ Arrays.toString(array));
    }
    }

