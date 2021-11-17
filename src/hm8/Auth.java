package hm8;

import java.util.Scanner;

public class Auth {
    private String login;
    private String password;
   private  String confimPassword;
   private String myloginl;
   private  String mypassword;
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
        int w = password.length();
         boolean str= login.matches("^[a-zA-Z0-9]+$");
        boolean str2= password.matches("^[a-zA-Z_]+$");

        if (q > 5  && str == true && q <20) {
            myloginl=login;
            System.out.println("ok"+myloginl);
        } else System.out.println("исключение");


    if (w > 5 && password.equals(confimPassword) && str2 == true) {
        mypassword=password;

        System.out.println("ok "+mypassword);
    } else System.out.println("исключение");
}

    public void signIn (String login, String password)
    {

    }

}
