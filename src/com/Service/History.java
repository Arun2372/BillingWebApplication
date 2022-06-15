package com.Service;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.DataBase.*;
public class History {
	public static String getHistoryDate(String username) throws SQLException, ClassNotFoundException
	{
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Calendar calendar = Calendar.getInstance();
		ResultSet rs = DataTable.getAccountData(username);
		String table = "";
		while(rs.next())
		{
			String name = rs.getString(1);
			int quantity = rs.getInt(2);
			int price = rs.getInt(3);
			long date = rs.getLong(5);
			calendar.setTimeInMillis(date);
			table +="<tr><td>"+formatter.format(calendar.getTime())+"</td><td>"+name+"</td><td>"+quantity +"</td><td>"+price+"</td></tr>";
		}
		return table;
	}
}
