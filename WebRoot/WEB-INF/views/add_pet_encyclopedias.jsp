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
<title>宠物百科添加</title>
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
<link rel="stylesheet" href="css/add_pet_encyclopedias.css" />

<script language="JavaScript">
	javascript: window.history.forward(1);
</script>
</head>
<body>
    <div>
		<br />
		<h2>宠 物 百 科 添 加</h2>
		<br />
		<br />
		<form action="add_the_pet_encyclopedias" enctype="multipart/form-data" method="post">
			<div class="petImg">
				<span>上传宠物图片 :</span>
				<input type="file" name="file" class="file">
			</div>
			<div class="category_type">
				<span>宠物类别 :</span>
				<select name="pet_category">
					<option value="">请选择</option>
					<option value="犬类">犬类</option>
					<option value="猫类">猫类</option>
					<option value="鱼类">鱼类</option>
				</select>
				<span class="space"></span>
				<span>宠物类型 :</span>
				<input type="text" name="pet_type" value="" />
			</div>
			<div class="context">
				<span>宠物描述 :</span>
				<div class="textarea">
					<textarea name="pet_desc"></textarea>
				</div>
			</div>
			<div class="context">
				<span>饲养方法 :</span>
				<div class="textarea">
					<textarea name="pet_feed_mode"></textarea>
				</div>
			</div>
			<div class="context">
				<span>形态特征 :</span>
				<div class="textarea">
					<textarea name="pet_mpg_ch"></textarea>
				</div>
			</div>
			<div class="context">
				<span>生活习性 :</span>
				<div class="textarea">
					<textarea name="pet_life_habits"></textarea>
				</div>
			</div>
			<div class="context">
				<span>注意事项 :</span>
				<div class="textarea">
					<textarea name="pet_matters_attention"></textarea>
				</div>
			</div>
			<br /><br /><br /><br />
			<div id="submit">
				<input type="submit" class="submit" value="提 交" />
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="reset" class="submit" value="重 置" />
			</div>
		</form>
		<br /><br /><br /><br />
	</div>
</body>
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>

</html>
