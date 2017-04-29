package net.eat.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import net.eat.restaurant.comment;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Servlet implementation class CommentController
 */
@Controller
public class CommentController {	
    
    @PostMapping("/comment")
    public String ArrayList(@RequestParam("name") String name,
    						@RequestParam("email") String email,
    						@RequestParam("restaurantName") String restaurantName,
    						@RequestParam("comment") String paragraph,
    						Model model) {
    	comment comment = new comment(name, restaurantName, email, paragraph);
    	return "index2";
    }
    
    @GetMapping("/comment")
    public String GetArrayList(Model model) {
    	return "comment";
    }

}
