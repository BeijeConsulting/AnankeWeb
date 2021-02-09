<%@page import="it.beije.ananke.web.User"%>
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

<jsp:useBean id="userBean" class="it.beije.ananke.web.User" scope="session"/>

<jsp:setProperty property="username" name="userBean" param="username_param"/>
<jsp:setProperty property="password" name="userBean"/>


USERNAME : <%= userBean.getUsername() %><br>
PASSWORD : <%= userBean.getPassword() %><br>
</body>
</html>