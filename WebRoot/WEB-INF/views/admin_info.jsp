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
<title>管理员信息</title>
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
<link rel="stylesheet" href="css/adminUserInfo.css" />

<script language="JavaScript"> 
    javascript:window.history.forward(1); 
</script>
</head>		
<body>
        <h2>管 理 员 信 息</h2>
        <form action="update_admin_head_img" enctype="multipart/form-data" method="post">
		    <div class="headimg">
			   <img src="${sessionScope.ad_user.head_img_path }" alt=""/>
		    </div>
		    <br />
		    <div class="updateHeadimg">
				<span>修改头像</span>
				<input type="file" name="file">
				<input type="hidden" name="id" value="${sessionScope.ad_user.id }" />
				<input type="hidden" name="head_img_path" value="${sessionScope.ad_user.head_img_path }" />
				<input type="submit" value="上 传" class="update"/>
			</div>
		</form>
		<br />
		<br />
		<div class="info">
			用户类型: 管理员
			<br />
			<br />
			用户编号:${sessionScope.ad_user.id }
			<br />
			<br />
			用户名称：${sessionScope.ad_user.ad_username }
		</div>

</body>
	<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
	
</html>
