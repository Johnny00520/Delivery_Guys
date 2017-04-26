package net.eat.controllers;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.eat.restaurant.RestaurantStore;

@Controller
public class IndexController {
    private static ArrayList<String> GetComments() {
        String[] comments = new String[] {
            "I hate all food at this restaurant",
            "I hate the guy to the left of me",
            "I didn't even eat here",
        };
        return new ArrayList<String>(Arrays.asList(comments));
    }


    @GetMapping("/")
    public String index(Model model) {
    	ArrayList<String> comments = GetComments();
        model.addAttribute("comments", comments);
		return "index2";
    }
}
