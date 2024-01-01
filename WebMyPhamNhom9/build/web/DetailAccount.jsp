<%-- 
    Document   : DetailAccount
    Created on : Dec 21, 2023, 8:46:24 AM
    Author     : ACER
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detail Account</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="./css/manager.css" rel="stylesheet" type="text/css"/>
        <style>
            img{
                width: 200px;
                height: 120px;
            }
            .btnhome{
                color: white;
                font-size: 20px;
            }
            .btnhome:hover{
                color: #9e5bab;
            }
            table.table tr th:last-child {
                width: 151px !important;
            }
            table.table tr th:first-child {
                width: 74px !important;
            }
            .container {
                width: 1320px !important;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <div class="table-wrapper">
                <div class="table-title">

                    <div class="row">

                        <div class="col-sm-6">

                            <h2>Detail <b>Account</b></h2>
                        </div>
                        <div class="col-sm-6">
                            <a class="btnhome" href="manageraccount"> <i class="fa fa-home mr-2" > Home</i></a>
                            <!--<a href="#addEmployeeModal"  class="btn btn-success" data-toggle="modal"><i class="material-icons">&#xE147;</i> <span>Add Account</span></a>-->
                            <!--<a href="#deleteEmployeeModal" class="btn btn-danger" data-toggle="modal"><i class="material-icons">&#xE15C;</i> <span>Delete</span></a>-->						
                        </div>
                    </div>
                </div>
                <table class="table table-striped table-hover">
                    <thead>
                        <tr>
                            <th>Tên</th>
                            <th>Sản Phẩm</th>
                            <th>Số lượng</th>
                            <th>Ngày mua</th>
                            <th>Địa chỉ</th>
                            <th>Phone</th>
                            <th>Tổng tiền(gồm VAT)</th>
                            

                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${listorderline}" var="o">
                            <tr>
                                <td>${o.nameuser}</td>
                                <td>
                                    <c:forEach items="${o.pname}" var="pname">
                                        ${pname}<br>
                                    </c:forEach>
                                </td>
                                <td>
                                    <c:forEach items="${o.quantity}" var="quantity">
                                        ${quantity}<br>
                                    </c:forEach>
                                </td>
                                <td>${o.date}</td>
                                <td>${o.address}</td>
                                <td>${o.phone}</td>
                                <td> ${o.sum}</td>
                               
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
        <script src="js/manager.js" type="text/javascript"></script>
    </body>
</html>
