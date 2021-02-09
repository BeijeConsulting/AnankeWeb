<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List" %>
<%@page import="java.util.ArrayList" %>
<%@page import="it.beije.ananke.web.rubrica.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MODIFICA</title>
</head>
<body>

<%

//int id = Integer.parseInt(request.getParameter("parolaChiave")); 
List<Contatto> list = (List<Contatto>)session.getAttribute("listC");
String htmlCode = "";

if(list == null){
	htmlCode += "NESSUN CONTATTO TROVATO!";
}else{


	for(Contatto c : list){

		htmlCode += "|" + c.getId() + " " + c.getNome() + " " + c.getCognome() + " " 
					+ c.getNumeroTel() + " " + c.getMail() + "|" + "<br>";
	
		//htmlCode += "<form action=\"./Elimina.jsp\" method=\"get\"><input type=\"submit\" value=\"ELIMINA\"/></form>";
	
	}

	htmlCode += "<form action=\"./ServletModifica.jsp\" method=\"post\">ID DEL CONTATTO DA MODIFICARE&nbsp;<input type=\"text\" name=\"id\" value=\"\" placeholder=\"ID da eliminare\"/><br/><input type=\"submit\" value=\"ELIMINA\"/></form>";
}
%>


<%= htmlCode %>

%>

</body>
</html>