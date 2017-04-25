package net.eat.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;

import net.eat.restaurant.RestaurantStore;

@Controller
public class IndexController {
	@GetMapping("/")
	public String index(@CookieValue(value="username", defaultValue="") String username,
                        @CookieValue(value="password", defaultValue="") String password,
                        Model model) {
        model.addAttribute("username", username);
        model.addAttribute("password", password);
        return "index2";
	}

    @GetMapping("/light")
    public String index(Model model) {
		return "index2-light";
    }
}
