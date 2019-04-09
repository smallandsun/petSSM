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
<title>宠物百科查询</title>
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
<link rel="stylesheet" href="css/select_pet_encyclopedias.css" />

<script language="JavaScript">
	javascript: window.history.forward(1);
</script>
</head>
<body>
   <div>
		<br />
		<h2>宠 物 百 科 搜 索</h2>
		<br /> <br />
		<form action="select_the_pet_encyclopedias" method="post">
			<div class="head">
				<div class="one">
					<span>宠物类别 :</sapn> 
					<select id="pet_category" name="pet_category" onblur="selectPetType()">
							<option value="">请选择</option>
							<option value="犬类">犬类</option>
							<option value="猫类">猫类</option>
							<option value="鱼类">鱼类</option>
					</select>
				</div>

				<div class="two">
					<span>宠物类型 :</sapn> 
					<select id="pet_type" name="pet_type">
							<option value="">请选择</option>
					</select>
				</div>
			</div>
			<br /><br /><br /><br /><br /><br />
			<div id="submit">
				<input type="submit" class="submit" value="提 交" />
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="reset" class="submit" value="重 置" />
			</div>
		</form>
	</div>
</body>
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
<script src="js/select_pet_encyclopedias.js" charset="utf-8"></script>
</html>
