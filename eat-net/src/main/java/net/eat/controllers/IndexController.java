package net.eat.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.eat.restaurant.RestaurantStore;

@Controller
public class IndexController {
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("names", RestaurantStore.names());
		return "index";
	}
}
