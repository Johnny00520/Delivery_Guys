package net.eat.web;

import java.util.ArrayList;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.ServletException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import net.eat.domain.Restaurant;
import net.eat.domain.RestaurantDao;
import net.eat.domain.Item;
import net.eat.domain.ItemDao;

@Controller
public class LoginController {
    @Autowired
    private RestaurantDao restaurants;

    @Autowired
    private ItemDao items;

    @GetMapping("/login")
    public String form(Model model) {
        return "login";
    }

    @PostMapping("/login")
    public String post(@RequestParam(value="username") String username,
                       @RequestParam(value="password") String password,
                       Model model,
                       HttpServletRequest request) throws ServletException {
        request.login(username, password);
        return "redirect:/home";
    }

    @RequestMapping("/logout")
    public String logout(HttpServletRequest request) throws ServletException {
        request.logout();
        return "redirect:/index";
    }
}
