<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>ADD NEW COUNTRY</title>
    <style>
        .errorColor {
            color: red;
        }
    </style>
</head>
<body style="text-align:center">
<h1>ADD NEW COUNTRY</h1>
<h3 class="errorColor">${error}</h3>

<form:form action="insertCountry" modelAttribute="p" method="post">
    <table style="margin-left: auto;margin-right: auto;">
        <tr>
            <td>Country Id:</td>
            <td>
                <form:input type="text" path="countryId" required="required"/>
            </td>
        </tr>
        <tr>
            <td>Country Name:</td>
            <td>
                <form:input type="text" path="countryName" required="required"/>
            </td>
        </tr>
        <tr>
            <td>Area:</td>
            <td>
                <form:input path="area" type="number" required="required"/>
            </td>
        </tr>
        <tr>
            <td>Population:</td>
            <td>
                <form:input path="population" type="number" required="required"/>
            </td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Insert"/>
                <input type="reset" value="Clear"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>