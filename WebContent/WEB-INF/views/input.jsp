<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="emp" method="post" modelAttribute="employee">
	LastName:<form:input path="lastName"/>
	<br>
	<br>
	Email:<form:input path="email"/>
	<br>
	Department:<form:select path="dpetId" items="${dpetId }"></form:select>
	<br>
	<input type="submit" value="Submit"/>
</form:form>
</body>
</html>