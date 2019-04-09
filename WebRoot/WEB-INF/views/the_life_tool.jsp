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
<title>宠物物品介绍</title>
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
					<img src="${sessionScope.theLifeTool.tool_img_path }"/>
				</div>
				<div class="line"></div>
				<div class="goodsContext">
					<p>
						<span>适合宠物类别 :</span><span class="fontColor">${sessionScope.theLifeTool.tool_category }</span>
						<span>宠物用品数量 :</span><span class="fontColor">${sessionScope.theLifeTool.tool_number }</span>
					</p>
					<p>
						<span>宠物用品类型 :</span><span class="fontColor">${sessionScope.theLifeTool.tool_type }</span>
						<span>宠物适用体型 :</span><span class="fontColor">${sessionScope.theLifeTool.fit_type }</span>
					</p>
					<p>
						<span>宠物用品名称 :</span><span class="fontColor">${sessionScope.theLifeTool.tool_name }</span>
						<span>宠物用品尺寸 :</span><span class="fontColor">${sessionScope.theLifeTool.tool_size }</span>
					</p>
					<p>
						<span>宠物用品价格 :</span><span class="fontColor">${sessionScope.theLifeTool.tool_price }</span>
						<span>宠物用品重量 :</span><span class="fontColor">${sessionScope.theLifeTool.tool_weight }</span>
					</p>
				</div>
			</div>
			<div class="context">
				<span>用品描述</span>
				<br />
				<div class="petDesc">${sessionScope.theLifeTool.tool_desc }</div>
			</div>
			<br />
			<br />
			<br  >
			<br />
			<div class="deleteAndUpdate">
				<a href="delete_the_life_tool?id=${sessionScope.theLifeTool.id }">
					<button class="button">删 除</button>
				</a>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="update_life_tool?id=${sessionScope.theLifeTool.id }">
					<button class="button">编 辑</button>
				</a>
			</div>
		</div>
</body>
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
</html>
