package com.basicExersice.jdbcExercise;


import java.sql.*;

public class PrepareBatchSQLDemo {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/blog_test";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql = "UPDATE user " +
                    "SET password = '01234' WHERE userid in (1245800, 1245899)";
            stmt.executeUpdate(sql);

            // Now you can extract all the records
            // to see the updated records
            sql = "SELECT * FROM user";
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){
                //Retrieve by column name
                String username = rs.getString("username");
                String password = rs.getString("password");
                int userid = rs.getInt("userid");

                //Display values
                System.out.print("username:" + username);
                System.out.print("password:" + password);
                System.out.println("userid:" + userid);
            }
            rs.close();
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                    conn.close();
            }catch(SQLException se){
            }// do nothing
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");
    }//end main
}//end JDBCExample

