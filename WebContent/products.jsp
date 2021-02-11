<%@page import="it.beije.ananke.ecommerce.User"%>
<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@page import="it.beije.ananke.ecommerce.Order"%>
<%@page import="it.beije.ananke.ecommerce.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="it.beije.ananke.ecommerce.JPAmanager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products</title>
</head>
<body>
	<h3>Products</h3>
	<jsp:useBean id="orderBean" class="it.beije.ananke.ecommerce.Order" scope="session"/>
	<%	
	JPAmanager jpa = new JPAmanager();
	
	List<Product> products = new ArrayList<>();
	products = jpa.findAllProducts();
	for(Product product : products){
	%>
	<a href="product-details.jsp?id=<%=product.getId()%>"><%=product.getName()%></a><br>
	<%}%>

</body>
</html>