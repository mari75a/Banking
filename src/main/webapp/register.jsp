<%--
  Created by IntelliJ IDEA.
  User: pentiumcity
  Date: 6/20/2025
  Time: 6:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<form action="http://localhost:8080/jta_bank/register" method="post">
    <table>
        <tr>
            <th>Name</th>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <th>Email</th>
            <td><input type="text" name="email" ></td>
        </tr>
        <tr>
            <th>password</th>
            <td><input type="password" name="password" ></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" name="submit" value="Register"></td>
        </tr>
    </table>
</form>
</body>
</html>
