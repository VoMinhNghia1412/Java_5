<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>VoMinhNghia</title>
</head>
<body>



<table border="1" style="width:100%">
<tr>
	<th>Id</th>
	<th>Name</th>
	<th><a href="/product/sort?field=price">Price</a> </th>
	<th>Date</th>

	<th></th>
</tr>
<c:forEach var="items" items="${items}">
	<tr>
		<td>${items.id} </td>
		<td>${items.name }</td>
		<td>${items.price }</td>
		<td>${items.dates }</td>
	</tr>
</c:forEach>
</table>




</body>
</html>