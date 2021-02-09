<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sessione attiva</title>
</head>
<body>
<jsp:useBean id="userBean" class = "it.beije.ananke.rubrica.User" scope = "session"></jsp:useBean>
<jsp:setProperty property="email" name="userBean" param = "email"/>
<jsp:setProperty property="psw" name="userBean" param = "psw"/>

Email: <%= userBean.getEmail() %> <br>
Password: <%= userBean.getPassword() %> <br>
Session: <%= request.getSession() %>> <br>
<a href = "index.jsp"> vai alla rubrica </a> 
           
</body>
</html>