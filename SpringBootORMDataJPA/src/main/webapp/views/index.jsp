<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 	<h1>Welcome to ByteTech</h1>

    <a href="getAliens">Get all Aliens</a>

    <br>
 	<hr>
 	<br>

 	<form action="addAlien" method="post">
 	    id : <input type="text" name="id"/> <br><br>
 	    name : <input type="text" name="name"/><br><br>
 	    <input type="submit"/>
 	</form>

    <br>
 	<hr>
 	<br>

 	<form action="getById" method="get">
     		id : <input type="text" name="id"><br><br>
     		<input type="submit">
     </form>
<br>
<hr>
<br>
     <form action="getByName" method="get">
          		name : <input type="text" name="name"><br><br>
          		<input type="submit">
          </form>


</body>
</html>