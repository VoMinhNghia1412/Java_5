<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="/student/save" modelAttribute="sv">
		<form:input path="name" /><br/>
		<form:input path="email" /><br/>
		<form:input path="marks" /><br/>
		
		

		<br/>
		<form:button>OK</form:button>
	</form:form>

</body>
</html>