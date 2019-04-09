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
<title>更新宠物</title>
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
        <h2>宠 物 更 新</h2>
		<form action="update_the_pet" enctype="multipart/form-data" method="post">
			<div class="petContext">
				<img src="${sessionScope.the_pet.pet_img_path }" />
				<span>&nbsp;&nbsp;&nbsp;&nbsp;替换宠物图片 :</span>
				<input type="file" name="file" class="file">
				<br />
				<br />
				<span>宠物类别 : &nbsp;&nbsp;</span>
				<input type="text" name="pet_category" value="${sessionScope.the_pet.pet_category }"/>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<span>宠物类型 ：</span>
				<input type="text"  name="pet_type" value="${sessionScope.the_pet.pet_type }"/>
				<br />
				<br />
				<span>宠物名称 ：</span>
				<input type="text" name="pet_name" value="${sessionScope.the_pet.pet_name }"/>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<span>宠物价格 ：</span>
				<input type="text" name="pet_price" value="${sessionScope.the_pet.pet_price }"/>
				<br />
				<br />
				<span>宠物数量 ：</span>
				<input type="text" name="pet_number" value="${sessionScope.the_pet.pet_number }"/>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<span>宠物年龄 ：</span>
				<input type="text" name="pet_age" value="${sessionScope.the_pet.pet_age }"/>
				<br />
				<br />
				<span>宠物体型 ：</span>
				<input type="text" name="pet_shape" value="${sessionScope.the_pet.pet_shape }"/>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<span>宠物食物 ：</span>
				<input type="text" name="pet_food" value="${sessionScope.the_pet.pet_food }"/>
				<br />
				<br />
				<span>宠物用途 ：</span>
				<input type="text" name="pet_purpose" value="${sessionScope.the_pet.pet_purpose }"/>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<span>宠物体重 ：</span>
				<input type="text" name="pet_weight" value="${sessionScope.the_pet.pet_weight }"/>
				<br />
				<br />
				<span>宠物性别 ：</span>
				<input type="text" name="pet_sex" value="${sessionScope.the_pet.pet_sex }"/>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<span>宠物年龄 ：</span>
				<input type="text" name="pet_age" value="${sessionScope.the_pet.pet_age }"/>
				<br />
				<br />
				<span>宠物婚姻 ：</span>
				<input type="text" name="pet_marriage" value="${sessionScope.the_pet.pet_marriage }"/>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<span>血统证明 ：</span>
				<input type="text" name="pet_certificate" value="${sessionScope.the_pet.pet_certificate }"/>
				<br />
				<br />
				<div>
					<span>宠物描述 ：</span>
				</div>
				<div>
				    <textarea name="pet_desc" class="petDesc">${sessionScope.the_pet.pet_desc }</textarea>
				</div>
			</div>
			<br /><br />
			<div id="submit">
			    <input type="hidden" name="id" value="${sessionScope.the_pet.id }" />
			    <input type="hidden" name="pet_img_path" value="${sessionScope.the_pet.pet_img_path }" />
				<input type="submit" class="submit" value="提 交" />
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="reset" class="submit" value="重 置" />
			</div>
			<br /><br /><br /><br />
		</form>

</body>
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
</html>
