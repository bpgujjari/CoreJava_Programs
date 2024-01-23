package jdbc4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc4 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","gujjari","bhavani");
	Statement statement=connection.createStatement();
	statement.exe
	statement.executeUpdate("create table towel(tid number,tname varchar2(15))");
	statement.executeUpdate("insert into towel values(1,'cotton')");
	statement.executeUpdate("insert into towel values(2,'iiiii')");
	statement.executeUpdate("insert into towel values(3,'nilon')");
	statement.executeUpdate("insert into towel values(4,'semi-cotton')");
	System.out.println("successfully.....");


}
}
