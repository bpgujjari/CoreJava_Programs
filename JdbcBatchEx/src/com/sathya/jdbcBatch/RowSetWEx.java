package com.sathya.jdbcBatch;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class RowSetWEx {
public static void main(String[] args) throws SQLException {
	RowSetFactory fatory= RowSetProvider.newFactory();
	JdbcRowSet jdbcRowSet= fatory.createJdbcRowSet();
	jdbcRowSet.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
	jdbcRowSet.setUsername("gujjari");
	jdbcRowSet.setPassword("bhavani");
	jdbcRowSet.setCommand("select * from emp1");
	jdbcRowSet.execute();
	jdbcRowSet.absolute(3);
	System.out.println(jdbcRowSet.getInt(1)+" "+jdbcRowSet.getString(2)+" "+jdbcRowSet.getDouble(3));
}
}
