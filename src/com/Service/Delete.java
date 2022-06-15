package com.Service;
import java.sql.SQLException;

import com.DataBase.*;
public class Delete {
	private String username;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String execute() throws ClassNotFoundException, SQLException
	{
		System.out.println(this.getName());
		if(Customer_Buy_ProductTable.deleteProduct(this.getName()))
			return "success";
		return "failure";
	}
	
}
