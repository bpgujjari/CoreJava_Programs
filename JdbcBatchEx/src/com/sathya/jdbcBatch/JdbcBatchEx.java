package com.sathya.jdbcBatch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcBatchEx {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","gujjari","bhavani");
	Statement statement=connection.createStatement();
	statement.addBatch("create table emp1(eid number, ename varchar2(20), esal number)");
	statement.addBatch("insert into emp1 values(111,'rathan',10000)");
	statement.addBatch("insert into emp1 values(222,'anu',20000)");
	statement.addBatch("insert into emp1 values(333,'chimtu',30000)");
	statement.addBatch("update emp1 set esal=esal+1000 where esal>10000");
	statement.addBatch("update emps set bsal=10 where ename='Lokesh'");
	//statement.addBatch("drop table emp1");
	int [] results=statement.executeBatch();
	for(int result:results) {
		System.out.println(result);
	}
	connection.close();
	System.out.println("success..........");

}
}
