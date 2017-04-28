package net.eat.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import net.eat.domain.RestaurantDao;
import net.eat.domain.Restaurant;

@Controller
public class RestaurantController {
    @Autowired
    private RestaurantDao restaurantDao;

    @PostMapping("/restaurant")
    public String createRestaurant(@RequestParam(value="name") String name) {
        Restaurant restaurant = new Restaurant(name);
        this.restaurantDao.save(restaurant);
        return "index";
    }

    @GetMapping("/restaurant")
    public String restaurantForm(Model model) {
        model.addAttribute("test", "testing");
        return "restaurant";
    }
}
