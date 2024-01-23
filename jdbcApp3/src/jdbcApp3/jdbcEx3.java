package jdbcApp3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdbcEx3 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe"
			,"gujjari","bhavani");
	PreparedStatement preparedStatement =connection.prepareStatement("insert into OP values(?,?,?)"); 
	Scanner sc=new Scanner(System.in);
	while(true)
	{
		System.out.println("enter eid...");
		int eid=sc.nextInt();
		System.out.println("enter ename...");
		String ename= sc.next();
		System.out.println("Enter esal...");
		double esal=sc.nextDouble();
		
		preparedStatement.setInt(1, eid);
		preparedStatement.setString(2, ename);
		preparedStatement.setDouble(3, esal);
		preparedStatement.executeUpdate();
		System.out.println("inserted data success fully .....Do you want insert another record...(yes/no)");
		String option=sc.next();
		if(option.equals("no"))
			break;
		}
	sc.close();
	connection.close();
	preparedStatement.close();
	System.out.println("All connections released Successfully...");
}
}
