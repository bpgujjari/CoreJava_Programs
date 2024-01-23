package jdbcExco;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
public class Test {
public static void main(String[] args) throws ClassNotFoundException,SQLException {
	//Load the driver
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println("Loaded successfully...");
	//Create the connection
	Connection connection =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","gujjari","bhavani");
	System.out.println("successfully");
	//Process the query
	java.sql.Statement statement=connection.createStatement();
	int i=statement.executeUpdate("create table empp(eid number primary key, ename varchar2(20),esal number)");
	System.out.println("Table created successfully..."+i);
	int j=statement.executeUpdate("insert into empp values(111,'gujjari',90900)");
	System.out.println(j);
	int k=statement.executeUpdate("select * from empp");
	System.out.println(k);
	connection.close();
}
}
