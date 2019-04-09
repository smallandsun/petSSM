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
<title>宠物上架</title>
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
        <h2>宠 物 上 架</h2>
		<form action="add_the_pet" enctype="multipart/form-data" method="post">
			<div class="petContext">
				<span>上传宠物图片 :</span>
				<input type="file" name="file" class="file">
				
				<br />
				<br />
				<span>宠物类别 : &nbsp;&nbsp;</span>
				<select name="pet_category">
					<option value="">请选择</option>
					<option value="犬类">犬类</option>
					<option value="猫类">猫类</option>
					<option value="鱼类">鱼类</option>
				</select>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<span>宠物类型 ：</span>
				<input type="text"  name="pet_type" value=""/>
				
				<br />
				<br />
				<span>宠物名称 ：</span>
				<input type="text" name="pet_name" value=""/>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<span>宠物价格 ：</span>
				<input type="text" name="pet_price" value=""/>
				
				<br />
				<br />
				<span>宠物数量 ：</span>
				<input type="text" name="pet_number" value=""/>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<span>宠物年龄 ：</span>
				<input type="text" name="pet_age" value=""/>
				
				<br />
				<br />
				<span>宠物体型 ：</span>
				<input type="text" name="pet_shape" value=""/>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<span>宠物食物 ：</span>
				<input type="text" name="pet_food" value=""/>
				
				<br />
				<br />
				<span>宠物用途 ：</span>
				<input type="text" name="pet_purpose" value=""/>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<span>宠物体重 ：</span>
				<input type="text" name="pet_weight" value=""/>
				
				<br />
				<br />
				<span>宠物性别 ：</span>
				<select name="pet_sex">
					<option value="">请选择</option>
					<option value="雄性">雄性</option>
					<option value="雌性">雌性</option>
				</select>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<span>宠物婚姻 ：</span>
				<select name="pet_marriage">
					<option value="">请选择</option>
					<option value="未婚配">未婚配</option>
					<option value="已婚配">已婚配</option>
				</select>
				
				<br />
				<br />
				<span>血统证明 ：</span>
				<input type="text" name="pet_certificate" value=""/>
				
				<br />
				<br />
				<div>
					<span>宠物描述 ：</span>
				</div>
				<div>
				    <textarea name="pet_desc" class="petDesc"></textarea>
				</div>
				
			</div>
			<input type="hidden" name="admin_user_id" value="${sessionScope.adminUser.id }" />
			<br /><br /><br /><br />
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
