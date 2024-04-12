<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@page isELIgnored="false" %>

<html>
<head>
  <title>Categories page</title>
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
<H2>Categories</H2>
<c:set var="categories" value="${requestScope.categories}" />
  <table>
    <thead>
    <tr>
      <th>Name</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${categories}" var="category">
      <tr>
        <td>${category.name}</td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
</body>
</html>