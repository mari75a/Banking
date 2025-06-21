<%--
  Created by IntelliJ IDEA.
  User: pentiumcity
  Date: 6/21/2025
  Time: 12:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
  if (session.getAttribute("user")== null){
      response.sendRedirect("login.jsp");

  }
%>
<html>
<head>
    <title>Home </title>
</head>
<body>
    <h1>Hello ,${sessionScope.user}</h1>
    <form action="transfer" method="post">
        <table>
            <tr>
                <th>Source Account No</th>
                <td><input type="text" name="sourceAcNo"></td>
            </tr>
            <tr>
                <th>Destination Account No</th>
                <td><input type="text" name="destinationAcNo"></td>
            </tr>
            <tr>
                <th>Amount</th>
                <td><input type="text" name="amount"></td>
            </tr>
            <tr>
                <th></th>
                <td><input type="submit" name="submit" value="Transfer"></td>
            </tr>
        </table>
    </form>

</body>
</html>
