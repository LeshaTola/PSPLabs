<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<c:if test="${deleted ==false}">
  <p>Не удалось удалить указанного производителя</p>
</c:if>
<c:if test="${deleted ==true}">
  <p>Удаление успешно выполнено</p>
</c:if>
<form method="get" action="main">
  <button onclick="location.href='/main'">Ок</button>
</form>
</body>
</html>

