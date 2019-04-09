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
<title>修改管理员密码</title>
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
<link rel="stylesheet" href="css/updateAdminUserPassword.css" />

<script language="JavaScript"> 
    javascript:window.history.forward(1); 
</script>
</head>		
<body>
<br />
		<h2>修 改 密 码</h2>
		<br />
		<br />
		<input type="hidden" id="id" value="${sessionScope.adminUser.id }" />
		<div class="username">
			<span>用户名: &nbsp;${sessionScope.adminUser.ad_username }</span>
		</div>
		<br />
		<div id="userPassword">
			<span>旧 密 码:</span>  &nbsp; 
			<input id="oldPassword" type="password" class="passwordInput" 
			       onblur="oldPassword()" autocomplete="off" placeholder="请输入旧密码" />
		</div>
		<br />
		<div id="userPassword">
			<span>新 密 码:</span>  &nbsp; 
			<input  id="newPassword" type="password" class="passwordInput" 
			        onblur="newPassword()" autocomplete="off" placeholder="请输入新密码" />
		</div>
		<br />
		<div id="userPassword">
			<span>确认密码:  &nbsp;</span>
			<input id="confirmNewPassword" type="password" class="passwordInput" 
			       onblur="confirmNewPassword()" autocomplete="off" placeholder="请再次输入密码" />
		</div>
		<br />
		<br />
		<br />
		<div id="submit">
		    <input type="submit" class="submit" 
		           onblur="confirm_submit()"value="确  认  修  改" />
		</div>

</body>
	<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
	<script src="js/updateAdminUserPassword.js" charset="utf-8"></script>
	
</html>
