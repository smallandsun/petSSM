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
<title>流浪宠搜索</title>
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
     <form action="select_the_vagrancy" method="post">
		<div class="selectHead">
			<!-- <div class="one">
				<label>流浪宠类型</label>
				<div class="select">
					<input type="text" name="vagrancy_type" value="" class="input"/>
				</div>
			</div> -->

			<div class="one">
				<label>是否被领养</label>
				<div class="select">
					<select name="vagrancy_acquiring" >
						<option value="">请选择</option>
						<option value="已被领养">已被领养</option>
						<option value="未被领养">未被领养</option>
					</select>
				</div>
			</div>
		</div>
		<div id="button">
			<input type="submit" class="button" value="查 询" />
		</div>
		<hr />

	</form>

	<table>
		<thead class="thead">
			<tr>
				<th>流浪宠编号</th>
				<th>流浪宠类型</th>
				<th>是否被领养</th>
				<th>领养人</th>
				<th>其他</th>
			</tr>
		</thead>

        <c:forEach var="item" items="${vagrancy }">
		   <tr>
			  <td>${item.id }</td>
			  <td>${item.vagrancy_type }</td>
			  <td>${item.vagrancy_acquiring }</td>
			  <td>${item.user_name }</td>
			  <td>
			      <a href="the_vagrancy?id=${item.id }&vagrancy_acquiring=${item.vagrancy_acquiring }">查看详情</a>
			  </td>
		   </tr>
		</c:forEach>
	</table>
</body>
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
</html>
