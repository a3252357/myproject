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
<div class="content">
    <div class="header">

        <ul class="breadcrumb">
            <li><a href="index.html">Home</a> </li>
            <li class="active">Users</li>
        </ul>

    </div>
    <div class="main-content">

        <div class="btn-toolbar list-toolbar">
            <button type="button" class="btn btn-danger">新增</button>
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
    </div>
</div>