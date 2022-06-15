package com.Service;
import java.sql.SQLException;

import com.DataBase.*;
public class ForgotPassword {
	private String username;
	private String password;
	private String cpassword;
	
	
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
	
	
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	
	
	public String execute() throws SQLException
	{
		if(AccountTable.updatePassword(this.getUsername(), this.getPassword(),this.getCpassword()))
			return "success";
		return "failure";
	}
}
