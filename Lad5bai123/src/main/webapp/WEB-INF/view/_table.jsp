<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<table border="1" style="width:100%">
<tr>
	<th>Id</th>
	<th>Name</th>
	<th></th>
</tr>
<c:forEach var="items" items="${items}">
	<tr>
		<td>${items.id} </td>
		<td>${items.product_name }</td>
		<td><a href="/category/edit/${item.id}">Edit</a></td>
	</tr>
</c:forEach>
</table>
