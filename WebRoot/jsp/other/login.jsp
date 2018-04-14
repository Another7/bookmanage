<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="C"%>
<%
	String path = request.getContextPath();
	//System.out.println("path :"+path);
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>Login Page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">



<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="css/font-awesome.css" rel="stylesheet" type="text/css">

<link href="css/animate.css" rel="stylesheet" type="text/css">
<link href="css/style.css" rel="stylesheet" type="text/css">
</head>


<body class="gray-bg">

	<div class="middle-box text-center loginscreen animated fadeInDown">
		<div>
			<div>

				<h1 class="logo-name">
					IN+
					</h>
			</div>
			<h3>Welcome to BookManage System</h3>
			<p>
				Perfectly designed and precisely prepared admin theme with over 50
				pages with extra new web app views.
				<!--Continually expanded and constantly improved Inspinia Admin Them (IN+)-->
			</p>
			<p>
				<C:out value="${message }" default="Login"></C:out> 
			</p>
			<form class="m-t" role="form" action="servlet/LoginServlet"
				method="post">
				<div class="form-group">
					<input type="text" class="form-control" placeholder="Id"
						name="id">
				</div>
				<div class="form-group">
					<input type="password" class="form-control" placeholder="Password"
						required="" name="password">
				</div>
				<button type="submit" class="btn btn-primary block full-width m-b">Login</button>

				<a href="#"><small>Forgot password?</small></a>
				<p class="text-muted text-center">
					<small>Do not have an account?</small>
				</p>
				<a class="btn btn-sm btn-white btn-block"
					href="jsp/other/register.jsp">Create an account</a>
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

</body>
</html>
