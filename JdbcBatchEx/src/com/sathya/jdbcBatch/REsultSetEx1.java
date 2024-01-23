package com.sathya.jdbcBatch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class REsultSetEx1 {
public static void main(String[] args) throws Exception{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","gujjari","bhavani");
	Statement statement=connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	
	ResultSet se =statement.executeQuery("select eid,ename,esal from emp1");

	se.absolute(3);
	se.updateInt(1, 150);
	se.updateString(2, "ooooooo");
	se.updateDouble(3, 90);
	se.updateRow();
	se.absolute(3);
	System.out.println(se.getInt(1)+" "+se.getString(2)+" "+se.getDouble(3));	
}
}
