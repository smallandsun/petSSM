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
<title>宠 物 窝</title>
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
<link rel="stylesheet" href="css/client_lunbo.css" />
<link rel="stylesheet" href="css/client_groom.css" />
<link rel="stylesheet" href="css/client_goods.css" />
<link rel="stylesheet" href="css/client_SJKinds.css" />
<link rel="stylesheet" href="css/client_bottom.css" />
<link rel="stylesheet" href="css/client_index_sundries.css" />

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
				
				<div style="height:15000px; background-color: white;">
	            <!--动态商品-->
		                <div class="GoodsShow">
			                <div class="goodshow">
				                <c:forEach var="item" items="${client_all_pet }">
					                <div class="goods">
						                <a href="client_settlement_pet?goods_id=${item.id }">
						    	            <img src="${item.pet_img_path }" width="300" height="300">
						                    <div class="wenzi">
							                    <p class="gname">${item.pet_type }</p>
							                    <p class="gscj">价格:${item.pet_price }</p>
						                    </div>
						                </a>
					                </div>
				                </c:forEach>
			                </div>
		                </div>
                </div>
                <br><br>
				
				

			
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
	<script type="text/javascript" src="js/client_index_sundries.js" ></script>
	<script src="js/client_index_sundries.js" type="text/javascript" charset="utf-8"></script>
</html>
