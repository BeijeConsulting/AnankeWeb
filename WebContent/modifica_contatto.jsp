<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modifica Contatto</title>
</head>
<body>
		<h1>Modifica un contatto</h1>
		  
		  <h3>Compila i campi da sostituire</h3>	  
				<form action="./updateContServlet" method="post">
						<input type="hidden" name="id" value="<%=request.getParameter("id")%>">
						<label for="name">Nome</label><br>
						<input type="text" name="name"><br>
						<label for="surname">Cognome</label><br>
						<input type="text" name="surname"><br>
						<label for="telephone">Telefono</label><br>
						<input type="number" name="telephone"><br>
						<label for="email">Email</label><br>
						<input type="email" name="email"><br>
						<input style="margin-top:8px;" type="submit" value="Conferma" >	
				</form>			
</body>
</html>