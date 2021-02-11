<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order</title>
</head>
<body>
	<h3>Order</h3>
	
	<%=session.getAttribute("email") %>
<!-- mi serve id utente
stato sempre in corso -> confermato quando checkout
amount += qnt*amount di order-item 
creo nuovo order item
serve product id da cui ricavo anche qnt e amount-->
</body>
</html>