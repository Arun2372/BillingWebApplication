package com.Service;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.DataBase.*;
public class Bill {
	public static String getBillTable(String username) throws SQLException, ClassNotFoundException
	{
		int total_price = 0;
		String table = "";
		ResultSet rs = Customer_Buy_ProductTable.getData(username);
		while(rs.next())
		{
			String name = rs.getString(1);
			int quantity = rs.getInt(2);
			int price = ProductTable.getPriceData(name)*quantity;
			Long date = rs.getLong(4);
			table +="<tr><td>"+name+"</td><td>"+quantity+"</td><td>"+ price+"</td></tr>";
			DataTable.storeAccountData(name, quantity, price, username, date);
			total_price += price;
		}
		table +="<tr><td colspan = '2' style='text-align:right;'>Total Amount</td><td>"+ total_price+"</td></tr>";
		return table;
	}
	public static String getTable(String username) throws SQLException, ClassNotFoundException
	{
		int total_price = 0;
		String table = "";
		ResultSet rs = Customer_Buy_ProductTable.getData(username);
		while(rs.next())
		{
			String name = rs.getString(1);
			int quantity = rs.getInt(2);
			int price = ProductTable.getPriceData(name)*quantity;
			table +="<tr><td>"+name+"</td><td>"+quantity+"</td><td>"+ price+"</td></tr>";
			total_price += price;
		}
		table +="<tr><td colspan = '2' style='text-align:right;'>Total Amount</td><td>"+ total_price+"</td></tr>";
		return table;
	}
}
