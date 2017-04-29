package net.eat.controllers;

import javax.servlet.http.HttpServlet;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class RestaurantController extends HttpServlet {
	
	boolean foundRestaurant = false;
	
	@GetMapping("/{restaurant_name}")
	public String restaurant(Model model, 
			@PathVariable(value="restaurant_name") String restaurant_name) {
		
		foundRestaurant = checkForRestaurant(restaurant_name);
		
		if(!foundRestaurant)
			return "errorNotFound";
		
		model.addAttribute("restaurant_name", restaurant_name);
		
		return "restaurant";
	}
	
	public boolean checkForRestaurant(String name) {
		
		return true;
	}
}