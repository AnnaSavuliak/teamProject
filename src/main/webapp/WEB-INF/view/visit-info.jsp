<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<body>
<h2>Visit Info</h2>
<br>

<form:form action="saveVisit" modelAttribute="visit">

    <form:hidden path="id"/>
    Name <form:input path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <br><br>
    Service <form:select path="service">
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
    Telephone <form:input path="telephone"/>
    <br><br>
    Date <form:input path="visit_date"/>
    <br><br>
    Comments <form:input path="comments"/>
    <br><br>
    <input type="submit" value="OK">
</form:form>

</body>

</html>