package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static String URL = "jdbc:mysql://localhost:3306/student_db"; // URL
    private static String USERNAME = "root"; // Default username
    private static String PASSWORD = ""; // Enter your Password

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL,USERNAME,PASSWORD);
    }

}
