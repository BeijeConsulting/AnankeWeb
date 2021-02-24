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
	
		<%
			String id = request.getParameter("id");
			List<Contact> contacts = JPAManager.selectByField("id", id);
			Contact c = contacts.get(0);
		%>
		<form action="./Modify.jsp?id=<%=c.getId()%>" method="post">
			<div style="margin:10px; padding:2px;">
				<div style="margin:5px;">
					<label for="firstName">First name</label>
				</div>
				<div style="margin:5px;">
					<input style="padding:10px;" type="text" name="firstName" value="<%=c.getFirstName()%>" size="25px;"/>
				</div>
			</div>
			
			<div style="margin:10px; padding:2px;">
				<div style="margin:5px;">
					<label for="lastName">Last name</label>
				</div>
				<div style="margin:5px;">
					<input style="padding:10px;" type="text" name="lastName" value="<%=c.getLastName()%>" size="25px;"/>
				</div>
			</div>
		
			<div style="margin:10px; padding:2px;">
				<div style="margin:5px;">
					<label for="phoneNumber">Phone number</label>
				</div>
				<div style="margin:5px;">
					<input style="padding:10px;" type="text" name="phoneNumber" value="<%=c.getPhoneNumber()%>" size="25px;"/>
				</div>
			</div>
			
			<div style="margin:10px; padding:2px;">
				<div style="margin:5px;">
					<label for="email">Email</label>
				</div>
				<div style="margin:5px;">
					<input style="padding:10px;" type="text" name="email" value="<%=c.getEmail()%>" size="25px;"/>
				</div>
			</div>
			
			<input type="submit" value="INVIO"/>
		</form>
		<a href = "ViewContact.jsp?id=<%= c.getId() %>">
		<button style="margin:10px; padding:5px;">Back</button> </a>
	
	</body>
</html>