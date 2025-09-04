<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Chào mừng: ${sessionScope.account.fullName}</h2>
	<p>Username: ${sessionScope.account.userName}</p>
	<p>Email: ${sessionScope.account.email}</p>

	<a href="logout">Đăng xuất</a>
</body>
</html>