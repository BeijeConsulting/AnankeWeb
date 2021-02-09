<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="it.beije.ananke.web.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Visualizza dati utente</title>
</head>
<body>

<jsp:useBean id="userBean" class="it.beije.ananke.web.User" scope="session"/>

<%
//User userBean = (User)session.getAttribute("userBean");

if (userBean == null) {
%>
<b>DEVI EFFETTUARE L'AUTENTICAZIONE</b>
<%
} else {
%>
CIAO: <jsp:getProperty property="username" name="userBean"/>
<%--h1>CIAO <%= (userBean.getUsername() != null) ? userBean.getUsername() : "" % ></h1> --%>
<%
}
%>
</body>
</html>