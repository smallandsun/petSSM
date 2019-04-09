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
<title>更新用品</title>
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
<link rel="stylesheet" href="css/update_the_pet.css" />

<script language="JavaScript">
	javascript: window.history.forward(1);
</script>
</head>
<body>
        <h2>宠 物 物 品 更 新</h2>
		<form action="update_the_life_tool" enctype="multipart/form-data" method="post">
			<div class="petContext">
				<img src="${sessionScope.the_life_tool.tool_img_path }" />
				<span>&nbsp;&nbsp;&nbsp;&nbsp;替换宠物物品图片 :</span>
				<input type="file" name="file" class="file">
				<br />
				<br />
				<span>适合宠物类别 : &nbsp;&nbsp;</span>
				<input type="text" name="tool_category" value="${sessionScope.the_life_tool.tool_category }"/>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<span>宠物用品类型 ：</span>
				<input type="text"  name="tool_type" value="${sessionScope.the_life_tool.tool_type }"/>
				<br />
				<br />
				<span>宠物用品名称 ：</span>
				<input type="text" name="tool_name" value="${sessionScope.the_life_tool.tool_name }"/>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<span>宠物用品价格 ：</span>
				<input type="text" name="tool_price" value="${sessionScope.the_life_tool.tool_price }"/>
				<br />
				<br />
				<span>宠物用品数量 ：</span>
				<input type="text" name="tool_number" value="${sessionScope.the_life_tool.tool_number }"/>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<span>宠物适用体型 ：</span>
				<input type="text" name="fit_type" value="${sessionScope.the_life_tool.fit_type }"/>
				<br />
				<br />
				<span>宠物用品尺寸  ：</span>
				<input type="text" name="tool_size" value="${sessionScope.the_life_tool.tool_size }"/>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<span>宠物用品重量 ：</span>
				<input type="text" name="tool_weight" value="${sessionScope.the_life_tool.tool_weight }"/>
				<br />
				<br />
				<div>
					<span>宠物用品描述 ：</span>
				</div>
				<div>
				    <textarea name="tool_desc" class="toolDesc">${sessionScope.the_life_tool.tool_desc }</textarea>
				</div>
			</div>
			<div id="submit">
			    <input type="hidden" name="id" value="${sessionScope.the_life_tool.id }" />
			    <input type="hidden" name="tool_img_path" value="${sessionScope.the_life_tool.tool_img_path }" />
				<input type="submit" class="submit" value="提 交" />
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="reset" class="submit" value="重 置" />
			</div>
			<br /><br /><br /><br />
		</form>    
</body>
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
</html>
