<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>

	<h3>LOGIN</h3>
		<form action="./ServletLogin" method="post">
 			Email&nbsp;<input type="text" name="email" value="" placeholder=""/><br>
 			Password&nbsp;<input type="text" name="password" value="" placeholder=""/><br/>
			<br><input type="submit" value="Login"/>
		</form>

</body>
</html>