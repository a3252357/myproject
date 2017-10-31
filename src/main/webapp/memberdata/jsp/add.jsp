<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
	<div class="panel-body pan">
		<form action="#">
		<div class="form-body pal">
			<div class="row">
				<div class="col-md-12">
					<div class="form-group">
						<input id="name" type="text" placeholder="First Name" class="form-control">
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<input id="brithday" type="text" placeholder="Last Name" class="form-control"></div>
				</div>
				<div class="form-group">
					<div class="col-md-12">
					<label for="name">性别</label>
					<select class="form-control">
						<option value="0">男</option>
						<option value="1">女</option>
					</select>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<input id="email" type="text" placeholder="First Name" class="form-control">
					</div>
				</div>
				<div class="form-group">
					<label for="inputPassword" class="col-sm-2 control-label">密码</label>
					<div class="col-sm-12">
						<input type="password" class="form-control" id="inputPassword" placeholder="请输入密码">
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<input id="phonenumber" type="text" placeholder="First Name" class="form-control">
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<input id="qqno" type="text" placeholder="First Name" class="form-control">
					</div>
				</div>
			</div>
		</div>
		<div class="form-actions text-right pal">
			<button type="submit" class="btn btn-primary">
				Submit</button>
		</div>
		</form>
	</div>
</body>
</html>
