<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="it.beije.ananke.web.rubrica.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>eliminato</title>
</head>
<body>
<% RubricaJPA.eliminaContattoDB(Integer.parseInt(request.getParameter("id"))); %>
</body>
</html>