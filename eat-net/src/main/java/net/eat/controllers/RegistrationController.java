package net.eat.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.eat.restaurant.RestaurantStore;
import net.eat.restaurant.Restaurant;
import net.eat.PersistentStore;
import java.sql.SQLException;

@Controller
public class RegistrationController {
	@PostMapping("/registration")
	public String registration(@RequestParam(value="givenName") String givenName,
                        @RequestParam(value="familyName") String familyName,
                        @RequestParam(value="email") String email,
                        @RequestParam(value="userName") String userName,
                        @RequestParam(value="passWord") String passWord,
                        @RequestParam(value="restaurantName") String restaurantName,
                        Model model) throws Exception {
        try {
            Restaurant newRestaurant = RestaurantStore.addNewRestaurant(restaurantName);
        } catch (SQLException e) {
            System.out.println(e.getSQLState() + " " + e.getErrorCode());
            return "unimplemented";
        }
        // insert business user
        // insert restaurant items
		return "registration2";
	}
}
