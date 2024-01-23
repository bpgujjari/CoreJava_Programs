package com.sathya.jdbcBatch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetEX {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","gujjari","bhavani");
	Statement statement=connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	ResultSet set =statement.executeQuery("select * from emp1");
	set.afterLast();
	while(set.previous()) {
	System.out.println(set.getInt(1)+" "+set.getString(2)+" "+set.getDouble(3));
	}
	set.first();
	System.out.println(set.getInt(1)+" "+set.getString(2)+" "+set.getDouble(3));	
		System.out.println("*******************");
		
		try {
	ResultSet se =statement.executeQuery("select eid,ename,esal from emp1");

	se.absolute(3);
	se.updateInt(1, 150);
	se.updateString(2, "ooooooo");
	se.updateDouble(3, 90);
	se.updateRow();
	set.absolute(3);
	System.out.println(se.getInt(1)+" "+se.getString(2)+" "+se.getDouble(3));	
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

}
}
