<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 10.11.23
  Time: 01:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style type="text/css">
        body {
            background: #020B22;
        }

        table {
            background: black;
            width: max-content;
            margin: auto;
        }

        TD, TH {
            padding: 10px;
            background: wheat;
            border: 2px silver;
        }

        TR {
            background: cadetblue;
        }

        caption {
            align-self: center;
            text-align: center;
            width: 50%;
            background: wheat;

        }

        section {
            align-self: center;
            background: #020B22;
            text-align: center;
            color: white;
        }

        button {
            background: wheat;
            font-size: 15px;
        }

    </style>
    <title>Main page</title>

</head>


<body>

<!--<table>
    <tr>
        <td>
            <table>
                <caption>Фильмы</caption>
                <tr>
                    <th>Имя</th>
                    <th>Имя актера</th>
                    <th>Страна</th>
                    <th>Год вывода</th>
                    <th>Имя продюсера</th>
                </tr>

                <c:forEach var="film" items="${filmList}">
                    <tr>
                        <td><c:out value="${film.name}"/></td>
                        <td><c:out value="${film.actorNames}"/></td>
                        <td><c:out value="${film.country}"/></td>
                        <td><c:out value="${film.releaseYear}"/></td>
                        <td><c:out value="${film.producerNames}"/></td>
                    </tr>
                </c:forEach>

            </table>
        </td>
        <td>
            <table>
                <caption>Актеры</caption>
                <tr>
                    <th>Имя</th>
                    <th>Год рождения</th>
                </tr>

                <c:forEach var="actor" items="${actorList}">
                    <tr>
                        <td><c:out value="${actor.fio}"/></td>
                        <td><c:out value="${actor.birthdayYear}"/></td>
                    </tr>
                </c:forEach>

            </table>
        </td>
        <td>
            <table>
                <caption>Продюсеры</caption>
                <tr>
                    <th>Имя</th>
                    <th>Год рождения</th>
                </tr>

                <c:forEach var="producer" items="${producerList}">
                    <tr>
                        <td><c:out value="${producer.producerFio}"/></td>
                        <td><c:out value="${producer.birthdayProducerYear}"/></td>
                    </tr>
                </c:forEach>
            </table>
        </td>
    </tr>
</table>-->

<section>
    <form method="post" action="main?action=findFilmsYear">
        <button style="width:650px" onclick="location.href='main?action=findFilmsYear'">Найти все фильмы, вышедшие на
            экран в текущем и прошлом году
        </button>
    </form>
    <form method="post" action="main?action=findActorInFilm">
        <button style="width:650px" onclick="location.href='main?action=findActorInFilm'">Вывести информацию об актерах,
            снимавшихся в заданном фильме.
        </button>
    </form>
    <form method="post" action="main?action=findInNFilms">
        <button style="width:650px" onclick="location.href='main?action=findInNFilms'">Вывести информацию об актерах,
            снимавшихся как минимум в N фильмах
        </button>
    </form>
    <form method="post" action="main?action=submitFindActorsProducers">
        <button style="width:650px" onclick="location.href='main?action=submitFindActorsProducers'">Вывести информацию об актерах, которые
            были режиссерами хотя бы одного из фильмов.
        </button>
    </form>
    <form method="post" action="main?action=deleteFilmByYear">
        <button style="width:650px" onclick="location.href='main?action=deleteFilmByYear'">Удалить все фильмы, дата выхода которых
            была более заданного числа лет назад.
        </button>
    </form>
</section>

</body>
</html>
