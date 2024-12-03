<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/27/2024
  Time: 9:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Currency Converter</title>
</head>
<body>
<h2>Currency Converter</h2>
<form action="/convert" method="post">
    <label>Rate:</label><br>
    <input type="text" name="rate" placeholder="RATE" value="22000"><br>
    <label> Usd</label><br>
    <input type="text" name="usd" placeholder="usd" value="0"><br>
    <input type="submit" id="submit" value="Converter">
</form>
</body>
</html>