<%@page import="it.beije.ananke.jpamanager.JPAManager"%>
<%@page import="it.beije.ananke.rubrica.Contact"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>

		<form action="./Insert.jsp" method="post">
			<div style="margin:10px; padding:2px;">
				<div style="margin:5px;">
					<label for="firstName">First name</label>
				</div>
				<div style="margin:5px;">
					<input style="padding:10px;" type="text" name="firstName" value="" placeholder="first name" size="25px;"/>
				</div>
			</div>
			
			<div style="margin:10px; padding:2px;">
				<div style="margin:5px;">
					<label for="lastName">Last name</label>
				</div>
				<div style="margin:5px;">
					<input style="padding:10px;" type="text" name="lastName" value="" placeholder="last name" size="25px;"/>
				</div>
			</div>
		
			<div style="margin:10px; padding:2px;">
				<div style="margin:5px;">
					<label for="phoneNumber">Phone number</label>
				</div>
				<div style="margin:5px;">
					<input style="padding:10px;" type="text" name="phoneNumber" value="" placeholder="phone number" size="25px;"/>
				</div>
			</div>
			
			<div style="margin:10px; padding:2px;">
				<div style="margin:5px;">
					<label for="email">Email</label>
				</div>
				<div style="margin:5px;">
					<input style="padding:10px;" type="text" name="email" value="" placeholder="email" size="25px;"/>
				</div>
			</div>
			
			<input type="submit" value="INVIO"/>
		</form>
		<a href = "PrintContact.jsp">
		<button style="margin:10px; padding:5px;">Back</button> </a>
	
	</body>
</html>