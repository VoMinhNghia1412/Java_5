<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nghia</title>
</head>
<body>
<form action="/ctrl/ok" method="post">
<button>OK 1</button>
<button formmethod="get">OK2</button>
<button formaction="/ctrl/ok?x">OK 3</button></br>
Ket qua ? ${message }
</form>
</body>
</html>