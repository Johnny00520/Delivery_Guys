<%@ page import ="java.sql.*" %>
<%
	String user = request.getParameter("userName");
	String pwd = request.getParameter("passWord");
	String fname = request.getParameter("givenname");
	String lname = request.getParameter("familyName");
	String email = request.getParameter("email");
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8080/dbname", "root", "dbpass");
	Statement st = con.createStatement();
	
	int i = st.executeUpdate("insert into members(first_name, last_name, email, user_name, password, registrationDate) values ('" + fname + "','" + lname + "','" + email + "','" + user + "','" + pwd + "', CURDATE())");
	if (i > 0)
	{
		response.sendRedirect("welcomeMessage");
	}
	else
	{
		response.sendRedirect("index.jsp");
	}
%>
