package hm8;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(String message) {
        super(message);

    }

    public WrongPasswordException() {
        System.out.println("Пароли должны совпадать");
        System.out.println("Пароль должен быть более 5 символов, содержать только латинские буквы и цифры и знак подчеркивания");
    }
}
