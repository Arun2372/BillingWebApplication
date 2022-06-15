package com.Service;
import java.sql.SQLException;

import com.DataBase.*;
public class Login {
	
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String execute() throws SQLException, ClassNotFoundException
	{
		if(AccountTable.login(this.getUsername(),this.getPassword()))
			return "success";	
		return "failure";
	}
	
}
