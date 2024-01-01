<%-- 
    Document   : DatHang
    Created on : Dec 31, 2023, 2:00:21 PM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
        <link href="css/login.css" rel="stylesheet" type="text/css"/>
        <title>Order</title>
    </head>
    <body>
        <jsp:include page="nav.jsp"></jsp:include>
        <div id="logreg-forms">
            <form class="form-signin" action="ordertocart" method="post">
                <h1 class="h3 mb-3 font-weight-normal" style="text-align: center">Order</h1>
                <%--<c:if test="${error!=null }">--%>
                <!--                 <div class="alert alert-danger" role="alert">
                ${error}
</div>-->
                <%--</c:if>--%>
                <%--<c:if test="${mess!=null }">--%>
                <!--                <div class="alert alert-success" role="alert">
                ${mess}
        </div>-->
                <%--</c:if>--%>
                <label for="name">Tên</label>
                <input value="${a1.user}" name="name" type="text" id="name" class="form-control" required>

                <label for="phoneNumber">Số điện thoại</label>
                <input value="${a1.phone}" name="phoneNumber" type="text" id="phoneNumber" class="form-control"  required>

                <label for="email">Email</label>
                <input value="${a1.gmail}" name="email" type="text" id="email" class="form-control" required>

                <label for="deliveryAddress">Địa chỉ vận chuyển</label>
                <input value="${a1.address}" name="deliveryAddress" type="text" id="deliveryAddress" class="form-control"  required>

                <button class="btn btn-success btn-block" type="submit"><i class="fas fa-american-sign-language-interpreting"></i>Dat Hang</button>

            </form>


            <br>

        </div>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script>
            $(document).ready(function () {
                // Activate tooltip
                $('[data-toggle="tooltip"]').tooltip();

                // Select/Deselect checkboxes
                var checkbox = $('table tbody input[type="checkbox"]');
                $("#selectAll").click(function () {
                    if (this.checked) {
                        checkbox.each(function () {
                            this.checked = true;
                        });
                    } else {
                        checkbox.each(function () {
                            this.checked = false;
                        });
                    }
                });
                checkbox.click(function () {
                    if (!this.checked) {
                        $("#selectAll").prop("checked", false);
                    }
                });
            });

        </script>
    </body>
</html>