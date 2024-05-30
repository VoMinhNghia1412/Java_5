<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>VoMInhNghia</title>
</head>
<body>
<form action="/product/save" method="post">
<input name="name">
<input name="price">
<button>Save</button>
</form>
<ul>
<li>${product.name}</li>
<li>${product.price}</li>
</ul>

</br>Danh sach san pham

<c:forEach var="p" items="${items}">
<li>${p.name}</li>
<li>${p.price}</li>
</c:forEach>



</body>
</html>