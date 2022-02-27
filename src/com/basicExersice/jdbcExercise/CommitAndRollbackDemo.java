package com.basicExersice.jdbcExercise;

//STEP 1. Import required packages
import java.net.UnknownServiceException;
import java.sql.*;


public class CommitAndRollbackDemo {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/blog_test";

    //  Database credentials
    static final String USER = "root";
    static final String PASSWORD = "root";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);

            //STEP 4: Set auto commit as false.
            conn.setAutoCommit(false);

            //STEP 5: Execute a query to create statment with
            // required arguments for RS example.
            System.out.println("Creating statement...");
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);

            //STEP 6: INSERT a row into Employees table
            System.out.println("Inserting one row....");
            String SQL = "Insert Into user " +
                    "VALUES('刘力夫', '0000', 2124253)";
            stmt.executeUpdate(SQL);

            //STEP 7: INSERT one more row into Employees table
            SQL = "INSERT INTO user " +
                    "VALUES ('吴艳珍', '1456', 1245864)";
            stmt.executeUpdate(SQL);

            //STEP 8: Commit data here.
            System.out.println("Commiting data here....");
            conn.commit();

            //STEP 9: Now list all the available records.
            String sql = "SELECT * FROM user";
            ResultSet res = stmt.executeQuery(sql);
            System.out.println("List result set for reference....");
            printRs(res);

            //STEP 10: Clean-up environment
            res.close();
            stmt.close();
            conn.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            //Handle errors for JDBC
            e.printStackTrace();
            // If there is an error then rollback the changes.
            System.out.println("Rolling back data here....");
            try{
                if(conn!=null)
                    conn.rollback();
            }catch(SQLException se2){
                se2.printStackTrace();
            }//end try
        }finally {
            //finally block used to close resources
            try{
                if(stmt!=null){
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if(conn!=null){
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        System.out.println("GoodBye!");
    }

    private static void printRs(ResultSet res) throws SQLException {
        //Ensure we start with first row
        res.beforeFirst();
        while (res.next()){
            //Retrieve by column name
            String username = res.getString("username");
            String password = res.getString("password");
            int userid = res.getInt("userid");

            //Display values
            System.out.print("username:" + username);
            System.out.print("password:" + password);
            System.out.println("userid:" + userid);
        }
        System.out.println();
    }
}
