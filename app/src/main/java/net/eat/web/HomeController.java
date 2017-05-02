package net.eat.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.context.annotation.Scope;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.logging.Logger;

import net.eat.domain.Owner;
import net.eat.domain.OwnerDao;
import net.eat.domain.ShoppingCart;
import net.eat.domain.Order;
import net.eat.domain.OrderDao;

@Controller
@Scope("request")
public class HomeController {
    @Autowired
    private OwnerDao owners;

    @Autowired
    private OrderDao orders;

    @Autowired
    private ShoppingCart cart;

    @GetMapping("/home")
    public String home(HttpServletRequest request, Model model) {
        Logger logger = Logger.getLogger("MyLog");
        String username = request.getUserPrincipal().getName();
        Owner owner = this.owners.findByUsername(username);
        ArrayList<Order> orders = this.orders.findAllByRestaurant(owner.getRestaurant());
        logger.info("printing orders");
        for (Order o: orders) {
            logger.info(o.string());
        }
        model.addAttribute("owner", owner);
        model.addAttribute("orders", orders);
        return "home";
    }

    public static void notifyNewOrder(OrderDao orders, Order order) {
        orders.save(order);
    }
}
