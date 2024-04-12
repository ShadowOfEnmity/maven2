<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@page isELIgnored="false" %>

<html>
<head>
    <title>Products page</title>
    <style>
        table,
        th,
        td {
            padding: 10px;
            border: 1px solid black;
            border-collapse: collapse;
        }
    </style>
</head>
<body>
<H2>Products</H2>
<c:set var="products" value="${requestScope.products}" />
<table>
    <thead>
    <tr>
        <th>Name</th>
        <th>Price</th>
        <th>Category</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${products}" var="product">
        <tr>
            <td>${product.name}</td>
            <td>${product.price}</td>
            <td>${product.category.name}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>