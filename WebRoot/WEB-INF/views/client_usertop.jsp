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
<title>赶宠网顶部</title>
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
<link rel="stylesheet" href="css/client_base.css" />
<link rel="stylesheet" href="css/client_home.css" />

<script language="JavaScript"> 
    javascript:window.history.forward(1); 
</script>
</head>		
<body>
        <header id="pc-header">
			<div class="pc-header-nav">
				<div class="pc-header-con">
					<div class="fl pc-header-link">

						您好！ 欢迎来赶宠网
						<%  Object a=session.getAttribute("users");
							if(a!=null){
 	                    %>
						        <a href="" target="_blank">${sessionScope.users.user_name }</a>
						<%
	                        }else{
	                    %>
						        <a href="client_login" target="_blank">请登录</a>
						<%
	                        }
	                    %>

						<a href="client_register" target="_blank"> 免费注册</a>
					</div>
					<div class="fr pc-header-list top-nav">
						<ul>
							<li>
								<div class="nav">
									<i class="pc-top-icon"></i>
									<a href="client_orders_pet" target="_blank">我的订单</a>
								</div>
							</li>
							<li>
								<a href="#">我的收藏</a>
							</li>
							<li>
								<a href="#">客户服务</a>
							</li>
							<li>
								<a href="#">帮助中心</a>
							</li>
						</ul>
					</div>
				</div>
			</div>
		</header>       
</body>
	<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
</html>
