package jdbcExco;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Test1 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","gujjari","bhavani");
	java.sql.Statement statement= connection.createStatement();
	int q1=statement.executeUpdate("create table op(id number,name varchar2(10),esal number)");
	int q2=statement.executeUpdate("insert into op values(11,'gujjari',23400)");
	int q3=statement.executeUpdate("insert into op values(12,'bhavnai',89787)");
	int q4=statement.executeUpdate("insert into op values(13,'prasad',9090)");
	int q5=statement.executeUpdate("insert into op values(11,'gujjari1.',25600)");
	System.out.println(q1+"  "+q2+"  "+q3);	
}
}
