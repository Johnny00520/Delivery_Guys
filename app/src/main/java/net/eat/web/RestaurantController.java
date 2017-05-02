package net.eat.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import net.eat.domain.RestaurantDao;
import net.eat.domain.Restaurant;
import net.eat.domain.Item;
import net.eat.domain.ItemDao;

@Controller
public class RestaurantController {
    @Autowired
    private RestaurantDao restaurants;

    @Autowired
    private ItemDao items;

    @PostMapping("/restaurant/create")
    public String createRestaurant(@RequestParam(value="name") String name) {
        Restaurant restaurant = new Restaurant(name);
        this.restaurants.save(restaurant);
        return "index";
    }

    @GetMapping("/restaurant/{name}")
    public String restaurantForm(@PathVariable(value="name") String name, Model model) {
        Restaurant restaurant = this.restaurants.findByName(name);
        ArrayList<Item> items = this.items.findAllByRestaurant(restaurant);
        model.addAttribute("restaurant", restaurant);
        model.addAttribute("items", items);
        return "restaurant";
    }
}
