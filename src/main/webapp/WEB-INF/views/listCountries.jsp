<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>COUNTRIES OF THE WORLD</title>
</head>
<body style="text-align:center">
<h1>COUNTRIES OF THE WORLD</h1>
<c:if test="${not empty success}">
    <h3 style="color: green">${success }</h3>
</c:if>
<c:if test="${not empty error}">
    <h3 style="color: red">${error }</h3>
</c:if>
<table border="1" style="margin-left: auto;margin-right: auto;">
    <tr>
        <th>Country Id</th>
        <th>Country Name</th>
        <th>Area</th>
        <th>Population</th>
    </tr>
    <c:forEach items="${list}" var="p">
        <tr>
            <td>${p.countryId}</td>
            <td>${p.countryName}</td>
            <td>
                <fmt:formatNumber type="number" currencySymbol="" value="${p.area}"/>
            </td>
            <td>
                <fmt:formatNumber type="number" currencySymbol="" value="${p.population}"/>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="${pageContext.request.contextPath}/initInsertCountry">Add new country</a>
</body>
</html>