package service;

public class WrongPasswordException extends Throwable {
    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
