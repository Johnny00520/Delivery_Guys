package net.eat.web;

import java.util.ArrayList;
import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.context.annotation.Scope;
import javax.servlet.http.HttpSession;

import net.eat.domain.Restaurant;
import net.eat.domain.RestaurantDao;
import net.eat.domain.Item;
import net.eat.domain.ItemDao;
import net.eat.domain.ShoppingCart;

@Controller
@Scope("request")
public class IndexController {
    @Autowired
    private RestaurantDao restaurants;

    @Autowired
    private ItemDao items;

    @Autowired
    private ShoppingCart cart;

    @GetMapping("/")
    public String index(HttpSession session, Model model) {
        Logger logger = Logger.getLogger("mylog");
        logger.info(String.format("shopping cart: %d", cart.data));
        model.addAttribute("restaurants", this.restaurants.findAll());
        model.addAttribute("items", this.items.findAll());
        model.addAttribute("shoppingcart.data", cart.data);
        return "index";
    }
}
