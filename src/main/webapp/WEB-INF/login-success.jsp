<%@ page import="net.eat.controllers.LoginBean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>Logged In</p>
<% 	
	//out.print(request.getAttribute("bean"));

	LoginBean bean = (LoginBean)request.getAttribute("bean");
	out.print("Bean: " + bean);
	//out.print("Welcome " + bean.getName());
	
	out.println("HI THERE");
	String name = bean.getName();
	out.println(name);
	out.println("Authenticated with password: " + bean.getPassword());
%>
<a href="?account=<% 
	//THIS IS NOT WORKING, WHY NOT?
	out.println(bean.getName()); 
%>">View my account</a>

<!--  not working
	<p>Welcome, ${name}</p>
	 ${password}
 -->
</body>
</html>