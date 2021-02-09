<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.time.LocalDateTime"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Rubrica</title>
</head>

<head>
	
	<meta charset="ISO-8859-1">
	
	<style>
	
	div.a {
	text-align: center;
	}
	
	li {
	text-align: center;
	}
	
	</style>
	
	<title>Rubrica</title>
	
	</head>
	
	
	<body>
	
		<div class = "a">
	
		<h1>RUBRICA</h1>
	
			<p> Benvenuto nella tua rubrica <p>
			
			<jsp:useBean id="userBean" class="it.beije.ananke.web.User" scope="session"/>

			<jsp:setProperty property="username" name="userBean" param="username_param"/>
			<jsp:setProperty property="password" name="userBean"/>


			USERNAME : <%= userBean.getUsername() %><br>
			PASSWORD : <%= userBean.getPassword() %><br>
			
			<p> Seleziona l' operazione che vuoi effettuare <p>
	
		<h3>OPERAZIONI</h3>
	    	
		   <p> <a href="form-inserisci.html">1) INSERISCI UN CONTATTO</a> </p>
		   <p> <a href="http://localhost:8080/AnankeWeb/">2) MODIFICA CONTATTO</a> </p>
		   <p> <a href="http://localhost:8080/AnankeWeb/">3) CERCA UN CONTATTO</a> </p>
		   <p> <a href="http://localhost:8080/AnankeWeb/">4) ELIMINA UN CONTATTO</a> </p>
		   <p> <a href="lista-contatti.jsp">5) VISUALIZZA TUTTI I CONTATTI</a> </p>
		    
		    <!--  
		    <li>ESPORTA DA DATABASE A XML</li>
		    <li>ESPORTA DA DATABSE A CSV</li>
		    <li>IMPORTA DA XML A DATABASE</li>
		    <li>IMPORTA DA CSV A DATABASE</li>
		    -->
		</div>

<%
System.out.println(request.getRequestURL() + " index.jsp");
%>

</html>