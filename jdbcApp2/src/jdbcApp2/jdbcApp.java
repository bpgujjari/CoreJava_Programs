package jdbcApp2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcApp {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
			"gujjari","bhavani");
	PreparedStatement preparedStatement=connection.prepareStatement("update op set id=+? where id>?");
	preparedStatement.setInt(1,100);
	preparedStatement.setDouble(2, 10);
	int count=preparedStatement.executeUpdate();
	System.out.println(count);
}
}
