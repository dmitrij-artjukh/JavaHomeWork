package com.pb.artjukh.hm4;

import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args){
        String  string;

       Scanner scan = new Scanner(System.in);
       System.out.println("Введите строку для конвертации:");
       string= scan.nextLine();
        String s = toMethod(string);
       System.out.println(s);
    }
    public static String toMethod(String string){
        StringBuffer buf=new StringBuffer(string);
        for(int n=0;n<buf.length();n++)
            if(n==0 || buf.charAt(n-1)==' ')
                buf.setCharAt(n, Character.toUpperCase(buf.charAt(n)));
        return buf.toString();
    }
}
