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
    <form action="select_the_pet_life_tool" method="post">
		<div class="selectHead">
			<div class="one">
				<label>适合宠物类别</label>
				<div class="select_life_tool">
					<select id="tool_category" name="tool_category" onblur="selectPetLifeToolType()">
						<option value="">请选择</option>
						<option value="犬类">犬类</option>
						<option value="猫类">猫类</option>
						<option value="鱼类">鱼类</option>
					</select>
				</div>
			</div>

			<div class="two">
				<label>宠物用具类型</label>
				<div class="select_life_tool">
					<select id="tool_type" name="tool_type" onblur="selectPetLifeToolName()">
						<option value="">请选择</option>
					</select>
				</div>
			</div>

			<div class="three">
				<label>宠物用具名称</label>
				<div class="select_life_tool">
					<select id="tool_name" name="tool_name" >
						<option value="">请选择</option>
					</select>
				</div>
			</div>
			<hr />

			<div class="four">
				<label>宠物用具价格</label>
				<div class="select_life_tool">
					<select  id="tool_price" name="tool_price" >
						<option value="">请选择</option>
						<option value="0">1~100</option>
						<option value="100">100~200</option>
						<option value="200">200~300</option>
						<option value="300">300~400</option>
						<option value="400">400~500</option>
						<option value="500">500元以上</option>
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
				<th>用品类型</th>
				<th>用品名称</th>
				<th>用品价格</th>
				<th>用品数量</th>
				<th>适用宠物</th>
				<th>用品尺寸</th>
				<th>用品重量</th>
				<th>其他</th>
			</tr>
		</thead>

        <c:forEach var="item" items="${lifeTool}">
		   <tr>
			  <td>${item.tool_type}</td>
			  <td>${item.tool_name}</td>
			  <td>${item.tool_price}</td>
			  <td>${item.tool_number}</td>
			  <td>${item.fit_type}</td>
			  <td>${item.tool_size}</td>
			  <td>${item.tool_weight}</td>
			  <td>
			      <a href="the_life_tool?id=${item.id}">查看详情</a>
			  </td>
		   </tr>
		</c:forEach>
	</table>
</body>
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
<script src="js/select_pet_life_tool.js" charset="utf-8"></script>
</html>
