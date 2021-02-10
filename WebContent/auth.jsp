<%@page import="it.beije.ananke.ecommerce.JPAmanager"%>
<%@page import="it.beije.ananke.ecommerce.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ricevo i dati della login</title>
</head>
<body>

<%
/*
String username = request.getParameter("username");
String password = request.getParameter("password");
System.out.println("username = " + username);
System.out.println("password = " + password);
*/

/* EQUIVALENTE
User userBean = (User)session.getAttribute("userBean");
if (userBean == null) {
	userBean = new User();	
	session.setAttribute("userBean", userBean);
}

userBean.setUsername(request.getParameter("username"));
userBean.setPassword(request.getParameter("password"));
*/

%>

<jsp:useBean id="userBean" class="it.beije.ananke.ecommerce.User" scope="session"/>

<jsp:setProperty property="email" name="userBean" param="email"/>
<jsp:setProperty property="password" name="userBean" param="password"/>

<%
	JPAmanager jpa = new JPAmanager();
	if (jpa.authentication(userBean.getEmail(), userBean.getPassword())){
		out.print("OK");
	}else{
		out.print("Error");
	}

%>
</body>
</html>