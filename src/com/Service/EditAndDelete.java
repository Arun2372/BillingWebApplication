package com.Service;
import com.DataBase.*;
import java.sql.*;
public class EditAndDelete {
	private String username;
	private String name ;
	private int quantity;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String execute() throws ClassNotFoundException, SQLException
	{  
		//System.out.println(this.getName() + " "+ this.getQuantity());
		if(Customer_Buy_ProductTable.updateQuatity(this.getName(), this.getQuantity()))
		return "success";
		return "failure";
	}
}
