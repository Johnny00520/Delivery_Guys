<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--  
<%@page isELIgnored="false" %>
-->
<html>
	<head>
	<style>
		body {background-color: powderblue;}
		h2 {text-align:center;}
		p {text-align:center;}
	</style>
	</head>
	<body>
	<h2>Welcome to Eat-Net ${firstName} ${name}!</h2>
		<form action="login_validation" method="post">
		<p>Name: <input type="text" name="name"><br><p>
		<p>Pass: <input type="password" name="password"><br><p>
		<input type="submit" value="login">
		<!-- <input type="submit" value="Sign up"> -->
		<!-- <a href="sign-up.jsp">Sign up</a> -->
		</form>
		<form action="sig.jsp" method="post">
			<h2><input type="submit" value="Sign up"></h2>
		</form>
	</body>
</html>