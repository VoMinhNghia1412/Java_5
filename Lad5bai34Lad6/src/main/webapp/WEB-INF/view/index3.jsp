<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/product/search" method="post">
	<input name="min" value="${param.min}" placeholder="Min Price?">
	<input name="max" value="${param.max}" placeholder="Max Price?">
	<button>Search</button>
</form>
…
<c:forEach var="item" items="${items}">
	<tr>
		<td>${item.id}</td>
		<td>${item.name}</td>
		<td>${item.price}</td>
		<td>${item.dates}</td>
	</tr>
</c:forEach>

</body>
</html>