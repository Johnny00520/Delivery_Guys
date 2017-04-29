package net.eat.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import net.eat.domain.Restaurant;
import net.eat.domain.RestaurantDao;
import net.eat.domain.Item;
import net.eat.domain.ItemDao;

@Controller
public class IndexController {
    @Autowired
    private RestaurantDao restaurants;

    @Autowired
    private ItemDao items;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("restaurants", this.restaurants.findAll());
        model.addAttribute("items", this.items.findAll());
        return "index";
    }
}
