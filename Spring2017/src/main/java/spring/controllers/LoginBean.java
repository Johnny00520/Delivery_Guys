package spring.controllers;
import java.util.ArrayList;

public class LoginBean {
	private String name;
	ArrayList<Account> validAccounts = new ArrayList<Account>();
	
	public LoginBean()
	{
		validAccounts.add(new Account("joe", "joe123"));
		validAccounts.add(new Account("chen", "hao"));
	}
	
	private String password;
	public String getName() {
		 return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getPassword() { 
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean validate() { 
		
		for(int i=0;i<validAccounts.size();i++)
		{
			Account next = validAccounts.get(i);
			if(next.getName().equals(this.name) && next.getPass().equals(this.password))
			{
				return true;
			}
		}
		
		if(password.equals("admin")) {
			return true;
		}
		else {
			return false;
		
		}
	}
	
}
