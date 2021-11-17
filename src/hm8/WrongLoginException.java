package hm8;

public class WrongLoginException extends Exception{
    public WrongLoginException(String message) {
        super(message);
        System.out.println("Не верные данные авторизации");
    }

    public WrongLoginException() {
        System.out.println("Login должено содержать только латинские буквы и цыфры");
        System.out.println("Login должен быть не мение 5 символов и не более 20");
    }
}
