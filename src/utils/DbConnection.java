package utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection  {
    static Connection conn = null;

    public static Connection getConnection() throws Exception {
        String driver = "com.mysql.jdbc.Driver";
        String connection = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "";

        Class.forName(driver);
        conn = DriverManager.getConnection(connection, user, password);

        return conn;
    }

    public static void createDefaultTables() throws Exception{

    }

}
