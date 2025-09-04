<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đăng nhập bằng hệ thống</title>
</head>
<body>
	<form action="login" method="post">
		<h2>Đăng nhập</h2>
		<c:if test="${alert != null}">
			<h3 style="color: red">${alert}</h3>
		</c:if>
		<input type="text" name="username" placeholder="Tài khoản"> <input
			type="password" name="password" placeholder="Mật khẩu">
		<button type="submit">Đăng nhập</button>
	</form>


</body>
</html>