package net.eat.web;

import java.util.ArrayList;
import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.WebDataBinder;
import javax.servlet.http.HttpSession;

import net.eat.domain.Restaurant;
import net.eat.domain.RestaurantDao;
import net.eat.domain.Item;
import net.eat.domain.ItemDao;
import net.eat.domain.ShoppingCart;

@Controller
@Scope("request")
public class ShoppingCartController {
    @Autowired
    private RestaurantDao restaurants;

    @Autowired
    private ItemDao items;

    @Autowired
    private ShoppingCart cart;

    @PostMapping("/cart")
    public String update(HttpSession session, Model model) {
        model.addAttribute("restaurants", this.restaurants.findAll());
        model.addAttribute("items", this.items.findAll());
        model.addAttribute("cart", this.cart);
        return "index";
    }
}
