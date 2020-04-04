package org.jsp.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Jpa 
{
	private String userName;
	@Id
	private String phoneNo;
	private String email;
	private String password;
	public String getUserName() 
	{
		return userName;
	}
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	public String getPhoneNo() 
	{
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo)
	{
		this.phoneNo = phoneNo;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	

}

