package com.jdbc.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcFirst {

	public static void main(String[] args) {
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/peopleinfo", "root", "Mohan@123");
			//String sql ="Create table peopleinfo (sid int(10) , sname varchar(30) , saddress varchar(30))";
	String sql = "insert into  peopleinfo values(2, 'devu' , 'chandrikapuram')";
			Statement statement=connection.createStatement();
			statement.executeUpdate(sql);
			
			System.out.println("success...!");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("Failed..!");
			
		}

	}

}
