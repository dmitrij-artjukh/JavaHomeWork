package hm8;

import java.util.Scanner;

public class OnLineShop {
    public static void main(String[] args) {
        String login;
        String password;
        String confimPassword;
        Auth auth = new Auth();
        Scanner input = new Scanner(System.in);

        System.out.println("Для доступа сначала зарегистрируйтесь");
        System.out.print("Введите логин:");
        login=(input.nextLine());
        System.out.print("Введите пароль:");
        password=(input.nextLine());
        System.out.print("Введите пароль повторно:");
        confimPassword=(input.nextLine());

        auth.signUp(login,password,confimPassword);

        //System.out.println();
        //System.out.println("Войдите в систему.");
        //System.out.print("Введите логин:");
        //login1 = input.nextLine();
        //System.out.print("Введите пароль:");
        //password1=input.nextLine();
        }
}
