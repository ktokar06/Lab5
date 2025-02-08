package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        User user = new User();

        user.setUsername(JOptionPane.showInputDialog("Введите имя пользователя:"));
        user.setPassword(JOptionPane.showInputDialog("Введите пароль:"));
        user.setEmail(JOptionPane.showInputDialog("Введите адрес электронной почты:"));

        UserRegistration userRegistration = new UserRegistration();
        userRegistration.registerUser (user);
    }
}
