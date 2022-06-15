package com.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.DataBase.DataTable;
import com.DataBase.ProductTable;

public class TableData {
	public static String getTableData(String username) throws SQLException, ClassNotFoundException
	{
		int total_price = 0;
		String table = "";
		ResultSet rs = ProductTable.getData();
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
}
