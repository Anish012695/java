import java.sql.*;
public class database {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        
        try {
            // Step 1: Register JDBC Ucanaccess driver
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

            // Step 2: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\anish\\Documents\\Database1.accdb;memory=false");

            // Step 3: Execute a query
            stmt = conn.createStatement();
	    System.out.println("Statement created Successfully...");
           
	   String sql = "INSERT INTO Student(Rollno, Name, Marks) VALUES (10,'Rajesh',20)";
            // String  sql="CREATE TABLE Faculty(FID int, FName char(20))";
	  
	   //stmt.executeUpdate(sql);
           stmt.execute(sql);            
           
	   System.out.println("Query Executed successfully.");

            } 
       catch (SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();} 
       catch (Exception e) {
            // Handle errors for Class.forName
            e.printStackTrace();} 
       finally {
            // finally block used to close resources
            	try {
                	if (stmt != null) stmt.close();
            	    } 
	    	catch (SQLException se2) 
		    {
            	    } // nothing we can do
            	try 
		    {
                      if (conn != null) 
				conn.close();
            	    } 
	    	catch (SQLException se) 
		    {
                	se.printStackTrace();
            	    } 
               } // end finally
        System.out.println("Goodbye!");
    } // end main
} // end AccessDatabaseExample

