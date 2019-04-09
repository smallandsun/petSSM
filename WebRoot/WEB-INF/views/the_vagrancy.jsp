<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<title>流浪宠详情</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="format-detection" content="telephone=no">
<link rel="stylesheet" href="css/add_pet_encyclopedias.css" />

<script language="JavaScript">
	javascript: window.history.forward(1);
</script>
</head>
<body>
        <br />
		<h2>流浪宠详情</h2>
		<br /><br />
		<form action="update_the_vagrancy" method="post">
			<div class="category_type">
				<sapn>流浪宠类型</sapn>
				<input type="text" name="vagrancy_type" value="${sessionScope.theVagrancy.vagrancy_type }" />
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<sapn>是否被领养</sapn>
				<input type="text" name="vagrancy_acquiring" value="${sessionScope.theVagrancy.vagrancy_acquiring }" />
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<sapn>领养人</sapn>
				<input type="text" name="user_name" value="${sessionScope.theVagrancy.user_name }" disabled="true"/>
			</div>
			<br />
			<div class="context">
				<sapn>流浪宠描述</sapn>
				<div class="textarea">
				    &nbsp;&nbsp;<textarea name="vagrancy_desc">${sessionScope.theVagrancy.vagrancy_desc }</textarea>
				</div>
			</div>
			<input type="hidden" name="id" value="${sessionScope.theVagrancy.id}"/>
			<div class="deleteAndUpdate">
				<a href="delect_the_vagrancy?id=${sessionScope.theVagrancy.id}">
				    删 除
				</a>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<button class="button">修 改</button>
			</div>
		</form>
</body>
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
</html>
