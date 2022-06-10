<%-- 
    Document   : Log
    Created on : Dec 10, 2020, 1:52:11 PM
    Author     : Hiệu Bùi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login And Registration</title>
    <link rel="stylesheet" href="assets/css/login.css">
</head>
<body>
    <div class="sign-up-form">
        <img src="images/user.png" alt="">
        <h1>Đăng Nhập</h1>
        <form action="login" method="POST">
            <input type="text" class="input-box" name="acc1" placeholder="Tên Đăng Nhập" required>
            <input type="password" class="input-box" name="pass1" placeholder="Mật Khẩu" required>
            <input type="submit" class="signup-btn" value="Đăng Nhập">
            <p>Chưa có tài khoản? <a href="SignUp.jsp">Đăng ký ngay</a></p>
        </form>
    </div>
    
</body>
</html>
