package com.DataBase;

 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountTable {
	
	public static boolean login(String Aname,String password) throws SQLException, ClassNotFoundException
	{
		String query = "select * from account where Aname = ? AND password = ?;";
		PreparedStatement pst = ConnectionDB.getConnection().prepareStatement(query);
		pst.setString(1, Aname);
		pst.setString(2, password);
		ResultSet rs =pst.executeQuery();
		String name = "";
		while(rs.next())
			name = rs.getString(1);
		if(name.equals(Aname))
			return true;
		return false;
		
	}
	
	public static boolean insertAccountData(String name,String password,String cpassword)
	{	
	try {
		if(password.equals(cpassword))
		{
		String query = "insert into account(Aname,password) values(?,?);";
		PreparedStatement pst = ConnectionDB.getConnection().prepareStatement(query);
		pst.setString(1, name);
		pst.setString(2, password);
		if(pst.executeUpdate()>0)
		{
			return true;
		}
		return false;
		}
		return false;
	}
	catch(Exception e)
	{
		return false;
	}
		
	}
	
	public static boolean updatePassword(String name,String password,String cpassword)
	{
		try {
		if(password.equals(cpassword))
		{
			String query = "update account set password = BINARY ? where Aname = BINARY ?;";
			PreparedStatement pst = ConnectionDB.getConnection().prepareStatement(query);
			pst.setString(1, password);
			pst.setString(2, name);
			if(pst.executeUpdate()>0)
			{
				return true;
			}
			return false;	
		}
		return false;
		}
		catch(Exception e)
		{
			return false;
		}
		
	}
	
}
