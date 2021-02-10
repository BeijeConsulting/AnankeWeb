<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="it.beije.ananke.commerce.UserBean"%>
<%@page import="it.beije.ananke.commerce.ProductBean"%>
<%@page import="it.beije.ananke.commerce.JPAmanager"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title></title>
</head>
<body>
<%UserBean user = (UserBean) session.getAttribute("utente"); 
  JPAmanager m = new JPAmanager();
%>
	<h1>Benvenuto, <%out.print(user.getFirstName()); %> cosa vuoi comprare?</h1>
	<table>
		<tr>
    		<th>ID</th>
       		<th>NOME</th>
	  		<th>DESCRIZIONE</th>
	   		<th>PREZZO</th>
  		</tr>
  		<% for(ProductBean p : m.letturaProdotti()){
  			%>
  			<tr>
  				<td><% out.print(p.getId()); %></td>
  				<td><% out.print(p.getName()); %></td>
  				<td><% out.print(p.getDesc()); %></td>
  				<td><% out.print(p.getPrice()); %></td>
  				<td>
  					<form action="./ServletPlus" method="post">
  						<input type="submit" value="ACQUISTA"/>
  					</form>
  				</td>
  				<td></td>
  			</tr>
  		<% }%>
	</table>
</body>
</html>