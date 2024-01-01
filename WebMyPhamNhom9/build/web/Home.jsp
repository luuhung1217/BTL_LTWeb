<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <link href="./css/style.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" integrity="sha512-...your-sha-here..." crossorigin="anonymous">
        <style>
            body {
                font-family: 'Roboto Slab', serif !important;
            }

            a:hover,header__nav-item:hover{
                text-decoration: none !important;
                color:#9e5bab !important;
            }
            a{
                color: #343a40 !important;
            }
            .header__nav-link{
                color: #fff !important;
            }
            .btn-danger{
                color: #343a40 !important;
                background: none !important;
                border-color: transparent !important;
            }
            .col-lg-4 {

                margin-bottom: 20px;
            }
            .btn-button{
                background-color: #7b539c9e;
                color: #fff;
                border-radius: 5px;
                border-color: transparent;
            }
            .btn-button:hover{
                color:#9e5bab;
            }
            .col-lg-4 {
                flex: 0 0 25% !important;
                max-width: 25% !important;
            }
            .col-sm-9 {

                max-width: 100% !important;
            }
            .card-body {
                background-color: #e4d4d433 !important;
                padding: 1.25rem 1.25rem 0rem 1.25rem !important;
            }
            .card-img-top {
                width: 85% !important;
                margin-left: 20px !important;
            }
            h4{
                font-size: 1.3rem !important;
            }
            .sl{
                margin-left: 160px;
                position: absolute;
            }
        </style>
    </head>

    <body>
        <!--begin of menu-->
        <jsp:include page="nav.jsp"></jsp:include>

            <!--end of menu-->
            <div class="container">
                <div class="row">
                    <div class="col">
                        <nav aria-label="breadcrumb">
                            <ol class="breadcrumb">
                                <li class="breadcrumb-item"><a href="home"><Strong>Tất cả sản phẩm</Strong></a></li>
                                <!--<li class="breadcrumb-item"><a href="#">Category</a></li>-->
                                <!--<li class="breadcrumb-item active" aria-current="#">Sub-category</li>-->
                            </ol>
                        </nav>
                    </div>
                </div>
            </div>
            <div class="container">
                <!--<div class="row">-->
            <%--<jsp:include page="Left.jsp"></jsp:include>--%>
            <div class="col-sm-9">
                <div class="row">
                    <c:forEach items="${listP}" var="o">
                        <div class="product col-12 col-md-6 col-lg-4">
                            <div class="card">
                                <p class="sl">Còn lại: ${o.mount}</p>
                                <img class="card-img-top" src="${o.image}" alt="Card image cap" >
                                <div class="card-body">
                                    <h4 class="card-title show_txt"><a href="detail?pid=${o.id}" title="View Product">${o.name}</a></h4>
                                    <p class="card-text show_txt">${o.title}</p>
                                    <div class="row">
                                        <div class="col">
                                            <p class="btn btn-danger btn-block">${o.price}$</p>
                                            
                                        </div>
                                        <div class="col">

                                            <c:if test="${sessionScope.acc != null}">
                                                <form action="addtocart" method="get">
                                                    <input type="hidden" name="productId" value="${o.id}">
                                                    <button type="submit" class="btn-button">Add Cart</button>
                                                </form>
                                            </c:if>
                                            <c:if test="${sessionScope.acc == null}">
                                                <script>
                                                    function redirectToLogin() {
                                                        window.location.href = "Login.jsp";
                                                    }
                                                </script>
                                                <button type="button" class="btn-button" onclick="redirectToLogin()">Add Cart</button>
                                            </c:if>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>

            </div>

        </div>
        <!--</div>-->

        <!-- Footer -->
        <jsp:include page="Footer.jsp"></jsp:include>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

    </body>
</html>

