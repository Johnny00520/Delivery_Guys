package net.eat.web;

import java.util.ArrayList;
import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
public class IndexController {
    @Autowired
    private RestaurantDao restaurants;

    @Autowired
    private ItemDao items;

    @Autowired
    private ShoppingCart cart;

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        
    }

    @GetMapping("/")
    public String index(HttpSession session, Model model) {
        Logger logger = Logger.getLogger("mylog");
        if (cart.data != null) {
            logger.info(String.format("non-null shopping cart: %d", cart.data));
            cart.data += 3;
        } else {
            logger.info(String.format("null shopping cart"));
            cart.data = new Long(27);
        }
        model.addAttribute("restaurants", this.restaurants.findAll());
        model.addAttribute("items", this.items.findAll());
        model.addAttribute("shoppingcart", cart.data);
        return "index";
    }
}
