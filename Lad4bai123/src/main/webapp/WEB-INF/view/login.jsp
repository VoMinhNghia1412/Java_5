<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>VoMinhNghia</title>
</head>
<body>
<form action="/accuont/login" method="post" enctype="multipart/form-data">
</br>username :<input name="username"  value="${user}">
</br>password :<input name="password" value="${pass}">
</br><input type="checkbox" name="remember" value="true"> Remmeber ?
</br> IMG : <input type="file" name="photo_file">
<br><button>Login</button>
</form>
</body>
</html>