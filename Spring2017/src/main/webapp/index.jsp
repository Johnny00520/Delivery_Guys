<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--  
<%@page isELIgnored="false" %>
-->
<html>
<body>
<h2>Hello World ${firstName} ${name}!</h2>
<form action="login_validation" method="post">
	Name: <input type="text" name="name"><br>
	Pass: <input type="password" name="password"><br>
	<input type="submit" value="login">
</form>
</body>
</html>