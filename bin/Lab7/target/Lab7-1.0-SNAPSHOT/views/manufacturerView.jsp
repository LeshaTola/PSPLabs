<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Производители</title>
</head>
<body>
<div align="center">
    <h1>Производители</h1>
    <table style="border-collapse: collapse; width: 100%; text-align: center;">
        <thead>
        <tr style="border: 1px solid black;">
            <th style="border: 1px solid black;">Название</th>
            <th style="border: 1px solid black;">Страна</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${manufacturerList}" var="item">
            <tr style="border: 1px solid black;">
                <td style="border: 1px solid black;" > ${item.getName()}</td>
                <td style="border: 1px solid black;">${item.getCountry()}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
