package net.eat.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import net.eat.restaurant.RestaurantStore;
import net.eat.PersistentStore;

@Controller
public class IndexController {
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("names", RestaurantStore.names());
		return "index";
	}

    @GetMapping("/{name}/{password}")
    public String account(@PathVariable String name,
                          @PathVariable String password,
                          Model model) {
        PersistentStore.insert(name, password);
        return "index";
    }
}
