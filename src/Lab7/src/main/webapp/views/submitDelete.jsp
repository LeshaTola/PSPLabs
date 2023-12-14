<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<c:if test="${row <1}">
  <p>Не удалось удалить указанного производителя</p>
</c:if>
<c:if test="${row >=1}">
  <p>Удаление успешно выполнено</p>
</c:if>
<form method="get" action="main">
  <button onclick="location.href='/main'">Ок</button>
</form>
</body>
</html>

