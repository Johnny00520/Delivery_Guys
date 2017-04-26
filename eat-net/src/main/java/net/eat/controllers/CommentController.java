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
//extends HttpServlet {
	
//	private String name;
//	private String email;
//	private String comment;
//	private String restaurantName;
//	
//	public CommentController (String name, String email, String restaurantName, String comment) {
//		this.name = name;
//		this.email = email;
//		this.restaurantName = restaurantName;
//		this.comment = comment;
//	}
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommentController() {
        //super();
        // TODO Auto-generated constructor stub
    }

    //@RequestMapping(value = "/comment", method = RequestMethod.POST)
    //public ArrayList() {
    	
    //}
    
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

	@RequestMapping(value = "/post_comment", method = RequestMethod.POST)
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String comment = request.getParameter("comment");
		request.setAttribute("comment", comment);
		RequestDispatcher rd = request.getRequestDispatcher("login_validation?account=mike");
		rd.forward(request,  response);
		//return "welcomeMessage";
	}
	
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@RequestMapping(value = "/post_comment", method = RequestMethod.GET)
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//response.setContentType("text/html");
		//PrintWriter out = response.getWriter();
		//String name = request.getParameter("comment");
		//request.setAttribute("comment", comment);
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		//rd.forward(request,  response);
	}
}
