<%@ page import="net.eat.controllers.LoginBean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>Viewing
<% 	
	//out.print(request.getAttribute("bean"));


	String name = (String)request.getAttribute("name");
	out.print(": " + name);
	//out.print("Welcome " + bean.getName());
	
%>
</p>
<img src="images/<% out.print((String)request.getAttribute("name")); %>.jpg">
  
<!--  <img src="images/<c: ${name} /> 
  not working
	<p>Welcome, ${name}</p>
	 ${password}

 
 <form method="POST" action="post_comment">
 	<input type="text" name="comment">
 	<input type="submit">
 </form>
</body>
</html>
-->