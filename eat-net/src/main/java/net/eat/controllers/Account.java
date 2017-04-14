package net.eat.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class Account {
	private String name;
	private String pass;
	public Account(String name, String pass)
	{
		this.name = name;
		this.pass = pass;
	}
	
	public String getName()
	{
		return name;
	}
	public String getPass()
	{
		return pass;
	}
    public String pictureName() {
    }

    @GetMapping("/account")
    public String viewAccount(@RequestParam("name") String name,
                              @RequestParam("password") String password,
                              Model model) {
        Account account = new Account(name, password);
    }
}
