package main;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends LoginPasswordValidate {
    public static void main(String[] args) {
        String login = "12_skyprologin";
        String password = "_skypropassword";
        String confirmPassword = "12_skypropassword";

        if (validate(login, password, confirmPassword)) {
            System.out.println("Регистрация выполнена успешно");
        }else {
            System.out.println("Ошибка регистрации");
        }
    }
}