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

@Controller
@Scope("request")
public class HomeController {
    @Autowired
    private OwnerDao owners;

    @Autowired
    private ShoppingCart cart;

    @GetMapping("/home")
    public String home(HttpServletRequest request, Model model) {
        String username = request.getUserPrincipal().getName();
        Owner owner = this.owners.findByUsername(username);
        model.addAttribute("owner", owner);
        model.addAttribute("cart", this.cart);
        return "home";
    }
}
