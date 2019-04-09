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
<title>更新宠物百科</title>
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
<link rel="stylesheet" href="css/update_encyclopedias.css" />

<script language="JavaScript">
	javascript: window.history.forward(1);
</script>
</head>
<body>
        <br />
		<h2>宠 物 百 科 更 新</h2>
		<form action="update_the_pet_encyclopedias" enctype="multipart/form-data" method="post">
			<div class="context">
				<img src="${sessionScope.thePetEncyclopedias.img_path }" />
				<span>&nbsp;&nbsp;&nbsp;&nbsp;替换宠物图片 :</span>
				<input type="file" name="file" class="file">
				<br />
				<br />
				<br />
				<span>宠物类别 : &nbsp;&nbsp;</span>
				<input type="text" name="pet_category" value="${sessionScope.thePetEncyclopedias.pet_category }"/>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<span>宠物类型 ：</span>
				<input type="text" name="pet_type" value="${sessionScope.thePetEncyclopedias.pet_type }"/>
				<br />
				<br />
				<div>
					<span>宠物描述 ：</span>
				</div>
				<div>
				    <textarea name="pet_desc" class="encyclopedias">
				        ${sessionScope.thePetEncyclopedias.pet_desc }
				    </textarea>
				</div>
				<div>
					<span>饲养方法 ：</span>
				</div>
				<div>
				    <textarea name="pet_feed_mode" class="encyclopedias">
				        ${sessionScope.thePetEncyclopedias.pet_feed_mode }
				    </textarea>
				</div>
				
				<div>
					<span>形态特征 ：</span>
				</div>
				<div>
				    <textarea name="pet_mpg_ch" class="encyclopedias">
				        ${sessionScope.thePetEncyclopedias.pet_mpg_ch }
				    </textarea>
				</div>
				<div>
					<span>生活习性：</span>
				</div>
				<div>
				    <textarea name="pet_life_habits" class="encyclopedias">
				        ${sessionScope.thePetEncyclopedias.pet_life_habits }
				    </textarea>
				</div>
				<div>
					<span>注意事项：</span>
				</div>
				<div>
				    <textarea name="pet_matters_attention" class="encyclopedias">
				         ${sessionScope.thePetEncyclopedias.pet_matters_attention }
				    </textarea>
				</div>
			</div>
			<div id="submit">
			    <input type="hidden" name="id" value="${sessionScope.thePetEncyclopedias.id }" />
			    <input type="hidden" name="img_path" value="${sessionScope.thePetEncyclopedias.img_path }" />
				<input type="submit" class="submit" value="提 交" />
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="reset" class="submit" value="重 置" />
			</div>
			<br /><br /><br /><br />
		</form>
</body>
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
</html>
