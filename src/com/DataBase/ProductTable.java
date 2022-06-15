package com.DataBase;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ProductTable {
	
	
	public static ResultSet getData() throws SQLException, ClassNotFoundException
	{
		
		String query = "select * from product;";
		Statement st = ConnectionDB.getConnection().createStatement();
		ResultSet rs = st.executeQuery(query);
		return rs;
		
	}
		
	public static int getPriceData(String Pname) throws SQLException, ClassNotFoundException
	{
		
		String query = "select * from product where Pname = ?;";
		PreparedStatement pst = ConnectionDB.getConnection().prepareStatement(query);
		pst.setString(1, Pname);
		ResultSet rs = pst.executeQuery();
		int price = 0;
		while(rs.next())
			price = rs.getInt(3);
		return price;
		
	}
	
	public static boolean updateProductQuantity(String Pname,int Pquantity,char ch) throws SQLException
	{	
		try {
		String query = "select * from product where Pname = BINARY ? ;";
		PreparedStatement pst = ConnectionDB.getConnection().prepareStatement(query);
		pst.setString(1, Pname);
		ResultSet rs = pst.executeQuery();
		int quantity = 0;
		while(rs.next())
		{
			quantity = rs.getInt(4);
		}
		if(ch=='-')
		quantity = quantity-Pquantity;
		else if(ch=='+')
		quantity = quantity+Pquantity;	
		if(quantity >0)
		{
		query = "update product set Pquantity = ? where Pname = BINARY ? ;";
		PreparedStatement pst1 = ConnectionDB.getConnection().prepareStatement(query);
		pst1.setInt(1, quantity);
		pst1.setString(2, Pname);
		pst1.execute();
		return true;
		} 
		return false;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
}
