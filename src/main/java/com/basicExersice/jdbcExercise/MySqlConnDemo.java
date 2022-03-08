package com.basicExersice.jdbcExercise;

import java.sql.*;

public class MySqlConnDemo {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/blog_test";

    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = null;
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("Connect Database....");
            conn.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
