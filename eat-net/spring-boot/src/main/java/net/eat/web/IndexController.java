package net.eat.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import net.eat.domain.Restaurant;
import net.eat.domain.RestaurantDao;

@Controller
public class IndexController {
    @Autowired
    private RestaurantDao restaurantDao;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("restaurants", this.restaurantDao.findAll());
        return "index";
    }
}
