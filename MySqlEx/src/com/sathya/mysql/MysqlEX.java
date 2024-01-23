package com.sathya.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlEX {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/gujjari","root","root");
	
	Statement statement = connection.createStatement();
	int x = statement.executeUpdate("create table emp(eid int,ename varchar(20),esal float)");
	System.out.println("Table created successfully..."+x);
	int r1 = statement.executeUpdate("insert into emp values(111,'devi',10000.45)");
	int r2 = statement.executeUpdate("insert into emp values(222,'deyam',20000.45)");
	int r3 = statement.executeUpdate("insert into emp values(333,'papam',30000.45)");
	int r4 = statement.executeUpdate("insert into emp values(444,'punyam',40000.45)");
	int r5=statement.executeUpdate("update emp set esal=esal+1500 where esal>1000");
	int r6=statement.executeUpdate("delete from emp where eid=111");
	int r7=statement.executeUpdate("drop table emp");
	System.out.println("Data inserted successfully.."+r2+" "+r3+" "+r4+" "+r5+" "+r6);
	System.out.println(r7+"....................");
	statement.close();
	connection.close();
	System.out.println("resources are released successfully...");
	}
}
