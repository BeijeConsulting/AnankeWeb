<%@page import="java.util.ArrayList"%>
<%@page import="it.beije.ananke.ecommerce.Product"%>
<%@page import="java.util.List"%>
<%@page import="it.beije.ananke.ecommerce.JPAmanager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product details</title>
</head>
<body>
	<h3>Product details</h3>
	<%	
	JPAmanager jpa = new JPAmanager();
	Product product = new Product();
	int id = Integer.parseInt(request.getParameter("id"));
	product = jpa.findProduct(id);
	%>
	<form action="./OrderServlet" method="get">
	Id:&nbsp;<input type="text" name="id" value="<%=product.getId()%>" disabled/><br>
	Name:&nbsp;<%=product.getName()%><br>
	Description:&nbsp;<%=product.getDesc()%><br>
	Price:&nbsp;<%=product.getPrice()%><br>
	Quantity:&nbsp;<input type="text" name="qnt"/><br>
	<br><input type="submit" value="Add"/>	
	</form>
	
	<br>
	<a href="products.jsp">
		<button>Back</button>
	</a>

</body>
</html>