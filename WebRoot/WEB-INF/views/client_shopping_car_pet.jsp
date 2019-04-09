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
<title>购物车</title>
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
<link rel="stylesheet" href="css/client_base.css" />
<link rel="stylesheet" href="css/client_home.css" />
<link rel="stylesheet" href="css/client_bottom.css" />
<link rel="stylesheet" href="css/client_shoping_car.css" />

</head>		
<body>
<header id="pc-header">
			<!--顶部信息-->
			<iframe src="client_usertop" frameborder="0" width="100%" height="35px"></iframe>

			<!--logo、搜索、购物车-->
			<div class="pc-header-logo clearfix">
				<!--logo-->
				<div class="pc-fl-logo fl">
					<h1>
				       <img src="img/client_logo.png" width="240px" height="90px"/>
			        </h1>
				</div>
				<!--搜索-->
				<div class="head-form fl">
					<form class="clearfix">
						<input type="text" placeholder="哈士奇" id="key" class="search-text" autocomplete="off">
						<button class="button" onclick="search('key');return false;">搜索</button>
					</form>
					<div class="words-text clearfix">
						<a href="#" class="red">新到萌宠</a>
						<a href="#">限时低价</a>
						<a href="#">进口狗粮</a>
						<a href="#">爱心领宠</a>
						<a href="#">百科爱宠</a>
						<a href="#">多买多送</a>

					</div>
				</div>
				<!--购物车-->
				<div class="fr pc-head-car">
					<i class="icon-car"></i>
					<a href="client_select_shopping_life_tool" target="_blank">用品购物车</a>
				</div>
			</div>
			
			<div class="shopping_car_title">
			    <span>购物车</span>
			</div>
			
			<!-- 购物车商品列表 -->
			<div class="shopping_car_list">
				<div class="shopping_car_list_goods"><span >商 品</span></div>
				<div class="shopping_car_list_price"><span >单 价</span></div>
				<div class="shopping_car_list_number"><span >数 量</span></div>
				<div class="shopping_car_list_operation"><span >操 作</span></div>
			</div>
			
			<c:forEach var="item" items="${client_pet_all }">
				<div class="shopping_car_goods_list">
					<img src="${item.pet_img_path }" />
					<div class="shopping_car_goods_content">
						<sapn>宠 物 类 别 :</sapn><sapn>${item.pet_category }</sapn>
						<br /><br />
						<sapn>宠 物 类 型 :</sapn><sapn>${item.pet_type }</sapn>
						<br /><br />
						<sapn>血 统 证 书 :</sapn><sapn>${item.pet_certificate }</sapn>
						<br /><br />
						<sapn>宠 物 用 途 :</sapn><sapn>${item.pet_purpose }</sapn>
					</div>
					<div class="shopping_car_goods_price">
						<sapn>￥${item.pet_price }</span>
					</div>
					<div class="shopping_car_goods_number">
						<sapn>${item.goods_number }件</span>
					</div>
					<div class="shopping_car_goods_operation">
						<a href="client_delect_shoppping_car_the_pet?shopping_id=${item.shopping_id }" style="color: white;">移除</a>
						<i>&nbsp;&nbsp;&nbsp;&nbsp;</i>
						<a href="client_settlement_pet?goods_id=${item.goods_id }" style="color: white;">结算</a>
					</div>
				</div>
			</c:forEach>
			
			<div class="shopping_car_back">
				<a href="client_index">返回商城</a>
			</div>
			
            <div>
        	    <div>
        		    <img src="img/client_end_logo.png" style="width: 100%;"/>
        	    </div>
        	    <hr />
        	    <div class="client_bottom_nav">
        		   <ul>
        			  <li>
        				  <span>关于我们</span>
        				  <br /><br />
        				  <a href="">用户服务协议</a>
        				  <a href="">网站服务条款</a>
        				  <a href="">联系我们</a>
        			  </li>
        			  <li>
        				  <span>配送方式</span>
        				  <br /><br />
        				  <a href="">上门自提</a>
        				  <a href="">配送服务查询</a>
        				  <a href="">配送费收取标准</a>
        			  </li>
        			  <li>
        				  <span>支付方式</span>
        				  <br /><br />
        				  <a href="">货到付款</a>
        				  <a href="">邮局汇款</a>
        				  <a href="">建行转账</a>
        			  </li>
        			  <li>
        				  <span>售后服务</span>
        				  <br /><br />
        				  <a href="">售后政策</a>
        				  <a href="">退款说明</a>
        				  <a href="">价格保护</a>
        			  </li>
        			  <li>
        			  </li>
        			  <li>
        				  <span>&nbsp;&nbsp;本店已面向中国大陆</span>
        				  <br /><br />
        				  <sapn>如有特别需求请微信扫码加一下店主</sapn>
        				  <img src="img/client_weixin.png" width="100px" height="100px" />.
        			  </li>
        		  </ul>
        	  </div>
          </div>
</body>
	<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
	
</html>
