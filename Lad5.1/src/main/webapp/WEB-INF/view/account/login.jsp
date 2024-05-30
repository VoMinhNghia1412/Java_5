<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 1. xử lý gửi file ... nhớ thêm :  enctype="multipart/form-data" -->
<form action="/account/login" method="post" enctype="multipart/form-data">
    <br/> username : <input name="username" value="${user}" />
    <br/> password : <input name="password" value="${pass}" />
    <br/> <input type="checkbox" name="remember" value="true" />
    <br/>
    
    <br/> Hình ảnh: <input type="file" name="photo_file" /> 
    <br/> <button>Login</button>
</form>

</body>
</html>