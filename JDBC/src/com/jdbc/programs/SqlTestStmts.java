package com.jdbc.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SqlTestStmts {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/friday", "root", "Mohan@123");
			//String sql = "create table empdetail(eid int(10),ename varchar(30), esalary int(30))";
		//String sql ="insert into empdetail values(40, 'chukku','40000')";
			//String sql="update empdetail set ename = 'rintu' where eid = '20'";
			String sql="delete from empdetail where eid='20' ";
			Statement statement=connection.createStatement();
			statement.executeUpdate(sql);
			
			System.out.println("Success...!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed...!");
		}
	}
}
