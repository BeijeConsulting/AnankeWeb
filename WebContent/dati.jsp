<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mostro i dati del FORM</title>
</head>
<body>

<%
String cognome = (String) session.getAttribute("cognome");
String nome = (String) session.getAttribute("nome");
//System.out.println("cognome = " + cognome);
//System.out.println("nome = " + nome);

%>

COGNOME : <%= cognome %><br>
NOME : <%= nome %><br>
</body>
</html>