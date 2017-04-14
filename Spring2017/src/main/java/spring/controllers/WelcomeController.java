

package spring.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController extends HttpServlet {
	/*
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		LoginBean bean = new LoginBean();
		bean.setName(name);
		bean.setPassword(password);
		request.setAttribute("bean", bean);
		boolean status = bean.validate();
		if(status)
		{
			//RequestDispatcher rd = request.getRequestDispatcher("login-success.jsp");
			RequestDispatcher rd = request.getRequestDispatcher("login-error.jsp");
			rd.forward(request,  response);
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("login-error.jsp");
			rd.forward(request,  response);
		}
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@GetMapping("/welcome")
	public String welcome(Model model) {
		model.addAttribute("firstName", "Elizabeth");
		model.addAttribute("name", "Johnny Cheng");
		return "welcomeMessage";
	}
	*/
}
