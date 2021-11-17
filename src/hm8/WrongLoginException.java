package hm8;

public class WrongLoginException extends Exception{
    public WrongLoginException(String message) {
        super(message);
        System.out.println("Не верные данные авторизации");
    }

    public WrongLoginException() {
        System.out.println("Login должен содержать только латинские буквы и цыфры");
        System.out.println("Login должен быть не менее 5 символов и не более 20");
    }
}
