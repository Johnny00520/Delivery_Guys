package net.eat.controllers;

import java.io.IOException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderController{
	@GetMapping("/order")
	public String Order(Model model) {
		return "orderview";
	}
}
