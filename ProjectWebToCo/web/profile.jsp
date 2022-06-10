<%-- 
    Document   : profile
    Created on : Dec 14, 2020, 3:33:44 PM
    Author     : Hiệu Bùi
--%>

<%@page import="model.NguoiDung"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <meta name="Description" content="Enter your description here" />
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.0/css/all.min.css">
        <link rel="stylesheet" href="assets/css/style.css">
        <script src="https://cdn.jsdelivr.net/npm/vue@2.6.12/dist/vue.js"></script>
        <%
            NguoiDung user = (NguoiDung) session.getAttribute("profile");
        %>
        <style>
            .bd-placeholder-img {
                font-size: 1.125rem;
                text-anchor: middle;
                -webkit-user-select: none;
                -moz-user-select: none;
                -ms-user-select: none;
                user-select: none;
            }

            @media (min-width: 768px) {
                .bd-placeholder-img-lg {
                    font-size: 3.5rem;
                }
            }
        </style>
        <title>Title</title>
    </head>

    <body>


        <!-- <%-- Header --%> -->
        <!-- <%-- ----------------------------------------------------------------------------------------------------------- --%> -->
        <nav class="navbar navbar-expand-sm sticky-top navbar-dark bg-dark">
            <div class="container">
                <img class="navbar-brand" src="assets/images/logo.png" alt="" href="MilkTea" >
                <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse"
                        data-target="#navbar1">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbar1">
                    <ul class="navbar-nav">
                        <li class="nav-item active">
                            <a class="nav-link text-light text-uppercase font-weight-bold" href="MilkTea">Trang Chủ</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link text-light text-uppercase font-weight-bold" href="product">Danh Mục Sản Phẩm</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link text-light text-uppercase font-weight-bold" href="Intro.jsp">Giới Thiệu</a>
                        </li>

                    </ul>
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item">
                            <a class="nav-link text-uppercase text-light" href="profile">${sessionScope.TK}</a>
                        </li>
                        <form action="MilkTea">
                            <c:choose>
                                <c:when test="${sessionScope.TK != null}">
                                    <li class="nav-item">
                                        <a class="nav-link text-light text-uppercase" href="logout">Đăng Xuất</a>
                                    </li>
                                </c:when>
                                <c:otherwise>
                                    <li class="nav-item">
                                        <a class="nav-link text-light text-uppercase" href="login">Đăng Nhập</a>
                                    </li>
                                </c:otherwise>
                            </c:choose>
                        </form>
                        <li class="nav-item active">
                            <a class="nav-link text-light text-uppercase" href="Cart">Giỏ Hàng</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <div class="shopping-cart">
            <div class="px-4 px-lg-0">

                <div class="pb-5">
                    <div class="container">
                        <div class="row">
                            <div class="col-lg-12 p-5 bg-white rounded shadow-sm mb-5">
                                <h1>Hồ sơ cá nhân</h1>
                                <form action="profile" method="post">
                                    <div class="form-group">
                                        <label for="exampleFormControlInput1">Tên Đăng nhập</label>
                                        <input type="text" name="username" class="form-control" id="exampleFormControlInput1" value="<%=user.getTaiKhoan()%>" required readonly>
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleFormControlInput1">Mật Khẩu</label>
                                        <input type="text" name="password" class="form-control" id="exampleFormControlInput1" value="<%=user.getMatKhau() %>" required>
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleFormControlInput1">Họ Tên</label>
                                        <input type="text" name="name" class="form-control" id="exampleFormControlInput1" value="<%=user.getHoTen() %>" required>
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleFormControlInput1">Giới Tính: </label>
                                        <div class="form-check form-check-inline">
                                            <input type="radio" class="form-check-input" value="Male" name="gender" <%=user.isGioiTinh() ? "checked" : "" %> required>
                                            <label class="form-check-label" for="materialInline1">Nam</label>
                                        </div>
                                        <div class="form-check form-check-inline">
                                            <input type="radio" class="form-check-input" value="Female" name="gender" <%=!user.isGioiTinh() ? "checked" : "" %> required>
                                            <label class="form-check-label" for="materialInline2">Nữ</label>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleFormControlInput1">Ngày Sinh</label>
                                        <input type="date" name="dob" class="form-control" id="exampleFormControlInput1" value="<%=user.getTaiKhoan()%>" required>
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleFormControlInput1">Địa Chỉ</label>
                                        <input type="text" name="address" class="form-control" id="exampleFormControlInput1" value="<%=user.getDiaChi() %>" required>
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleFormControlInput1">Số Điện Thoại</label>
                                        <input type="text" name="phone" class="form-control" id="exampleFormControlInput1" value="<%=user.getSdt() %>" required>
                                    </div>
                                    <button type="submit" class="btn btn-primary">Lưu</button>
                                </form>
                            </div>
                            <!-- End -->
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Site footer -->
    <footer class="site-footer">
        <div class="container ">
            <div class="row">
                <div class="col-md-12 col-sm-12 col-xs-12 text-center">
                    <h6>CÔNG TY CP TM & DV TACO VIỆT NAM</h6>
                    Địa Chỉ:<span>Tầng 2 tòa nhà T10, Times City Vĩnh Tuy, Hai Bà Trưng, Hà Nội.</span>
                    <br>
                    Liên Hệ:<span>1900.63.69.36</span>
                    <br>
                    <span>Số ĐKKD: 0106341306. Ngày cấp: 16/03/2017.</span>
                    <br>
                    <span>Nơi cấp: Sở kế hoạch và Đầu tư Thành phố Hà Nội.</span>
                    <br>
                </div>



            </div>
            <hr>
            <div class="container">
                <div class="row">
                    <div class="col-md-12 col-sm-12 col-xs-12 text-center">
                        <p class="copyright-text">ToCoToCo - Thương hiệu trà sữa tiên phong sử dụng nguồn nông sản Việt Nam


                        </p>
                    </div>

                </div>
            </div>
    </footer>


    <!-- <%-- ----------------------------------------------------------------------------------------------------------- --%> -->

    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.1/umd/popper.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
