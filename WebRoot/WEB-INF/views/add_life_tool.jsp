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
<title>用品上架</title>
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
<link rel="stylesheet" href="css/add_pet.css" />

<script language="JavaScript">
	javascript: window.history.forward(1);
</script>
</head>
<body>
        <h2>宠 物 物 品 上 架</h2>
		<form action="add_the_life_tool" enctype="multipart/form-data" method="post">
			<div class="petContext">
				<span>上传宠物物品图片 :</span>
				<input type="file" name="file" class="file">
				<br />
				<br />
				<span>适合宠物类别 : &nbsp;&nbsp;</span>
				<select name="tool_category">
					<option value="">请选择</option>
					<option value="犬类">犬类</option>
					<option value="猫类">猫类</option>
					<option value="鱼类">鱼类</option>
				</select>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<span>宠物用品类型 ：</span>
				<input type="text"  name="tool_type" value=""/>
				<br />
				<br />
				<span>宠物用品名称 ：</span>
				<input type="text" name="tool_name" value=""/>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<span>宠物用品价格 ：</span>
				<input type="text" name="tool_price" value=""/>
				<br />
				<br />
				<span>宠物用品数量 ：</span>
				<input type="text" name="tool_number" value=""/>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<span>宠物适用体型 ：</span>
				<input type="text" name="fit_type" value=""/>
				<br />
				<br />
				<span>宠物用品尺寸 ：</span>
				<input type="text" name="tool_size" value=""/>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<span>宠物用品重量 ：</span>
				<input type="text" name="tool_weight" value=""/>
				<br />
				<br />
				<div>
					<span>宠物用品描述 ：</span>
				</div>
				<div>
				    <textarea name="tool_desc" class="toolDesc"></textarea>
				</div>
				
			</div>
			<input type="hidden" name="admin_user_id" value="${sessionScope.adminUser.id }" />
			<div id="submit">
				<input type="submit" class="submit" value="提 交" />
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="reset" class="submit" value="重 置" />
			</div>
			<br /><br /><br /><br />
			<br /><br /><br /><br />
		</form>
</body>
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>

</html>
