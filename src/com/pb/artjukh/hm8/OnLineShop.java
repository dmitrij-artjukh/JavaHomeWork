package com.pb.artjukh.hm8;

import java.util.Scanner;

public class OnLineShop {
    public static void main(String[] args)  {
        String login;
        String password;
        String confimPassword;
        Auth auth = new Auth();
        Scanner input = new Scanner(System.in);

        System.out.println("Для доступа сначала зарегистрируйтесь");
        System.out.print("Введите логин:");
        login = (input.nextLine());
        System.out.print("Введите пароль:");
        password = (input.nextLine());
        System.out.print("Введите пароль повторно:");
        confimPassword = (input.nextLine());

        try {
            auth.signUp(login,
                    password,
                    confimPassword);

        } catch (WrongLoginException e1) {
            e1.getMessage();
        } catch (WrongPasswordException e2) {
            e2.getMessage();
        }

        System.out.println();
        System.out.println("Войдите в систему.");
        System.out.print("Введите логин:");
        login = input.nextLine();
        System.out.print("Введите пароль:");
        password = input.nextLine();

   try { auth.signIn(login,
            password);
    }
catch (WrongLoginException e3)
    {

        e3.getMessage();
    }

    }
}