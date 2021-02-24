<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Ricevo i dati del FORM</title>
	</head>
	<body>
	
	<%
	String cognome = request.getParameter("cognome");
	String nome = request.getParameter("nome");
	System.out.println("cognome = " + cognome);
	System.out.println("nome = " + nome);
	
	//.. metodo per inserirli nel DB....
	//Contatto contatto = new Contatto();
	//....
	//DBmanager.insertContatto(contatto)
	//DBmanager.insertContatto(cognome, nome, telefono, email)
	
	%>
	
	COGNOME : <%= cognome %><br>
	NOME : <%= nome %><br>
	</body>
</html>