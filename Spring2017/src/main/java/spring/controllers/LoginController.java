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
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;


@Controller
public class LoginController extends HttpServlet{
	
	@RequestMapping(value = "/login_validation", method = RequestMethod.POST)
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
			RequestDispatcher rd = request.getRequestDispatcher("login-success.jsp");
			//RequestDispatcher rd = request.getRequestDispatcher("login-error.jsp");
			rd.forward(request,  response);
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("login-error.jsp");
			rd.forward(request,  response);
		}
		//return "welcomeMessage";
	}	
	
/*
	@RequestMapping(value = "/login_validation", method = RequestMethod.GET)
	public ModelAndView LoginBean() 
	{
		//return new ModelAndView("text", "password", new LoginBean());
	}
		*/

	/*
	public ModelAndView LoginBean() 
public String addUser(@ModelAttribute("SpringWeb") LoginBean LoginBean,
	ModelMap model)
	
	 */
	@RequestMapping(value = "/login_validation", method = RequestMethod.GET)
	public String showAccount(@ModelAttribute("SpringWeb") LoginBean LoginBean,
			ModelMap model)
	{
		//problem 1: doGet returns "void", so can not return a view
		//problem 2: showAccount receives an empty loginbean, why is it empty?
		//problem 3: in login-success, the name isn't making it to the get line
		//question: how do I get information out of the "get"?
		//question: how do I get information into the loginbean?
		
		String name = "TEST";
		if(name.equals(""))
		{
			name = "UNKNOWN";
		}
		model.addAttribute("defaultName", name);
		model.addAttribute("beanName", LoginBean.getName());
		model.addAttribute("password", LoginBean.getPassword());
		
		return "welcomeMessage";
	}
	
}
