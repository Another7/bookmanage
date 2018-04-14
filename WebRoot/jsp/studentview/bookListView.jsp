<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="C"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
.

<html>
<head>
<base href="<%=basePath%>">

<title>BookListView</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<table cellpadding="10px">
		<tr>
			<th>编号</th>
			<th>书名</th>
			<th>借阅日期</th>
			<th>操作</th>
		</tr>
		<%int i = 1; %>
		<C:forEach items="${bookInfoList}" var="bookInfo">
			<tr>
			    <td><%=i++ %></td>
				<td>${bookInfo.bookName}</td>
				<td>${bookInfo.borrowDate}</td>
				<td><a href="">归还</a></td>
			</tr>
		</C:forEach>
	</table>
</body>
</html>
