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
<title>赶宠网后台管理系统登陆</title>
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
<link href="css/backstage_login_style.css" rel='stylesheet' type='text/css' />
<link href='http://fonts.useso.com/css?family=PT+Sans:400,700,400italic,700italic|Oswald:400,300,700'  
			     rel='stylesheet' type='text/css'>
<link href='http://fonts.useso.com/css?family=Exo+2' rel='stylesheet' type='text/css'>

<script language="JavaScript"> 
    javascript:window.history.forward(1); 
</script>
</head>		
<body>

		<h1>赶 宠 网 后 台 管 理 系 统 登 陆</h1>
		
		<div class="login-form">
			<div class="close"> </div>
			<div class="head-info">
				<label class="lbl-1"> </label>
				<label class="lbl-2"> </label>
				<label class="lbl-3"> </label>
			</div>
			<div class="clear"> </div>
			<div class="avtar">
				<img src="img/logo.png" />
			</div>
			
			<form>
				<input id="ad_username" type="text" class="text" placeholder="请输入账号">
				<div class="key">
					<input id="ad_password" type="password" placeholder="请输入密码" >
				</div>
			
			    <div class="signin">
				    <input id="login" type="submit" value="登  陆">
			    </div>
			</form>
		</div>

</body>
	<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
	<script src="js/backstage_login.js" charset="utf-8"></script>
	
</html>
