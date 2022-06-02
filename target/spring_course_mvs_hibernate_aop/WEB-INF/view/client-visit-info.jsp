<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
<h2>Інформація про клієнта</h2>
<br>

<form:form action="saveClientVisit" modelAttribute="visit">

    <form:hidden path="id"/>
    Ім'я <form:input path="name"/>
    <br><br>
    Прізвище <form:input path="surname"/>
    <br><br>
    Послуга <form:select path="service">
    <form:option value="Манікюр" lable = "Манікюр"/>
    <form:option value="Стрижка" lable = "Стрижка"/>
    <form:option value="Фарбування волосся" lable = "Фарбування волосся"/>
    <form:option value="Ламінування волосся" lable = "Ламінування волося"/>
    <form:option value="Кератинове вирівнювання" lable = "Кератинове вирівнювання"/>
    <form:option value="Професійний догляд" lable = "Професійний догляд"/>
    <form:option value="Корекція брів" lable = "Корекція брів"/>
    <form:option value="Ламінування вій" lable = "Ламінування вій"/>
</form:select>
    <br><br>
    Номер телефону <form:input path="telephone"/>
    <br><br>
    Дата <form:input path="visit_date"/>
    <br><br>
    Коментар <form:input path="comments"/>
    <br><br>
    <input type="submit" value="OK">
</form:form>

</body>

</html>