<%-- 
    Document   : Add_Product
    Created on : Oct 27, 2024, 10:21:29 PM
    Author     : Admin
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="Models.Brand" %>
<%@ page import="Models.Product" %>
<html>
<head>
    <title>Add Product</title>
</head>
<body>
<h2>Add Product</h2>

<form action="addProduct" method="post">
    Product Name: <input type="text" name="productName" required><br>
    Price: <input type="number" step="0.01" name="price" required><br>
    Quantity: <input type="number" name="quantity" required><br>
    
    Brand: 
    <select name="brandId">
        <%
            ArrayList<Brand> brandList = (ArrayList<Brand>) request.getAttribute("brandList");
            for (Brand brand : brandList) {
        %>
            <option value="<%= brand.getIdBrand() %>"><%= brand.getBrandName() %></option>
        <%
            }
        %>
    </select>
    
    <br>
    <input type="submit" value="Add Product">
</form>
</body>
</html>

