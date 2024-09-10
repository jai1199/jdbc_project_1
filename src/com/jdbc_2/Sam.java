package com.jdbc_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//inserting data into database
public class Sam 
{
public static void main(String[] args) 
{
	String url ="jdbc:mysql://localhost:3306/student_jdbc_1";
	String username ="root";
	String password ="W123@jai";
	String query = "INSERT into student_detail(rollno,snamel,email,phno,branch)values(119,'john','jhon@165',8888,'computer')";
	String query1 = "INSERT into student_detail values(120,'tigershrof','tiger@123',90879,'police')";
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver classloaded successfully");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	try {
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("connection establish successfully");
		Statement stmt = con.createStatement();
	    int rowsaffected = stmt.executeUpdate(query);
	    int rows = stmt.executeUpdate(query1);
	    if(rowsaffected >=0)
	    {
	    	System.out.println("inserted successfully " +rowsaffected+ "rows affected");
	    }
	    else
	    {
	    	System.out.println("insertion unsuccessfull ");
	    }
	    if(rows>0)
	    	System.out.println("data inserted successfully" +rows+ "rows");
	    else
	    	System.out.println("data insertion failed");
	    con.close();
	    stmt.close();
	    System.out.println("statement closed successfully");
	    System.out.println("connection closed  successfully");
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
}
