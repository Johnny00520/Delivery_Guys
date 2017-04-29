package net.eat.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import net.eat.domain.Owner;
import net.eat.domain.OwnerDao;

@Controller
public class SignupController {
    @Autowired
    private OwnerDao owners;

    @GetMapping("/signup")
    public String form(Model model) {
        return "signup";
    }

    @PostMapping("/signup")
    public String post(@RequestParam(value="username") String username,
                       @RequestParam(value="password") String password,
                       @RequestParam(value="name") String name,
                       Model model)
    {
        Owner owner = new Owner(username, password, name);
        this.owners.save(owner);
        return "userhome";
    }
}
