<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib	prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="${pageContext.request.contextPath }/emp" method="post" modelAttribute="employee">
<!-- 这个jsp需要用在edit页面中，但是如果路径只写“emp”，则会跳转到emp/emp中去，而产生错误
如何写这个的路径呢？添加${pageContext.request.contextPath }/emp -->
<c:if test="${employee.id == null }">
	LastName:<form:input path="lastName"/>
	<br>
</c:if>
<c:if test="${employee.id != null }">
	<form:hidden path="id"/>
	<input type="hidden" name="_method" value="PUT">
	<br>
</c:if>
	<br>
	Email:<form:input path="email"/>
	<br>
	Department:<form:select path="dpetId" items="${dpetId }"></form:select>
	<br>
	<input type="submit" value="Submit"/>
</form:form>
</body>
</html>