package com.madridpay;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/madridpay_db";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "password";

    public static boolean testConnection() {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            return connection != null;
        } catch (SQLException e) {
            return false;
        }
    }
}

