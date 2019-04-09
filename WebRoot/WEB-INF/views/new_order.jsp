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
<title>订单搜索</title>
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
<link rel="stylesheet" href="css/new_order.css" />

<script language="JavaScript">
	javascript: window.history.forward(1);
</script>
</head>
<body>
	<br />
	<h2>新 订 单</h2>
	<br />
	<br />
	<table>
		<thead class="thead">
			<tr>
				<th>订单编号</th>
				<th>商品名称</th>
				<th>客户地址</th>
				<th>商品数量</th>
				<th>客户电话</th>
				<th>是否发货</th>
				<th>是否收单</th>
				<th>其他</th>
			</tr>
		</thead>

		<c:forEach var="item" items="${orders}">
			<tr>
				<td>${item.order_number}</td>
				<td>${item.pet_type}</td>
				<td>${item.address}</td>
				<td>${item.goods_number}</td>
				<td>${item.phone}</td>
				<td>${item.send_goods}</td>
				<td>${item.acquiring}</td>
				<td>
				   <form action="update_orders_send_goods" method="post">
				      <input type="hidden" name="id" value="${item.id}" /> 
				      <input type="hidden" name="goods_id" value="${item.goods_id}" /> 
				      <input type="hidden" name="goods_number" value="${item.goods_number}" /> 
				      <input type="hidden" name="pet_number" value="${item.pet_number}" /> 
				      <input type="submit" value="确认收货" />
				   </form>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>

</html>
