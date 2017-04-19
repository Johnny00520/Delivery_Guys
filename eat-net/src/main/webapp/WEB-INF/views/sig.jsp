<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Registration</title>
	<style>
		body {background-color: powderblue;}
		thead {color:green;}
		h2 {text-align:center;}
		
		table, th, td{
			border: 2px solid black;
		}
	</style>
	</head>
	<body>
		<form method="post" action="registration.jsp">
			h2 <table border="1" width="30%" cellpadding="5">
			<thead>
			  <tr>
				<th colspan="2">New User information</th>
			  </tr>
			</thead>
			<tbody>
			  <tr>
			    <td>First Name</td>
			    <td><input type="text" name="givenName" value="" /></td>
			  </tr>
			  <tr>
			    <td>Last Name</td>
			    <td><input type="text" name="familyName" value="" /></td>
			  </tr>
			  <tr>
			    <td>Personal Email address</td>
			    <td><input type="text" name="email" value="" /></td>
			  </tr>
			  <tr>
			    <td>User Name</td>
			    <td><input type="text" name="userName" value="" /></td>
			  </tr>
			  <tr>
			    <td>Password</td>
			    <td><input type="text" name="passWord" value="" /></td>
			  </tr>
			  <tr>
			    <td><input type="submit" value="Submit" /></td>
			    <td><input type="reset" value="Reset" /></td>
			  </tr>
			  <tr>
			    <td colspan="2">The account has been registered! <a href="index.jsp">Login here</a></td>
			  </tr>
			</tbody>
			</table>
		</form>
	</body>
</html>