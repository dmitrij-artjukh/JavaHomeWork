package hm8;

import java.util.Scanner;

public class Auth {
    private String login;
    private String password;
   private  String confimPassword;

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

    public void signUp (String login, String password,String confimPassword)
    {
         int q = login.length() ;
        boolean str= login.matches("^[a-zA-Z0-9]+$");

        if (q > 5 && q <20 && str == true) {
            System.out.println("ok");
        } else System.out.println("исключение");
    }
    public void signIn (String login, String password)
    {

    }

}
