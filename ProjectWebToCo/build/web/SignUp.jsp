<%-- 
    Document   : SignUp
    Created on : Dec 1, 2020, 2:30:19 PM
    Author     : Hiệu Bùi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>Login And Registration</title>
        <link rel="stylesheet" href="assets/css/login.css">
        <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet">
        <!-- Material Design Bootstrap -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.19.1/css/mdb.min.css" rel="stylesheet">
    </head>
    <body>
        <div class="sign-up-form">
            <img src="images/user.png" alt="">
            <h1>Đăng ký</h1>
            <form action="signup" method="POST">
                <input type="text" class="input-box" name="name" placeholder="Họ và Tên" required>
                <label>Giới Tính: </label>
                <div class="form-check form-check-inline">
                    <input type="radio" class="form-check-input" value="Male" name="gender" required>
                    <label class="form-check-label" for="materialInline1">Nam</label>
                </div>
                <div class="form-check form-check-inline">
                    <input type="radio" class="form-check-input" value="Female" name="gender">
                    <label class="form-check-label" for="materialInline2">Nữ</label>
                </div>
                <input type="Date" class="input-box" name="dob" placeholder="Ngày Sinh" required>
                <input type="text" class="input-box" name="address" placeholder="Địa chỉ" required>
                <input type="text" class="input-box" name="phone" placeholder="Số điên thoại" required>
                <input type="text" class="input-box" name="username" placeholder="Tên đăng nhập" required>
                <input type="password" class="input-box" name="password" placeholder="Mật Khẩu" required>
                <input type="submit" class="signup-btn" value="Đăng ký">
            </form>
        </div>

    </body>
</html>
