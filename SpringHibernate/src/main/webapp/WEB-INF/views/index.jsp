<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<html>
<body>
<h2>Welcome ByteTech :)</h2>

<b>
<b>
<a href="showAliens">Show Alines</a>
<b><b>

<hr>

<form action="getAlien" method="get">
  <label for="fname">Enter id to fetch the alien: </label>
  <input type="text" id="id" name="id">
  <input type="submit" value="Submit">
</form>


<br>
<hr>
<br>

<form action="addAlien" method="post">
  <label for="fname">Enter name</label>
  <input type="text" id="name" name="name">
  <input type="submit" value="Submit">
</form>

</body>
</html>
