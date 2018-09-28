<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- <script src="scripts/jquery.min.js"></script> -->
<script src="http://libs.baidu.com/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function () {
		$(".delete").click(function() {
			var href = $(this).attr("href");
			$("form").attr("action", href).submit();
			alert("success");
			return false;
		})
	});
</script>
</head>
<body>
<form action="" method="post">
	<input type="hidden" name="_method" value="DELETE"/>
</form>
<c:if test="${empty requestScope.employees }">
	查询后无成员数据
</c:if>
<c:if test="${!empty requestScope.employees }">
	<table border="1" cellpadding="10" cellspacing="0">
		<tr>
			<th>ID</th>
			<th>LastName</th>
			<th>Email</th>
			<th>Department</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		
		<c:forEach items="${requestScope.employees }" var="emp">
			<tr>
				<td>${emp.id }</td>
				<td>${emp.lastName }</td>
				<td>${emp.email }</td>
				<td>${emp.dpetId }</td>
				<td><a href="emp/${emp.id }">edit</a></td>
				<td><a class="delete" href="emp/${emp.id }">delete</a></td>
			</tr>
		</c:forEach>
		
	</table>
</c:if>
<a href="emp">Add new employees</a>
</body>
</html>