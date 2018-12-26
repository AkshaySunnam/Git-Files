package com.jdbc.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Batchprocess {
	
	public void withbatchprocess()
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sunday", "root", "Mohan@123");
			String sql1="insert into impdetails (100,'Mohan','123456') ";
			String sql2="update impdetails set iname = 'mukku' where iid = 3";
			String sql3="delete from impdetails where iid=3";
			
			Statement statement=connection.createStatement();
			
			statement.addBatch(sql1);
			statement.addBatch(sql2);
			statement.addBatch(sql3);
			
			statement.executeBatch();
			
			System.out.println("Success..!");
			
			
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("Failed...!");
			
		}
	}

	public static void main(String[] args) {
		
		Batchprocess batchprocess=new Batchprocess();
		batchprocess.withbatchprocess();
		
		
		

	}

}
