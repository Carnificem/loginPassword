package main;

import exception.WrongLoginException;
import exception.WrongPasswordException;

public class LoginPasswordValidate {
    public static boolean validate(String login, String password, String confirmPassword) {
        try {
            if (!login.matches("[A-Za-z0-9_]+") || login.length() >= 20) {
                throw new WrongLoginException();
            }
            if (!password.matches("[A-Za-z0-9_]+") || password.length() >= 20 || !password.equals(confirmPassword)) {
                throw new WrongPasswordException();
            }
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.err.println(e.getMessage());
            return false;
        }
    }
}
