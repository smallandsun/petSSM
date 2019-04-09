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
<title>赶宠网登陆</title>
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
<link rel="stylesheet" href="css/client_login_font-awesome.min.css" />
<link rel="stylesheet" href="css/client_login_snow.css" />
<link rel="stylesheet" href="css/client_login_style.css" />

<script language="JavaScript"> 
    javascript:window.history.forward(1); 
</script>
</head>		
<body>
        <!--背景下雪-->
		<div class="snow-container">
			<div class="snow foreground"></div>
			<div class="snow foreground layered"></div>
			<div class="snow middleground"></div>
			<div class="snow middleground layered"></div>
			<div class="snow background"></div>
			<div class="snow background layered"></div>
		</div>

		<div class="top-buttons-agileinfo">
			<a href="client_login" class="active">登录</a>
			<a href="client_register">注册</a>
		</div>
		
		<h1>赶宠网登录</h1>
		
		<div class="main-agileits">
			<div class="form-w3-agile">
				<h2 class="sub-agileits-w3layouts">登录</h2>
				<form>
					<input type="email" id="user_email" placeholder="邮箱"/>
					<input type="password" id="user_password" placeholder="密码"/>
					<br /><br />
					<div class="submit-w3l">
						<input type="submit" value="登录" id="login"/>
					</div>
					<p class="p-bottom-w3ls">
						<a href="client_register">点击注册</a>如果你没有一个帐户。 .
					</p>
				</form>
			</div>
		</div>
		
		<div class="copyright w3-agile">
			<p> © ssun</p>
		</div>
</body>
	<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
	<script src="js/client_login_register.js" charset="utf-8"></script>
</html>
