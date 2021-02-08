<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List" %>
<%@page import="java.util.ArrayList" %>
<%@page import="it.beije.ananke.web.rubrica.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modifica Contatto</title>
</head>
<body>
<%
String parolaChiave = request.getParameter("parolaChiave"); 

List<Contatto> list = new ArrayList<>();

String htmlCode = "";

list = RubricaJPA.cercaContatti(parolaChiave);

if(list == null){
	htmlCode += "NESSUN CONTATTO TROVATO!";
}else{


	for(Contatto c : list){

		htmlCode += "|" + c.getId() + " " + c.getNome() + " " + c.getCognome() + " " 
					+ c.getNumeroTel() + " " + c.getMail() + "|" + "<br>";
	
	
	}

	htmlCode += " <form action=\"./Modifica.jsp\" method=\"post\">ID DEL CONTATTO DA MODIFICARE&nbsp;<input type=\"text\" name=\"id\" value=\"\" placeholder=\"ID da eliminare\"/><br/><input type=\"submit\" value=\"MODIFICA\"/></form> ";
}

%>


<%= htmlCode %>

</body>
</html>