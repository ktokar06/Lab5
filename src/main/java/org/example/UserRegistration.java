package org.example;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UserRegistration {

    public void registerUser (User user) {
        String connectionString = "jdbc:mysql://localhost:3306/Lab_5?useSSL=false&serverTimezone=UTC";
        try (Connection connection = DriverManager.getConnection(connectionString, "root", "secret")) {
            String query = "INSERT INTO Пользователи (Username, Password, Email) VALUES (?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, user.getUsername());
                statement.setString(2, user.getPassword());
                statement.setString(3, user.getEmail());

                statement.executeUpdate();
                JOptionPane.showMessageDialog(null, "Пользователь успешно зарегистрирован!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ошибка регистрации: " + e.getMessage());
        }
    }
}
