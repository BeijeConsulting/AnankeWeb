<%@page import="it.beije.ananke.rubrica.rubricajpa.jpamanager.JPAManager"%>
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
		<div style="margin:10px; padding:2px;">
			<div style="margin:5px;">
				<label for="firstName">First name</label>
			</div>
			<div style="margin:5px;">
				<input style="padding:10px;" type="text" name="first name" value="<%=c.getFirstName() %>" size="25px;"/>
			</div>
		</div>
		<div style="margin:10px; padding:2px;">
			<div style="margin:5px;">
				<label for="lastName">Last name</label>
			</div>
			<div style="margin:5px;">
				<input style="padding:10px;" type="text" name="last name" value="<%=c.getLastName() %>" size="25px;"/>
			</div>
		</div>
		<div style="margin:10px; padding:2px;">
			<div style="margin:5px;">
				<label for="phoneNumber">Phone number</label>
			</div>
			<div style="margin:5px;">
				<input style="padding:10px;" type="text" name="phone number" value="<%=c.getPhoneNumber() %>" size="25px;"/>
			</div>
		</div>
		<div style="margin:10px; padding:2px;">
			<div style="margin:5px;">
				<label for="email">Phone number</label>
			</div>
			<div style="margin:5px;">
				<input style="padding:10px;" type="text" name="email" value="<%=c.getEmail() %>" size="25px;"/>
			</div>
		</div>
		<a href ="PrintForm.jsp">
			<input type="submit" value="INVIO"/></a>
		
		<%
			c.setFirstName(request.getParameter("firstName"));
			c.setFirstName(request.getParameter("lastName"));
			c.setFirstName(request.getParameter("phoneNumber"));
			c.setFirstName(request.getParameter("email"));
			JPAManager.update(c);
		%>
	</body>
</html>