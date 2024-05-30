<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<form:form action="/student/save" modelAttribute="sv">
		name:
		<form:input path="name" /><br/>
		<form:errors path="name"/><br/>
		email:
		<form:input path="email" /><br/>
		<form:errors path="email"/><br/>
		marks:
		<form:input path="marks" /><br/>
		<form:errors path="marks"/><br/>
		gender:
		<form:radiobuttons items="${genders}" path="gender" /><br/>
		<form:errors path="gender"/><br/>
		faculty:
		<form:checkboxes items="${faculties}" path="faculty" /><br/>
		<form:errors path="faculty"/><br/>
		hobby:
		<form:select path="hobby">
			<form:options items="${hobbies}"></form:options>
		</form:select><br/>
		<form:errors path="hobby"/><br/>
		
		<br/>
		<form:button>OK</form:button>
	</form:form>

	<br/> ${message}
	<form:errors path=""/>


</body>
</html>