package com.basicExersice.jdbcExercise;

import java.sql.*;

public class TestDemo {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/blog_test";

    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            System.out.println("Creating statement...");
            stmt = conn.createStatement();

            String sql;
            sql = "SELECT username, password, userid  FROM user";

            ResultSet res = stmt.executeQuery(sql);

            while (res.next()){
                int userid = res.getInt("userid");
                String username = res.getString("username");
                String password = res.getString("password");

                System.out.println("userid:" + userid);
                System.out.println("username:" + username);
                System.out.println("password:" + password);
            }
            res.close();
            stmt.close();
            conn.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //finally block used to close resources
            try{
                if(stmt!=null)
                    stmt.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
            System.out.println("There are so thing wrong!");
        }
    }

}
