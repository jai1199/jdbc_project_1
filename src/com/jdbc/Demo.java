package com.jdbc;
import java.sql.*;
public class Demo 
{
  public static void main(String[] args) throws ClassNotFoundException, SQLException 
  {
	  String url="jdbc:mysql://localhost:3306/student_jdbc_1";
	  String uname="root";
	  String pass="W123@jai";
	  String query="select username from student where rollno=111";
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("driver class loaded successfully");
	Connection con = DriverManager.getConnection("url,uname,pass");
	System.out.println("connection establish successfully");
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery(query);
    rs.next();
    int rollno = rs.getInt(111);
    System.out.println("rollno"+rollno);
    String email = rs.getString("email");
    System.out.println("email"+email);
    stmt.close();
    con.close();
  }
}
