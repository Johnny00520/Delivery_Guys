package net.eat.controllers;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;


@Controller
public class LoginController {

    @PostMapping("/login_validation")
	public String doPost(@RequestParam("name") String name,
                         @RequestParam("password") String password,
                         Model model) throws ServletException, IOException {
        System.out.println("RUNNING LOGIN VALIDATION");
		//response.setContentType("text/html");
		//PrintWriter out = response.getWriter();
		//String name = request.getParameter("name");
		//String password = request.getParameter("password");
        model.addAttribute("name", name);
        model.addAttribute("password", password);
		LoginBean bean = new LoginBean();
		bean.setName(name);
		bean.setPassword(password);
		//request.setAttribute("bean", bean);
		boolean status = bean.validate();
		if(status)
		{
			//RequestDispatcher rd = request.getRequestDispatcher("/login-success.jsp");
			//RequestDispatcher rd = request.getRequestDispatcher("login-error.jsp");
			//rd.forward(request,  response);
            return "login-success";
		}
		else {
			//RequestDispatcher rd = request.getRequestDispatcher("/login-error.jsp");
			//rd.forward(request,  response);
            return "login-error";
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

		public String showAccount(@ModelAttribute("SpringWeb") LoginBean LoginBean,
			ModelMap model)

	 */
	@RequestMapping(value = "/login_validation", method = RequestMethod.GET)
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		//problem 1: doGet returns "void", so can not return a view
		//problem 2: showAccount receives an empty loginbean, why is it empty?
		//problem 3: in login-success, the name isn't making it to the get line
		//question: how do I get information out of the "get"?
		//question: how do I get information into the loginbean?
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("account");
		request.setAttribute("name", name);
		
		if(name.equals(""))
		{
			name = "UNKNOWN";
		}
		RequestDispatcher rd = request.getRequestDispatcher("account.jsp");
		//RequestDispatcher rd = request.getRequestDispatcher("login-error.jsp");
		rd.forward(request,  response);
		
		
		
		//model.addAttribute("defaultName", name);
		//model.addAttribute("beanName", LoginBean.getName());
		//model.addAttribute("password", LoginBean.getPassword());
		
		//return "welcomeMessage";
	}
	
}

