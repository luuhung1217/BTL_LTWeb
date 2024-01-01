<%-- 
    Document   : Contact
    Created on : Dec 7, 2023, 10:07:36 PM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact</title>
        <link href="./css/Contact.css" rel="stylesheet" type="text/css"/>
        <link href="./css/library.css" rel="stylesheet" type="text/css"/>
        <link href="./css/Common.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" integrity="sha512-...your-sha-here..." crossorigin="anonymous">

        <style>
            .main{
                margin-top: 60px !important;
            }
            a:hover {
                color: #9e5bab !important;
                text-decoration: none !important;
            }
            .header .header__account-login, .header .header__account-register {

                font-size: 1.9rem !important;
                font-weight: 500 !important;
            }
            .header__account-manager, .header__account-product {
                font-size: 1.7rem !important;
                /*font-weight: 500 !importtant;*/

            }
            h5 {
                font-size: 2.6rem !important;
            }
            li{
                font-size: 1.7rem !important;
            }
            .mb-0{
                font-size: 16px !important;
            }
        </style>
    </head>
    <body>
        <jsp:include page="nav.jsp"></jsp:include>
            <div class="main">
                <div class="grid2 wide2">
                    <div class="main__breadcrumb">

                        <div class="breadcrumb__item">
                            <a href="#" class="breadcrumb__link">Giới thiệu</a>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col l-6 m-12 s-12">
                            <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3725.292513285943!2d105.78486297479499!3d20.980908489421278!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3135accdd8a1ad71%3A0xa2f9b16036648187!2zSOG7jWMgdmnhu4duIEPDtG5nIG5naOG7hyBCxrB1IGNow61uaCB2aeG7hW4gdGjDtG5n!5e0!3m2!1svi!2s!4v1702042064966!5m2!1svi!2s" width="100%"
                                    height="450" style="border:0;" allowfullscreen="" loading="lazy"></iframe>
                        </div>
                        <div class="col l-6 m-12 s-12">
                            <div class="contact__wrap">
<!--                                <div class="contact__img">
                                    <img src="http://mauweb.monamedia.net/vanihome/wp-content/uploads/2018/04/logo-mona.png" alt="">
                                </div>-->
                                <ul class="contact__info">
                                    <li class="contact__text">
                                        Cửa hàng chúng tôi tự hào nằm trong top các cửa hàng mỹ phẩm Việt Nam
                                    </li>
                                    <li class="contact__text">
                                        <i class="fas fa-map-marked-alt"></i> Beauty Mona™ - Mua hàng hiệu chính hãng trực tuyến,địa chỉ mua sắm trực tuyến uy tín, tin cậy, an toàn và miễn phí! Beauty Mona™ là sự lựa chọn hàng đầu khi mua sắm đồ hiệu chính hãng, sang trọng và đắt tiền tại Việt Nam. Với sự đảm bảo của chúng tôi, bạn sẽ mua hàng trực tuyến an tâm và nhanh chóng hơn bao giờ hết! 
                                    </li>
                                    <li>
                                        <a href="tel:076 922 0162" class="contact__link">
                                            <i class="fas fa-phone"></i> 099999999999
                                        </a>
                                        <a href="tel:076 922 0162" class="contact__link">
                                            &#8212; 0899999999
                                        </a>
                                    </li>

                                    <li>
                                        <a href="#" class="contact__link">
                                            <i class="fas fa-envelope"></i> hungluu1217@gmail.com
                                        </a>
                                    </li>
                                </ul>
                            </div>
                          
                        </div>
                    </div>
                </div>
            </div>
        <jsp:include page="Footer.jsp"></jsp:include>
    </body>
</html>
