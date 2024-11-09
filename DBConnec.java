package com.sece;


import java.sql.*;

public class DBConnec {
    private static final String URL = "jdbc:mysql://localhost:3002/AccountManagement";
    private static final String USER = "root";
    private static final String PASSWORD = "ruban26";
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
