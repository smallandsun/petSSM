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
<title>宠物物品搜索</title>
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
<link rel="stylesheet" href="css/select_pet.css" />

<script language="JavaScript">
	javascript: window.history.forward(1);
</script>
</head>
<body>
    <form action="select_the_order" method="post">
		<div class="selectHead">
			<div class="one">
				<label>是否已发货</label>
				<div class="select">
					<select name="send_goods">
						<option value="">请选择</option>
						<option value="已发货">已发货 </option>
						<option value="未发货">未发货</option>
					</select>
				</div>
			</div>

			<div class="two">
				<label>是否已签收</label>
				<div class="select">
					<select name="acquiring">
						<option value="">请选择</option>
						<option value="已签收">已签收</option>
						<option value="未签收">未签收</option>
					</select>
				</div>
			</div>

			<div class="three">
				<label>订单编号</label>
				<div class="select">
					<input type="text" name="order_number" value="" class="input"/>
				</div>
			</div>
			<hr />
		</div>
		<div id="button">
			<input type="submit" class="button" value="查 询" />
		</div>
		<hr />
	</form>

	<table>
		<thead class="thead">
			<tr>
				<th>订单编号</th>
				<th>商品名称</th>
				<th>商品数量</th>
				<th>是否已发货</th>
				<th>是否已签收</th>
				<th>客户地址</th>
				<th>客户电话</th>
			</tr>
		</thead>

        <c:forEach var="item" items="${theOrder }">
		   <tr>
			  <td>${item.order_number }</td>
			  <td>${item.pet_type }</td>
			  <td>${item.goods_number }</td>
			  <td>${item.send_goods }</td>
			  <td>${item.acquiring }</td>
			  <td>${item.address }</td>
			  <td>${item.phone }</td>
		   </tr>
		</c:forEach>
	</table>
</body>
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
</html>
