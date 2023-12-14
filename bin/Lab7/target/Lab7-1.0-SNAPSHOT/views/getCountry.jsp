<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete</title>
</head>
<body>
<section>
    <p>Введите Страну</p>
    <form method="post" action="${Action}">
        <input type="text" name="country">
        <button type="submit">Отправить</button>
    </form>

</section>
<form method="get" action="main">
    <button onclick="location.href='/main'">Назад</button>
</form>
</body>
</html>
