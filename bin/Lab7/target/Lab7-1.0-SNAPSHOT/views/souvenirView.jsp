<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Сувениры</title>
</head>
<body>
<div align="center">
    <h1>Сувениры</h1>
    <table style="border-collapse: collapse; width: 100%; text-align: center;">
        <thead>
        <tr style="border: 1px solid black;">
            <th style="border: 1px solid black;">Название</th>
            <th style="border: 1px solid black;">Детали производства</th>
            <th style="border: 1px solid black;">Дата создания</th>
            <th style="border: 1px solid black;">Цена</th>
            <th style="border: 1px solid black;">Производитель</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${souvenirList}" var="item">
            <tr style="border: 1px solid black;">
                <td style="border: 1px solid black;" > ${item.getName()}</td>
                <td style="border: 1px solid black;">${item.getManufacturerDetails()}</td>
                <td style="border: 1px solid black;">${item.getReleaseDate()}</td>
                <td style="border: 1px solid black;">${item.getPrice()}</td>
                <td style="border: 1px solid black;">${item.getManufacturer().getName()}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
