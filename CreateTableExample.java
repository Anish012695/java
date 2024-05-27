import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class CreateTableExample {
// JDBC URL, username, and password of MySQL server
private static final String JDBC_URL =
"jdbc:mysql://localhost:3306/student";
private static final String USERNAME = "root";
private static final String PASSWORD = "Kvs6fsqyma@";
// SQL query to create a table
private static final String CREATE_TABLE_SQL = "CREATE TABLE example_table3 ("
+ "id INT AUTO_INCREMENT PRIMARY KEY,"
+ "name VARCHAR(255),"
+ "age INT)";
public static void main(String[] args) {
try {
// Establishing a connection
Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/student", "root",
"Kvs6fsqyma@");
// Creating a statement
Statement statement = connection.createStatement();
// Executing the query to create the table
statement.execute(CREATE_TABLE_SQL);
// Closing resources
statement.close();
connection.close();
System.out.println("Table created successfully!");
} catch (SQLException e) {
e.printStackTrace();
}
}
}