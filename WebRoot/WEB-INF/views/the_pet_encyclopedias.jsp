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
<title>宠物百科详情</title>
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
<link rel="stylesheet" href="css/encyclopedias_details.css" />

<script language="JavaScript">
	javascript: window.history.forward(1);
</script>
</head>
<body>
        <a href="select_pet_encyclopedias"><img src="img/back.png" class="img"/></a>
		<h2>宠 物 百 科 详 情</h2>
		<br />
		<hr />
		<h3>${sessionScope.petEncyclopedias.pet_type }</h3>
		<br />
	    <div class="context_desc">${sessionScope.petEncyclopedias.pet_desc }</div>
		<div class="line"></div>
		<div class="pet_img">
			<img src="${sessionScope.petEncyclopedias.img_path }" id="img"/>
		</div>
		
		<div class="feed_model">
			<span><big>饲 养 方 法</big></span>
			<hr />
		</div>
		<div class="context_feed_model">${sessionScope.petEncyclopedias.pet_feed_mode }</div>
		<br /><br />
		<div class="mpg_ch">
			<span><big>形 态 特 征</big></span>
			<hr />
		</div>
		<div class="context_mpg_ch">${sessionScope.petEncyclopedias.pet_mpg_ch }</div>
		<br /><br />
		<div class="life_habits">
			<span><big>生 活 习 性</big></span>
			<hr />
		</div>
		<div class="context_life_habits">${sessionScope.petEncyclopedias.pet_life_habits }  </div>
		<br /><br />
		<div class="matters_attention">
			<span><big>注 意 事 项</big></span>
			<hr />
		</div>
		<div class="context_matters_attention">${sessionScope.petEncyclopedias.pet_matters_attention }</div>
		<div class="deleteAndUpdate">
			<a href="delect_pet_encyclopedias?id=${sessionScope.petEncyclopedias.id }">
				<button class="button">删 除</button>
			</a>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="update_pet_encyclopedias?id=${sessionScope.petEncyclopedias.id }">
				<button class="button">编 辑</button>
			</a>
		</div>
		<br /><br /><br />
</body>
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
</html>
