<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="C"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>INSPINIA | Register</title>

<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/font-awesome.css" rel="stylesheet">
<link href="css/custom.css" rel="stylesheet">
<link href="css/animate.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">

</head>

<body class="gray-bg">

	<div class="middle-box text-center loginscreen   animated fadeInDown">
		<div>
			<div>

				<h1 class="logo-name">IN+</h1>

			</div>
			<h3>Register to IN+</h3>
			<p>Create account to see it in action.</p>
			<C:out value="${message }" default="Welcome"></C:out>
			<form class="m-t" role="form" action="servlet/RegisterServlet" method="post">
				<div class="form-group">
					<input type="text" class="form-control" placeholder="Name"
						name="userName">
				</div>
				<div class="form-group">
					<input type="text" class="form-control" placeholder="StudentNumber"
						name="id">
				</div>
				<div class="form-group">
					<input type="password" class="form-control" placeholder="Password"
						name="password">
				</div>
				<button type="submit" class="btn btn-primary block full-width m-b">Register</button>

				<p class="text-muted text-center">
					<small>Already have an account?</small>
				</p>
				<a class="btn btn-sm btn-white btn-block" href="login.html">Login</a>
			</form>
			<p class="m-t">
				<small>Inspinia we app framework base on Bootstrap 3 &copy;
					2014</small>
			</p>
		</div>
	</div>

	<!-- Mainly scripts -->
	<script src="js/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<!-- iCheck -->
	<script src="js/icheck.min.js"></script>
	<script>
		$(document).ready(function() {
			$('.i-checks').iCheck({
				checkboxClass : 'icheckbox_square-green',
				radioClass : 'iradio_square-green',
			});
		});
	</script>
</body>
</html>
