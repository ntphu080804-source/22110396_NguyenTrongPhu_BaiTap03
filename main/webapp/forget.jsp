<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Quên mật khẩu</h2>
    <form action="${pageContext.request.contextPath}/forget" method="post">
        Nhập tên tài khoản: <input type="text" name="username" required><br>
        <input type="submit" value="Lấy lại mật khẩu">
    </form>
    <c:if test="${alert != null}">
        <p style="color:red;">${alert}</p>
    </c:if>
    <c:if test="${password != null}">
        <p style="color:blue;">Mật khẩu của bạn là: ${password}</p>
    </c:if>
    <a href="${pageContext.request.contextPath}/login">Quay lại đăng nhập</a>
</body>
</html>