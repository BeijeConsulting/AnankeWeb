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
			String firstName = c.getFirstName();
			String lastName = c.getLastName();
		%>
		<h1>
			<%=firstName + " " + lastName %>	
		</h1>
	<div style="margin:10px; padding:2px;">
		<div style="margin:5px;">
			<label for="phoneNumber">Phone number</label>
		</div>
		<div style="margin:5px;">
			<input style="padding:10px;" type="text" name="phone number" value="<%=c.getPhoneNumber() %>" size="25px;" readonly/>
		</div>
	</div>
	<div style="margin:10px; padding:2px;">
		<div style="margin:5px;">
			<label for="email">Phone number</label>
		</div>
		<div style="margin:5px;">
			<input style="padding:10px;" type="text" name="email" value="<%=c.getEmail() %>" size="25px;" readonly/>
		</div>
	</div>
	<div>
		<a href = "ModifyContact.jsp?id=<%= c.getId() %>">
			<button style="margin:10px; padding:5px;">Modify</button> </a>
		<a href = "DeleteContact.jsp?id=<%= c.getId() %>">
			<button style="margin:10px; padding:5px;">Delete</button> </a>
	</div>
	
	<div>
		<a href = "PrintForm.jsp">
			<button style="margin:10px; padding:5px;">Back</button> </a>
	</div>

		
	</body>
</html>