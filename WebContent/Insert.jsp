<%@page import="it.beije.ananke.rubrica.rubricajpa.jpamanager.JPAManager"%>
<%@page import="it.beije.ananke.rubrica.Contact"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert</title>
	</head>
	<body>
	
		<%
			Contact c = new Contact();
			c.setFirstName(request.getParameter("firstName"));
			c.setLastName(request.getParameter("lastName"));
			c.setPhoneNumber(request.getParameter("phoneNumber"));
			c.setEmail(request.getParameter("email"));
			JPAManager.insert(c);
			response.sendRedirect("ViewContact.jsp?id="+c.getId());
		%>

</body>
</html>