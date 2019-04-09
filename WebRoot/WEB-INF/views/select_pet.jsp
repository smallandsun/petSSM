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
<title>宠物查询</title>
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
	<form action="select_the_pet" method="post">
		<div class="selectHead">
			<div class="one">
				<label>宠物类别</label>
				<div class="select">
					<select id="pet_category" name="pet_category" onblur="selectPetType()">
						<option value="">请选择</option>
						<option value="犬类">犬类</option>
						<option value="猫类">猫类</option>
						<option value="鱼类">鱼类</option>
					</select>
				</div>
			</div>

			<div class="two">
				<label>宠物类型</label>
				<div class="select">
					<select id="pet_type" name="pet_type" >
						<option value="">请选择</option>
					</select>
				</div>
			</div>

			<div class="three">
				<label>宠物性别</label>
				<div class="select">
					<select name="pet_sex" >
						<option value="">请选择</option>
						<option value="雄性">雄性</option>
						<option value="雌性">雌性</option>
					</select>
				</div>
			</div>
			<hr />

			<div class="four">
				<label>宠物体型</label>
				<div class="select">
					<select  id="pet_shape" name="pet_shape" >
						<option value="">请选择</option>
						<option value="小型">小型</option>
						<option value="中型">中型</option>
						<option value="大型">大型</option>
					</select>
				</div>
			</div>

			<div class="five">
				<label>宠物婚姻</label>
				<div class="select">
					<select name="pet_marriage">
						<option value="">请选择</option>
						<option value="已婚配">已婚配</option>
						<option value="未婚配">未婚配</option>
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
				<th>宠物名称</th>
				<th>宠物类别</th>
				<th>宠物价格</th>
				<th>宠物性别</th>
				<th>宠物体重</th>
				<th>宠物年龄</th>
				<th>宠物婚姻</th>
				<th>血统证明</th>
				<th>其他</th>
			</tr>
		</thead>

        <c:forEach var="item" items="${pet}">
		   <tr>
			  <td>${item.pet_name}</td>
			  <td>${item.pet_type}</td>
			  <td>${item.pet_price}</td>
			  <td>${item.pet_sex}</td>
			  <td>${item.pet_weight}公斤</td>
			  <td>${item.pet_age}</td>
			  <td>${item.pet_marriage}</td>
			  <td>${item.pet_certificate}</td>
			  <td>
			      <a href="the_pet?id=${item.id}">查看详情</a>
			  </td>
		   </tr>
		</c:forEach>
	</table>
</body>
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
<script src="js/select_pet.js" charset="utf-8"></script>


</html>
