package net.eat.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.eat.restaurant.RestaurantStore;

@Controller
public class IndexController {
	@PostMapping("/")
	public String index(@RequestParam(value="dname", defaultValue="") String username,
                        @RequestParam(value="url", defaultValue="") String durl,
                        @RequestParam(value="comment", defaultValue="") String comment,
                        Model model) {
        model.addAttribute("username", username);
        model.addAttribute("password", password);
        model.addAttribute("shouldDisplayComment", true);
        model.addAttribute("comment", comment);
        return "index2";
	}

    @GetMapping("/")
    public String displayNoComment(Model model) {
    	model.addAttribute("shouldDisplayComment", false);
    	
		return "/";
    }
}
