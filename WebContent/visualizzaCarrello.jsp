<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="i.beije.ananke.web.ecommerce.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Carrello</title>
</head>
<body>
<%

String htmlCode = "";
List<Carrello> list = (List<Carrello>)session.getAttribute("listC");
if(list == null){
	htmlCode += "NESSUN PRODOTTO NEL CARRELLO";
}else{
	htmlCode += "<h2>CARRELLO:</h2><br>";
	
	for(Carrello c : list){

		htmlCode += "| ID Prodotto: " + c.getIdProdotto()  + "|" + " - "  + "&nbsp;&nbsp;Prezzo:"  + "$ " + "|" + "   ";
	
		htmlCode += "QTA:&nbsp;<input type=\"text\" name=\"email\" value=\"0\"><br>";
	}
}


%>

<%= htmlCode %>




</body>
</html>