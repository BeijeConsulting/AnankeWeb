<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.time.LocalDateTime"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Prima JSP</title>
	</head>
	<body>
	
	<%
	System.out.println(request.getRequestURL() + " index.jsp");
	
	LocalDateTime now = LocalDateTime.now();
	now = now.plusHours(1);
	
	System.out.println("CIAO ANANKE! :-) console");
	out.print("CIAO ANANKE! :-) 1<br>");
	%>
	<%= "CIAO ANANKE! :-) 2<br>" %>
	
	Data odierna : <%= now %>
	<br><br><br>
	<a href="form.html">VAI AL FORM</a>
	
	</body>
</html>