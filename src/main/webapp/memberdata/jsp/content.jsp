<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ page import="com.util.Util"%>
    <%@ page import="java.util.Map" %>
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="com.util.FieldData" %>
    <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
    <%@ taglib uri="http://java.sun.com/jstl/sql" prefix="sql"%>
        <%
    ArrayList data1=(ArrayList) request.getAttribute("aa");
    ArrayList<FieldData> map=Util.getModelAttriButeType(data1.get(0).getClass());
%>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Bootstrap Admin</title>
    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="stylesheet" type="text/css" href="lib/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="lib/font-awesome/css/font-awesome.css">
    <script src="lib/jquery-1.11.1.min.js" type="text/javascript"></script>
    <link rel="stylesheet" type="text/css" href="stylesheets/theme.css">
    <link rel="stylesheet" type="text/css" href="stylesheets/premium.css">
</head>
<body style="background-color:transparent" class=" theme-blue">

<!-- Demo page code -->

<script type="text/javascript">
    $(function() {
        var match = document.cookie.match(new RegExp('color=([^;]+)'));
        if(match) var color = match[1];
        if(color) {
            $('body').removeClass(function (index, css) {
                return (css.match (/\btheme-\S+/g) || []).join(' ')
            })
            $('body').addClass('theme-' + color);
        }


    });
</script>
<style type="text/css">
    #line-chart {
        height:300px;
        width:800px;
        margin: 0px auto;
        margin-top: 1em;
    }
    .navbar-default .navbar-brand, .navbar-default .navbar-brand:hover {
        color: #fff;
    }
</style>

<script type="text/javascript">
    $(function() {
        var uls = $('.sidebar-nav > ul > *').clone();
        uls.addClass('visible-xs');
        $('#main-menu').append(uls.clone());
    });
</script>
    <div class="header">

        <ul class="breadcrumb">
            <li><a href="/memberdata/memberAdd">Home</a> </li>
            <li class="active">Users</li>
        </ul>

    </div>

        <div class="btn-toolbar list-toolbar">
            <a href="/memberdata/memberAdd"><button type="button" class="btn btn-danger" >新增</button></a>
            <button type="button" class="btn btn-success">删除</button>
            <!--<button type="button" class="btn btn-info"></button>-->
        </div>
        <table id="content" class="table table-bordered table-hover ">
            <thead>
            <tr >
                <c:forEach items="<%=map%>" var="data">
                    <th>${data.value}</th>
                </c:forEach>
            </tr>
            </thead>
            <tbody>

            <%for(int i=0;i<data1.size();i++){
                Map<String,Object> FieldDatas=  Util.getModelValue(data1.get(i));
            %>
            <tr>
                    <%for(int j=0;j<map.size();j++){%>
                    <th><%=FieldDatas.get(map.get(j).getName())%></th>
                    <%}%>
            </tr>
                <%}%>

            </tbody>
        </table>
        <nav style="text-align: right">
            <ul class="pagination">
                <li ><a href="#">&laquo;</a></li>
                <li class="active"><a href="#">1</a></li>
                <li><a href="#">2</a></li>
                <li><a href="#">3</a></li>
                <li><a href="#">4</a></li>
                <li><a href="#">5</a></li>
                <li><a href="#">&raquo;</a></li>
            </ul>
        </nav>
</body>
</html>