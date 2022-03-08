package com.basicExersice.jdbcExercise;

// Import required packages
// See more detail at http://www.yiibai.com/jdbc/

import java.sql.*;

public class BatchSQLDemo {
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
            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            // Create statement
            System.out.println("Creating statement...");
            stmt = conn.createStatement();

            // Set auto-commit to false
            conn.setAutoCommit(false);

            // First, let us select all the records and display them.
            printRows( stmt );

            // Create SQL statement
            String SQL = "INSERT INTO user (username, password, userid) " +
                    "VALUES('张三', '12345', 456879)";
            // Add above SQL statement in the batch.
            stmt.addBatch(SQL);

            // Create one more SQL statement
            SQL = "INSERT INTO user (username, password, userid) " +
                    "VALUES('李四', '12945', 856879)";
            // Add above SQL statement in the batch.
            stmt.addBatch(SQL);

            // Create one more SQL statement
            SQL = "INSERT INTO user (username, password, userid) " +
                    "VALUES('王五', '19945', 789648)";
            // Add above SQL statement in the batch.
            stmt.addBatch(SQL);

            // Create an int[] to hold returned values
            int[] count = stmt.executeBatch();

            //Explicitly commit statements to apply changes
            conn.commit();

            // Again, let us select all the records and display them.
            printRows( stmt );

            // Clean-up environment
            stmt.close();
            conn.close();
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
                    stmt.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");
    }//end main

    public static void printRows(Statement stmt) throws SQLException{
        System.out.println("Displaying available rows...");
        // Let us select all the records and display them.
        String sql = "SELECT * FROM user";
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
        System.out.println();
        rs.close();
    }//end printRows()
}//end JDBCExample

