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
<title>宠物详情</title>
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
<link rel="stylesheet" href="css/goods_details.css" />

<script language="JavaScript">
	javascript: window.history.forward(1);
</script>
</head>
<body>
         <div>
			<div class="head">
				<div class="goodsImg">
					<img src="${sessionScope.thePet.pet_img_path }"/>
				</div>
				<div class="line"></div>
				<div class="goodsContext">
					<p>
						<span>宠 物 类 型 :</span><span class="fontColor">${sessionScope.thePet.pet_type }</span>
						<span>宠 物 体 型 :</span><span class="fontColor">${sessionScope.thePet.pet_shape }</span>
					</p>
					<p>
						<span>宠 物 名 称 :</span><span class="fontColor">${sessionScope.thePet.pet_name }</span>
						<span>适 合 食 物 :</span><span class="fontColor">${sessionScope.thePet.pet_food }</span>
					</p>
					<p>
						<span>宠 物 价 格 :</span><span class="fontColor">${sessionScope.thePet.pet_price }</span>
						<span>宠 物 体 重 :</span><span class="fontColor">${sessionScope.thePet.pet_weight }</span>
					</p>
					<p>
						<span>宠 物 数 量 :</span><span class="fontColor">${sessionScope.thePet.pet_number }</span>
						<span>宠 物 性 别 :</span><span class="fontColor">${sessionScope.thePet.pet_sex }</span>
					</p>
					<p>
						<span>宠 物 年 龄 :</span><span class="fontColor">${sessionScope.thePet.pet_age }</span>
						<span>血 统 证 明 :</span><span class="fontColor">${sessionScope.thePet.pet_certificate }</span>
					</p>
				</div>
			</div>
			<div class="context">
				<span>宠 物 描 述</span>
				<br />
				<div class="petDesc">${sessionScope.thePet.pet_desc }</div>
			</div>
			<br />
			<br />
			<br  >
			<br />
			<div class="deleteAndUpdate">
				<a href="delete_the_pet?id=${sessionScope.thePet.id }">
					<button class="button">删 除</button>
				</a>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="update_pet?id=${sessionScope.thePet.id }">
					<button class="button">编 辑</button>
				</a>
			</div>
		</div>
</body>
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
</html>
