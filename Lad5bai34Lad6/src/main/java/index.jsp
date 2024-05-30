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
<table border="1" style="width:100%">
<tr>
	
	<th>ID</th>
	<th>Name</th>

	<th></th>
</tr>
<c:forEach var="items" items="${items}">
	<tr>
		<td>${items.sanpham_id } </td>
		<td>${items.name }</td>
		
	</tr>
</c:forEach>
</table>
</body>
</html>