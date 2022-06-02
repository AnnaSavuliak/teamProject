<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<body>
<h2>Візити</h2>
<br>
<table>
    <tr>
        <th>Ім'я</th>
        <th>Прізвище</th>
        <th>Послуга</th>
        <th>Номер телефону</th>
        <th>Дата</th>
        <th>Коментарі</th>
        <th>Операції</th>
    </tr>
    <c:forEach var = "vis" items="${allVis}">
        <c:url var="updateButton" value = "/updateInfo">
            <c:param name = "visId" value = "${vis.id}"/>
        </c:url>
        <c:url var="deleteButton" value = "/deleteVisit">
            <c:param name = "visId" value = "${vis.id}"/>
        </c:url>
        <tr>
            <td>${vis.name}</td>
            <td>${vis.surname}</td>
            <td>${vis.service}</td>
            <td>${vis.telephone}</td>
            <td>${vis.visit_date}</td>
            <td>${vis.comments}</td>
            <td>
                <input type="button" value="Update" onclick="window.location.href = '${updateButton}'"/>

                <input type="button" value="Delete" onclick="window.location.href = '${deleteButton}'"/>
            </td>
        </tr>

    </c:forEach>


</table>
<br>
<input type="button" value="Add"
       onclick="window.location.href = 'addNewVisit'"/>




</body>





</html>