<%-- 
    Document   : nav
    Author     : ACER
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <link href="./css/style.css" rel="stylesheet" type="text/css"/>
        <style>
            body {
                font-family: 'Roboto Slab', serif !important;
            }
            :root {
                --default-cl: #9e5bab;
                --black-cl-1: #444444;
                --black-cl-2: #222222;
                --white-cl-1: #fff;
                --white-cl-2: rgba(255, 255, 255, 0.7);
                --white-cl-3: #f8f7fd;
                --orange-cl: #d26e4b;
                --hight-header-top: 80px;
                --hight-header-nav: 50px;
                --hight-header: calc(var(--hight-header-nav) + var(--hight-header-top));
            }

            a:hover {
                color: #0056b3;
                text-decoration: none;
            }
            li {
                text-align: -webkit-match-parent;
            }
            .header {
                height: var(--hight-header);
                position: fixed;
                top: 0;
                right: 0;
                left: 0;
                z-index: 9;
                background-color: var(--white-cl-1);
            }
            .header__top {
                display: flex;
                justify-content: space-between;
                align-items: center;
                height: var(--hight-header-top);
            }

            * {
                box-sizing: border-box;
            }
            div{
                margin: 0;
                padding: 0;
                border: 0;
                font: inherit;
                vertical-align: baseline;
            }
            .navbar-icon {
                width: 28px;
                height: 28px;
                margin: auto 0;
                transform: rotate(0deg);
                transition: .5s ease-in-out;
                display: none;
            }
            /*search*/

            .header__search {
                flex-grow: 1;
                text-align: center;
            }
            .header__search-wrap {
                border-radius: 18px;
                border: 1px solid var(--default-cl);
                width: 60%;
                display: flex;
                height: 36px;
                margin: 0 10%;
                align-items: center;
            }
            .header__search-input {
                border: none;
                outline: none;
                background: none;
                padding: 0 16px;
                font-size: 1.1rem;
                flex-grow: 1;
                color: var(--black-cl-2);
            }
            .header__search-input:focus::placeholder {
                color: transparent; /* Ẩn nội dung placeholder */
            }
            input:-internal-autofill-selected {
                background-color: transparent !important;
                background: none;
            }
            .header__search-icon {
                border: none;
                outline: none;
                background: none;
                cursor: pointer;
                box-shadow: none;
            }
            .header__search-icon:active {
                outline: none; /* Loại bỏ đường viền khi nhấn nút */
            }
            a:hover {
                text-decoration: none;

            }
            a{

                text-decoration: none;
            }
            .header__search-icon i {
                font-size: 1.2rem;
                color: var(--black-cl-1);
                font-weight: 400;
                padding-right: 16px;
            }
            .header__cart:hover i, .header__search:hover i {
                color: var(--default-cl);
                cursor: pointer;
            }
            .header__cart i{
                color: var(--black-cl-1);
            }
            .fas {
                font-family: "Font Awesome 5 Pro";
                -webkit-font-smoothing: antialiased;
                display: inline-block;
                font-style: normal;
                font-variant: normal;
                text-rendering: auto;
                line-height: 1;
                font-size: 24px;
            }
            li{
                margin: 0;
                padding: 0;
                border: 0;
                font-size: 100%;
            }
            /*đăng nhập đăng kí*/
            .header__account {
                width: 300px;
                display: flex;
                justify-content: flex-start;
                align-items: center;
                position: relative;
                text-align: center;
            }
            .header .header__account-login, .header .header__account-register {
                margin-right: 16px;
                cursor: pointer;
                position: relative;
                font-size: 1.1rem;
                color: var(--black-cl-1);
                font-weight: 500;
            }
            .header .header__account-login:after {
                position: absolute;
                /*content: "";*/
                border-right: 1px solid var(--black-cl-1);
                height: 16px;
                right: -8px;
                top: 50%;
                transform: translateY(-50%);
            }
            /*            .header {
                            margin-right: 16px;
                            cursor: pointer;
                            position: relative;
                            font-size: 1.0rem;
                            color: var(--black-cl-1);
                        }*/
            .header__account-register {
                margin-right: 16px;
                cursor: pointer;
                position: relative;
                font-size: 1.1rem;
                color: var(--black-cl-1);
            }
            .header__account-manager {
                margin-left: -155px;
                cursor: pointer;
                position: relative;
                font-size: 1.1rem;
                color: var(--black-cl-1);
                font-weight: 500;
            }

            .header__account-product {
                color: var(--black-cl-1);
                height:13px;
                margin: 0 12px;
                transform: translateY(-50%);
                font-size: 1.1rem;
                font-weight: 500;
            }
            .header__account-login:hover, .header__account-register:hover ,.header__account-product:hover,.header__account-manager:hover,.header__nav-link:hover{
                color: var(--default-cl);
                transition: all 0.3s;

            }

            /*/*/
            .grid.wide {
                max-width: 1340px;
                margin: 0 auto;
            }

            .grid {
                width: 100%;
                display: block;
                padding: 0;
            }
            /*thu nhỏ thanh trượt*/
            ::-webkit-scrollbar {
                width: 3px;
            }
            /*trang chủ,tin tuc*/
            .header__nav {
                display: flex;
                justify-content: center;
                position: relative;
            }
            .header__nav {
                height: var(--hight-header-nav);
                background-color: var(--black-cl-1);
                box-shadow: 0 0 5px rgba(0, 0, 0, 0.3);
            }
            .header__nav-list {
                display: flex;
                align-items: center;
            }
            ul {
                list-style: none;
            }
            .header__nav .nav__search {
                display: none;
            }
            .header__nav-item {
                border-right: 1px solid rgba(255, 255, 255, 0.2);
                margin-top: 20px;
            }
            .header__nav-link {
                display: block;
                /*font-size: 1.6rem;*/
                text-transform: uppercase;
                color: var(--white-cl-1);
                padding: 0 44px;
                line-height: 5rem;
                text-shadow: 0 0 2px rgba(0, 0, 0, 0.3);
                font-weight: 500;
            }
            .header__cart have {
                padding: 10px;
            }
            .header__cart {
                display: flex;
                align-items: center;
                position: relative;
            }

            .header__cart i {
                margin-right: 5px;
            }
            .totalq{
                color:#222222;
                font-weight: 600;
            }
            .header__cart::after {
                content: '${totalQuantity}';
                position: absolute;
                top: 2px;
                right: -6px;
                /*background-color: #ff000061;*/

                color: black;
                border-radius: 50%;
                width: 20px;
                height: 20px;
                display: flex;
                align-items: center;
                justify-content: center;
                font-size: 12px;
            }
            /*drop down*/
            .dropdown1 {
                display: none;
                position: absolute;
                top: 102%;
                background-color: #fff;
                border-radius: 5px;
                /*box-shadow: rgba(50, 50, 93, 0.25) 0px 30px 60px -12px inset, rgba(0, 0, 0, 0.3) 0px 18px 36px -18px inset;*/
                box-shadow: rgba(0, 0, 0, 0.35) 0px 5px 15px;

            }

            .header__nav-item:hover .dropdown1 {
                display: block;
            }
            .dropdown1 a {
                display: block;
                padding: 10px 31px 10px 0px;
                color: white;
                text-decoration: none;

            }

            .dropdown1 a:hover {
                background-color: #7773;
            }
/*          .list-item {
                margin-left: 0px !important;
            }*/
        </style>
        <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous" />

        <!--<link href="./css/style.css" rel="stylesheet" type="text/css"/>-->
    </head>
    <body>
        <!--begin of menu-->

        <div class="header" id="myHeader">
            <div class="grid wide">
                <div class="header__top">
                    <div class="navbar-icon">
                        <span></span>
                        <span></span>
                        <span></span>
                    </div>
                    <a href="home" class="header__logo">
                        <img src="./images/logo.png" alt="">
                    </a>
                    <!--<div class="header__search">-->
                    <form action="search" method="post" class="header__search">
                        <div class="header__search-wrap">
                            <input value="${txtS}" name="txt" type="text" class="header__search-input" placeholder="Tìm kiếm">

                            <button type="submit" class="header__search-icon">
                                <i class="fas fa-search"></i>
                            </button>  
                        </div>
                    </form>
                    <!--</div>-->
                    <div class="header__account">
                        <!--                        <a href="#my-Login" class="header__account-login">Đăng Nhập</a>
                                                <a href="#my-Register" class="header__account-register">Đăng Kí</a>-->
                        <c:if test="${sessionScope.acc.isAdmin==1}">

                            <a class="header__account-manager" href="manageraccount">Manager Account</a>
                            <a class="header__account-product" href="manager">Manager Product</a>

                        </c:if>
                        <c:if test="${sessionScope.acc.isSell==1}">

                            <a class="nav-link" href="manager">Manager Product</a>

                        </c:if>
                        <c:if test="${sessionScope.acc!=null}">
                            <a class="header__account-login" href="#">Hello ${sessionScope.acc.user}</a>
                            <a class="header__account-register" href="logout">Logout</a>

                        </c:if>
                        <c:if test="${sessionScope.acc==null}">

                            <a class="header__account-login" href="Login.jsp">Login</a>

                        </c:if>
                    </div>
                    <!-- Cart -->
                    <a class="header__cart have" href="Cart.jsp">
                        <i class="fas fa-shopping-basket"></i><p class="totalq">${totalquality}</p>

                    </a>

                </div>
            </div>
            <!-- Menu -->
            <div class="header__nav">
                <ul class="header__nav-list">

                    <li class="header__nav-item index">
                        <a href="thu.jsp" class="header__nav-link">Trang chủ</a>
                    </li>
                    <li class="header__nav-item">
                        <a href="Introduct.jsp" class="header__nav-link">Giới Thiệu</a>
                    </li>
                    <li class="header__nav-item">
                        <a href="home" class="header__nav-link">Sản Phẩm</a>
                        <ul class="dropdown1" id="dropdownMenu">
                            <c:forEach items="${listC}" var="o">
                                <li class="list-item ${tag==o.cid?'active':''}">
                                    <a href="category?cid=${o.cid}">${o.cname}</a>
                                </li>
                            </c:forEach>
                        </ul>
                    </li>
                    <li class="header__nav-item">
                        <a href="News.jsp" class="header__nav-link">Tin Tức</a>
                    </li>
                    <li class="header__nav-item">
                        <a href="Contact.jsp" class="header__nav-link">Liên Hệ</a>
                    </li>
                </ul>
            </div>
        </div>

        <section class="jumbotron text-center">

        </section>

        <script>
            document.getElementById("productLink").addEventListener("click", function (event) {
                event.preventDefault();
                window.location.href = this.getAttribute("href");
            });
        </script>
    </body>
</html>

