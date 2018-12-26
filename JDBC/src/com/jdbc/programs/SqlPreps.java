package com.jdbc.programs;

import java.sql.*;	
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
                                                      // PREPARED STATEMENTS
public class SqlPreps {
	public static void main(String[] args) {
		
	int id= Integer.parseInt(args[0]);
		String name= args[1];
		int salary= Integer.parseInt(args[2]);
		
		
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/sunday", "root", "Mohan@123");
			//String sql ="create table impdetails (iid int(20) , iname  varchar(30), isalary  int(40))";
		String sql="insert into impdetails(iid,iname,isalary) values(?,?,?)";
			PreparedStatement pre=connection.prepareStatement(sql);
			
			pre.setInt(1, id);
			pre.setString(2, name);
			pre.setInt(3, salary);
		
			
			pre.executeUpdate();
			
			System.out.println("Success...!");
			
		} catch (Exception e) 
		{
			e.printStackTrace();
			
			System.out.println("Failed....!");

		}
	}

}
