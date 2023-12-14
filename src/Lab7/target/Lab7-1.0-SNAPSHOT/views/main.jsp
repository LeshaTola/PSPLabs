<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main page</title>
</head>

<body>
<section>
    <div style="display: flex; justify-content: center; align-items: center;">
        <div>
    <form method="post" action="main?action=findSouvenirByManuf">
        <button style="width:650px" onclick="location.href='main?action=findSouvenirByManuf'">
            Вывести информацию о сувенирах заданного производителя
        </button>
    </form>

    <form method="post" action="main?action=findSouvenirByCountry">
        <button style="width:650px" onclick="location.href='main?action=findSouvenirByCountry'">
            Вывести информацию о сувенирах, произведенных в заданной стране
        </button>
    </form>

    <form method="post" action="main?action=findSouvenirByPrice">
        <button style="width:650px" onclick="location.href='main?action=findSouvenirByPrice'">
            Вывести информацию о производителях, чьи цены на сувениры меньше заданной
        </button>
    </form>

    <form method="post" action="main?action=findManufBySouvenirAndDate">
        <button style="width:650px" onclick="location.href='main?action=findManufBySouvenirAndDate'">
            Вывести информацию о производителях заданного сувенира, произведенного в заданном году
        </button>
    </form>

    <form method="post" action="main?action=delete">
        <button style="width:650px" onclick="location.href='main?action=delete'">
            Удалить заданного производителя и его сувениры
        </button>
    </form>
        </div>
    </div>

</section>
</body>
</html>
