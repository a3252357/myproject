<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="content">
    <div class="header">

        <ul class="breadcrumb">
            <li><a href="index.html">Home</a> </li>
            <li class="active">Users</li>
        </ul>

    </div>
    <div class="main-content">

        <div class="btn-toolbar list-toolbar">
            <button type="button" class="btn btn-danger">查询报表</button>
            <button type="button" class="btn btn-success">查询今日</button>
            <button type="button" class="btn btn-info">查询历史</button>
        </div>
        <table id="content" class="table table-bordered table-hover ">
            <thead>
            <tr >
                <th>#</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Username</th>
                <th>action</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>1</td>
                <td>Mark</td>
                <td>Tompson</td>
                <td>the_mark7</td>
                <td>
                    <button type="button" class="btn btn-danger">新增</button>
                    <button type="button" class="btn btn-success">修改</button>
                    <button type="button" class="btn btn-info">删除</button>
                </td>
            </tr>
            <tr>
                <td>2</td>
                <td>Ashley</td>
                <td>Jacobs</td>
                <td>ash11927</td>
                <td>
                    <button type="button" class="btn btn-danger">查询</button>
                    <button type="button" class="btn btn-success">修改</button>
                    <button type="button" class="btn btn-info">删除</button>
                </td>
            </tr>
            <tr>
                <td>3</td>
                <td>Audrey</td>
                <td>Ann</td>
                <td>audann84</td>
                <td>
                    <button type="button" class="btn btn-danger">查询</button>
                    <button type="button" class="btn btn-success">修改</button>
                    <button type="button" class="btn btn-info">删除</button>
                </td>
            </tr>
            <tr>
                <td>4</td>
                <td>John</td>
                <td>Robinson</td>
                <td>jr5527</td>
                <td>
                    <button type="button" class="btn btn-danger">查询</button>
                    <button type="button" class="btn btn-success">修改</button>
                    <button type="button" class="btn btn-info">删除</button>
                </td>
            </tr>
            <tr>
                <td>5</td>
                <td>Aaron</td>
                <td>Butler</td>
                <td>aaron_butler</td>
                <td>
                    <button type="button" class="btn btn-danger">查询</button>
                    <button type="button" class="btn btn-success">修改</button>
                    <button type="button" class="btn btn-info">删除</button>
                </td>
            </tr>
            <tr>
                <td>6</td>
                <td>Chris</td>
                <td>Albert</td>
                <td>cab79</td>
                <td>
                    <button type="button" class="btn btn-danger">查询</button>
                    <button type="button" class="btn btn-success">修改</button>
                    <button type="button" class="btn btn-info">删除</button>
                </td>
            </tr>
            <tr>
                <td>6</td>
                <td>Chris</td>
                <td>Albert</td>
                <td>cab79</td>
                <td>
                    <button type="button" class="btn btn-danger">新增</button>
                    <button type="button" class="btn btn-success">修改</button>
                    <button type="button" class="btn btn-info">删除</button>
                </td>
            </tr>
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