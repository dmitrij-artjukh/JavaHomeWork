package com.pb.artjukh.hm4;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1, s2;
       System.out.println("Ввведите первую строку:");
        s1 = sc.nextLine();
        System.out.println("Введите вторую стороку:");
        s2 = sc.nextLine();
        char[] chArr1 = s1.toUpperCase().toCharArray();
        char[] chArr2 = s2.toUpperCase().toCharArray();

        sort(chArr1,chArr2);
        boolean x=string(chArr1,chArr2);
        if (x=true) System.out.println("Это аннаграмма");
           else System.out.println("Это не аннограмма");


    }
    public static  void sort ( char[] chArr1, char[] chArr2){
        for (int i = chArr1.length - 1; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if (chArr1[j] > chArr1[j + 1])
                {
                    char tmp = chArr1[j];
                    chArr1[j] = chArr1[j + 1];
                    chArr1[j + 1] = tmp;
                }
            }
        }
        for (int i = chArr2.length - 1; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if (chArr2[j] > chArr2[j + 1])
                {
                    char tmp = chArr2[j];
                    chArr2[j] = chArr2[j + 1];
                    chArr2[j + 1] = tmp;
                }
            }
        }

    }
 public static boolean string (char[] chArr1, char[] chArr2){
     String valueOfchar1 = String.valueOf(chArr1);
     String valueOfchar2 = String.valueOf(chArr2);
     valueOfchar1 = valueOfchar1.replaceAll(" ", "");
     valueOfchar2 = valueOfchar2.replaceAll(" ", "");

     return (valueOfchar1.equalsIgnoreCase(valueOfchar2));
 }
    }

