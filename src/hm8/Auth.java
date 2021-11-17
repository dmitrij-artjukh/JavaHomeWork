package hm8;

import java.util.Scanner;

public class Auth {
    private String login;
    private String password;
    private String confimPassword;
    private String loginOk;
    private String passOk;
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfimPassword() {
        return confimPassword;
    }

    public void setConfimPassword(String confimPassword) {
        this.confimPassword = confimPassword;
    }

    public void signUp(String login, String password, String confimPassword) throws WrongLoginException,WrongPasswordException {
        int q = login.length();
        int w = password.length();
        boolean str = login.matches("^[a-zA-Z0-9]+$");
        boolean str2 = password.matches("^[a-zA-Z0-9_]+$");
        if (q > 5 && str == true && q < 20) {
             loginOk=login;
              System.out.println("login ok");}
              else throw new WrongLoginException();

       if (w > 5 && password.equals(confimPassword) && str2 == true) {
           passOk=password;
           System.out.println("password ok ");

       } else  throw new WrongPasswordException();

    }
    public void signIn(String login, String password) throws WrongLoginException{

        if (password.equals(passOk)) System.out.println("Регистрация выполнена успешно.");
       else throw new WrongLoginException("mesg");
    }
}






