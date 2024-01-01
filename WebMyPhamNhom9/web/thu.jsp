<%-- 
    Document   : thu
    Created on : Nov 19, 2023, 11:28:39 PM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <title>Home Page</title>
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Roboto+Slab:wght@100;200;300;400;500;600;700;800;900&display=swap" rel="stylesheet">
        <!-- Icon fontanwesome -->
        <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous" />
        <link rel="stylesheet" href="./css/Common.css">
        <!-- index -->
        <link href="./css/home.css" rel="stylesheet" />
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
        <style>
            body {
                font-family: 'Roboto Slab', serif !important;
            }
            .header .header__account-login, .header .header__account-register, .header__account-manager, .header__account-product {
                font-size: 1.5rem !important;
                /*font-weight: 500 !importtant;*/

            }
            .totalq {
                font-size: 15px !important;
            }
            </style>
        </head>
        <body>
            <jsp:include page="nav.jsp"></jsp:include>


            <div class="main__slice">
                <div class="slider">
                    <div class="slide active" style="background-image:url(./images/slide-6.jpg)">
                            <div class="container">
                                <div class="caption">
                                    <h1>Cửa hàng mỹ phẩm cao cấp</h1>
                                    <p>Nhóm 4</p>
                                    <!--<a href="listProduct.html" class="btn btn--default">Xem ngay</a>-->

                                </div>
                            </div>
                        </div>
                        <div class="slide active" style="background-image:url(./images/slide-4.jpg)">
                            <div class="container">
                                <div class="caption">
                                    <h1>Mang sắc đẹp đến cho bạn</h1>
                                    <p>Vạn người mê</p>
                                    <!--<a href="listProduct.html" class="btn btn--default">Xem ngay</a>-->

                                </div>
                            </div>
                        </div>
                        <div class="slide active" style="background-image:url(./images/slide-5.jpg)">
                            <div class="container">
                                <div class="caption">
                                    <h1>Một lần mua vạn lần nhớ</h1>
                                    <p>Giảm giá cực sốc trong tháng 12 tới!</p>
                                    <!--<a href="listProduct.html" class="btn btn--default">Xem ngay</a>-->

                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="controls">
                        <div class="prev">
                            <i class="fas fa-chevron-left"></i>
                        </div>
                        <div class="next">
                            <i class="fas fa-chevron-right"></i>
                        </div>
                    </div>
                    <!-- indicators -->
                    <div class="indicator">
                    </div>
                </div>

                <!-- Your content goes here -->

                <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
                <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
                <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

                <script src="./js/home.js"></script>

            </body>
        </html>

