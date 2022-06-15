package com.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {
	
		public static Connection getConnection() throws ClassNotFoundException {
			
			try { 
				Class.forName("com.mysql.cj.jdbc.Driver");
				String user="root";
				String password="Arun@2372";
				String url="jdbc:mysql://localhost:3306/productproject";
				Connection con=DriverManager.getConnection(url,user,password);
				 return con;   
				}catch(Exception e) {
					System.out.println(e);
					return null;
				}
			
		}
		public static void main(String args[]) throws ClassNotFoundException
		{
			if(ConnectionDB.getConnection()!=null)
				System.out.println("Connected");
			else
				System.out.println("Not Connected");
		}
	}

