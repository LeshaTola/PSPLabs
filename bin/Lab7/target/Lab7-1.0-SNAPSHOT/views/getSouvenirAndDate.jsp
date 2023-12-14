<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete</title>
</head>
<body>
<section>
    <p>Введите название Сувенира и дату его производства</p>
    <form method="post" action="${Action}">
        <input type="text" name="name" value="${Souvenir.name}">
        <input type="text" pattern="\d{2}\-\d{2}\-\d{4}" name="releaseDate" value="${Souvenir.releaseDate}">
        <button type="submit">Отправить</button>
    </form>

</section>
<form method="get" action="main">
    <button onclick="location.href='/main'">Назад</button>
</form>
</body>
</html>
