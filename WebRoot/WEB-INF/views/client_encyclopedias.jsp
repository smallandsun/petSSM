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
<title>百科城</title>
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
<link rel="stylesheet" href="css/client_index_sundries.css" />
<link rel="stylesheet" href="css/client_encyclopedias.css" />

</head>		
<body>
     <header id="pc-header">
			<!--顶部信息-->
			<iframe src="client_usertop.html" frameborder="0" width="100%" height="35px"></iframe>

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
					<form action="client_select_the_encyclopedias" method="post" class="clearfix">
						<input name="pet_type" type="text" placeholder="哈士奇" id="key" class="search-text" autocomplete="off">
						<button class="button">搜索</button>
					</form>
				</div>
				<!--购物车-->
				<div class="fr pc-head-car">
					<i class="icon-car"></i>
					<a onclick="ShowShoppingSelect('MyDiv','fade')">我的购物车</a>
				</div>
			</div>
			
			<!--购物车选择弹出层-->
		    <div id="fade" class="black_overlay"></div>
		    <div id="MyDiv" class="white_content">
			    <div style="text-align: right; cursor: default; height: 40px; padding-top: 8px;
			        padding-right: 10px;">
				    <span style="font-size: 16px; color: red;" onclick="CloseDiv('MyDiv','fade')">x</span>
			    </div>
			    <div style="text-align: center; cursor: default; height: 40px; padding-top: 8px;
			        padding-right: 10px;">
				    <a href="client_select_shopping_pet" class="shopping_car_select_a">宠 物</a>
				    <i>&nbsp;&nbsp;&nbsp;</i>
				    <a href="client_select_shopping_life_tool" class="shopping_car_select_a">用 品</a>
			    </div>
		    </div>
			
			<!--导航-->
			<div class="yHeader">
				<div class="yNavIndex">
					<!--主导航-->
					<div id="test">
						<ul class="yMenuIndex">
							<li>
								<a href="client_index">首页</a>
							</li>
							<li data-id="a">
								<a href="client_select_all_pet">宠物窝</a>
							</li>
							<li data-id="b">
								<a href="client_select_all_life_tool">用品屋</a>
							</li>
							<li data-id="c">
								<a href="client_encyclopedias">百科城</a>
							</li>
							<li>
								<a href="client_select_vagrancy_acquiring">领养地</a>
							</li>
						</ul>
					</div>
				</div>
				
				<div>
					<img src="img/client_goods_title_logo.jpg" style="width: 100%;" />
				</div>
				<br />
				<table>
				<c:forEach var="item" items="${client_the_pet_encyclopedias }">
				<div style="height:1500px; background-color: white;">
	                <br>
	                <h2><big>${item.pet_type } 百 科 详 情</big></h2>
	                <br />
	                <hr />
	                <br />
	                <h3>${item.pet_type }</h3>
	                <br />
	                <div class="context_desc">&nbsp;&nbsp;&nbsp;&nbsp;${item.pet_desc }</div>
	                <div class="line"></div>
	                <div class="pet_img">
		                <img src="${item.img_path }" id="img" />
	                </div>

	                <div class="feed_model">
		                <span><big>饲 养 方 法</big></span>
		                <hr />
	                </div>
	                <div class="context_feed_model">${item.pet_feed_mode }</div>
	                    <br /><br />
	                <div class="mpg_ch">
		                <span><big>形 态 特 征</big></span>
		                <hr />
	                </div>
	                <div class="context_mpg_ch">${item.pet_mpg_ch }</div>
	                    <br /><br />
	                <div class="life_habits">
		                <span><big>生 活 习 性</big></span>
		                <hr />
	                </div>
	                <div class="context_life_habits">${item.pet_life_habits }</div>
	                    <br /><br />
	                <div class="matters_attention">
		                <span><big>注 意 事 项</big></span>
		                <hr />
	                </div>
	                <div class="context_matters_attention">${item.pet_matters_attention }</div>
                </div>
                </c:forEach>
                </table>
		
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
    </header>  
</body>	
	<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
</html>
