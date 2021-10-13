package com.pb.artjukh.hm2;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int operand1, operant2;
        String sing;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число:");
        operand1=scan.nextInt();
        System.out.println("Введите знак арифметической операции(+ - * /):");
        sing=scan.next();
        System.out.println("Введите второче сило:");
        operant2= scan.nextInt();

        switch (sing){
            case "+":
                System.out.println("Результат:"+(operand1+operant2));
                break;
            case "-":
                System.out.println("Результат:"+(operand1-operant2));
                break;
            case "*":
                System.out.println("Результат:"+(operand1*operant2));
                break;
            case "/":
                if (operant2 != 0 ){
                 System.out.println("Результат:"+(operand1/operant2));}
                else {
                    System.out.println("На 0 делить нельзя");
                }
                break;

            default:
                System.out.println("Вы ввели не верный знак арифметической операции");
        }
    }
}
