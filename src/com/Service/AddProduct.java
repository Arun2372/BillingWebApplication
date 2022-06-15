package com.Service;
import java.sql.SQLException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


import com.DataBase.Customer_Buy_ProductTable;  
public class AddProduct {
	private String username;
	private String Pname;
	private int Pquantity;
	private String add;
	private String buy;
	
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
	public String getBuy() {
		return buy;
	}
	public void setBuy(String buy) {
		this.buy = buy;
	}
	
	public int getPquantity() {
		return Pquantity;
	}
	public void setPquantity(int pquantity) {
		Pquantity = pquantity;
	}
	
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String execute() throws SQLException
	{
		Long date= System.currentTimeMillis();
		
		if(Customer_Buy_ProductTable.insert(this.getPname(), this.getPquantity(),this.getUsername(),date))
		{
			if(this.getBuy()!=null)
			{
				return "buy";
			}
			if(this.getAdd()!=null)
			{
				return "add";
			}
		}
		return "retry";
		
	}
	public static void main(String args[])
	{
		Calendar date = Calendar.getInstance();
		long millisecondsDate = date.getTimeInMillis();
		 long millis=System.currentTimeMillis();  
		System.out.println(millis);
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(millis);
		System.out.println(formatter.format(calendar.getTime())); 
		//1653043622330
		//1653043980789
		//20/05/2022
		System.out.println(System.currentTimeMillis());
	}
	
}
