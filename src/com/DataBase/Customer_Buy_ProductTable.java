package com.DataBase;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Customer_Buy_ProductTable 
{
	public static boolean insert(String Pname,int Pquantity,String UserId,long date) 
	{
		try {
		if(ProductTable.updateProductQuantity(Pname, Pquantity,'-'))
		{
		String query = "insert into customer_buy_product(Pname,Pquantity,UserId,Date) values(?,?,?,?);";
		PreparedStatement pst = ConnectionDB.getConnection().prepareStatement(query);
		pst.setString(1, Pname);
		pst.setInt(2, Pquantity);
		pst.setString(3, UserId);
		pst.setLong(4, date);
		if(pst.executeUpdate()>0)
			return true;
		return false;
		}
		return false;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return false;
		}
		
	}
	
	public static ResultSet getData(String username) throws SQLException, ClassNotFoundException
	{
		
		String query = "select * from customer_buy_product where UserId = BINARY ?;";
		PreparedStatement pst = ConnectionDB.getConnection().prepareStatement(query);
		pst.setString(1, username);
		ResultSet rs = pst.executeQuery();
		return rs;
		
	}
	
	public static boolean updateQuatity(String name,int quantity) throws ClassNotFoundException, SQLException
	{ 
		if(ProductTable.updateProductQuantity(name, Customer_Buy_ProductTable.getQuantityInCustomerTable(name), '+'))
		{
			if(ProductTable.updateProductQuantity(name, quantity , '-'))
			{
				String query = "update customer_buy_product set Pquantity = ? where Pname = BINARY ?;";
				PreparedStatement pst = ConnectionDB.getConnection().prepareStatement(query);
				pst.setInt(1, quantity);
				pst.setString(2,name);
				if(pst.executeUpdate()>0)
					return true;
		    }
			return false;
		}
		return false;
	}
	
	public static boolean deleteProduct(String name) throws ClassNotFoundException, SQLException
	{
		String query = "delete from customer_buy_product where Pname = BINARY ?;";
		PreparedStatement pst = ConnectionDB.getConnection().prepareStatement(query);
		pst.setString(1, name);
		if(pst.executeUpdate()>0)
		return true;
		return false;
	}
	
	public static int getQuantityInCustomerTable(String name) throws ClassNotFoundException, SQLException
	{
		String query = "select * from customer_buy_product where Pname = ?;";
		PreparedStatement pst = ConnectionDB.getConnection().prepareStatement(query);
		pst.setString(1, name);
		ResultSet rs = pst.executeQuery();
		int quantity = 0;
		while(rs.next())
		{
			quantity = rs.getInt(2);
		}
		return quantity;	
	}
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		System.out.println(Customer_Buy_ProductTable.updateQuatity("Apple", 4) );
	}
}
