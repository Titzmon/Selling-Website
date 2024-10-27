<%-- 
    Document   : home
    Created on : Oct 27, 2024, 10:18:23 PM
    Author     : Admin
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="Models.Account" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<%
    Account loggedInUser = (Account) session.getAttribute("loggedInUser");
    if (loggedInUser != null) {
%>
        <h2>Welcome, <%= loggedInUser.getUsername() %></h2>
        <a href="Add_Product.jsp">Add Product</a>
<%
    } else {
%>
        <h2>Please <a href="login.jsp">login</a> to continue.</h2>
<%
    }
%>
</body>
</html>

