package spring.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Servlet implementation class CommentController
 */
@Controller
public class CommentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommentController() {
        super();
        // TODO Auto-generated constructor stub
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
