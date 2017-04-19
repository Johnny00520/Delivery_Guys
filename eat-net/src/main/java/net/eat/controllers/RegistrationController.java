package net.eat.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.eat.restaurant.RestaurantStore;
import net.eat.PersistentStore;

@Controller
public class RegistrationController {
	@PostMapping("/registration")
	public String registration(@RequestParam(value="givenName") String givenName,
                        @RequestParam(value="familyName") String familyName,
                        @RequestParam(value="email") String email,
                        @RequestParam(value="userName") String userName,
                        @RequestParam(value="passWord") String passWord,
                        Model model) {
        System.out.println(email);
		return "registration";
	}
}
