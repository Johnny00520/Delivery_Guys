package net.eat.controllers;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderController{
	@PostMapping("/order")
	public String Order(Model model) {
		return "orderview"
	}
}
