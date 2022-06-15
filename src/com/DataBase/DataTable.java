package com.DataBase;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataTable {
	
	public static ResultSet getAccountData(String userid) throws SQLException, ClassNotFoundException
	{
		
		String query = "select * from data where userId = BINARY ? ORDER BY Date;";
		PreparedStatement pst = ConnectionDB.getConnection().prepareStatement(query);
		pst.setString(1, userid);
		ResultSet rs = pst.executeQuery();
		return rs;
		
	}
	
	public static void storeAccountData(String Pname,int Pquantity,int TotalPrice,String userid,Long date) throws SQLException
	{
		try {
		String query = "insert into data(Pname,Pquantity,TotalPrice,userId,Date) value(?,?,?,?,?);";
		PreparedStatement pst = ConnectionDB.getConnection().prepareStatement(query);
		pst.setString(1, Pname);
		pst.setInt(2, Pquantity);
		pst.setInt(3, TotalPrice);
		pst.setString(4, userid);
		pst.setLong(5, date);
		pst.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println("exception");
		}
	}
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		System.out.println(DataTable.getAccountData("Arun"));
	}

}
