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
        <li>
            Hamburger
        </li>
		<form action="login_validation" method="post">
		<p>Name: <input type="text" name="name"><br><p>
		<p>Pass: <input type="password" name="password"><br><p>
		<input type="submit" value="login">
		<!-- <input type="submit" value="Sign up"> -->
		<!-- <a href="sign-up.jsp">Sign up</a> -->
		</form>
		<form action="/signup" method="get">
			<h2><input type="submit" value="Sign up"></h2>
		</form>
        <img src="/images/joe.jpg">
        <img src="/images/mike.jpg">
        <img src="/resources/bender.jpg">
	</body>
</html>
