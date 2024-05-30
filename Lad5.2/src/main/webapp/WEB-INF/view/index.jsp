<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Category Management</title>
</head>
<body>
	<h3>CATEGORY MANAGEMENT</h3>
	<form:form action="/sanpham/index" modelAttribute="item">
	<form:input path="id" placeholder="Sanpham Id?" />
	<form:input path="product_name" placeholder="Sanpham Product_name?" />
	<hr />
	


	<button formaction="/category/create">Create</button>
	<button formaction="/category/update">Update</button>
	<a href="/category/delete/${item.id }">Delete</a>
	<a href="/category/index">Reset</a>
	<a href="/category/edit/${item.id}">Edit</a>




</form:form>
	
	
	
	<jsp:include page="_table.jsp"/>
</body>
</html>
