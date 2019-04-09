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
<title>赶宠网</title>
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

<script language="JavaScript"> 
    javascript:window.history.forward(1); 
</script>
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
					<form action="" method="post" class="clearfix">
						<input name="" type="text" placeholder="哈士奇" class="search-text" autocomplete="off">
						<button class="button_search">搜索</button>
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

			<!--导航、轮播-->
			<div class="yHeader">
				<!--宠物分类导航-->
				<div class="yNavIndex">
					<div class="pullDown">
						<h2 class="pullDownTitle"><i class="icon-class"></i>宠物及其用品分类</h2>
						<ul class="pullDownList">
							<!--犬类-->
							<li>
								<i class="list-icon-1"></i>
								<a href="" target="_blank">哈士奇</a>
								&nbsp;
								<a href="" target="_blank">松狮</a>
								&nbsp;
								<a href="" target="_blank">贵宾犬</a>
								<span></span>
							</li>
							<li>
								<i class="list-icon-2"></i>
								<a href="" target="_blank">吉娃娃</a>
								&nbsp;
								<a href="" target="_blank">博美犬</a>
								&nbsp;
								<a href="" target="_blank">阿拉斯加</a>
								<span></span>
							</li>
							<li>
								<i class="list-icon-2"></i>
								<a href="" target="_blank">德牧</a>
								&nbsp;
								<a href="" target="_blank">萨摩耶犬</a>
								&nbsp;
								<a href="" target="_blank">金毛</a>
								<span></span>
							</li>
							<!--猫类-->
							<li>
								<i class="list-icon-2"></i>
								<a href="" target="_blank">波斯猫</a>
								&nbsp;
								<a href="" target="_blank">橘猫</a>
								&nbsp;
								<a href="" target="_blank">苏格兰折耳猫</a>
								<span></span>
							</li>
							<li>
								<i class="list-icon-2"></i>
								<a href="" target="_blank">布偶猫</a>
								&nbsp;
								<a href="" target="_blank">美国短猫</a>
								&nbsp;
								<a href="" target="_blank">狸花猫</a>
								<span></span>
							</li>
							<li>
								<i class="list-icon-2"></i>
								<a href="" target="_blank">英国短猫</a>
								&nbsp;
								<a href="" target="_blank">安哥拉猫</a>
								&nbsp;
								<a href="" target="_blank">金吉拉</a>
								<span></span>
							</li>
							<!--鱼类-->
							<li>
								<i class="list-icon-2"></i>
								<a href="" target="_blank">宝石鱼</a>
								&nbsp;
								<a href="" target="_blank">斗鱼</a>
								&nbsp;
								<a href="" target="_blank">罗汉鱼</a>
								<span></span>
							</li>
							<li>
								<i class="list-icon-2"></i>
								<a href="" target="_blank">珍珠鱼</a>
								&nbsp;
								<a href="" target="_blank">灯鱼</a>
								&nbsp;
								<a href="" target="_blank">月光鱼</a>
								<span></span>
							</li>
							<li>
								<i class="list-icon-2"></i>
								<a href="" target="_blank">小丑鱼</a>
								&nbsp;
								<a href="" target="_blank">龙鱼</a>
								&nbsp;
								<a href="" target="_blank">玛丽鱼</a>
								<span></span>
							</li>
							<!--犬类用品-->
							<li>
								<i class="list-icon-2"></i>
								<a href="" target="_blank">狗粮</a>
								&nbsp;
								<a href="" target="_blank">狗窝</a>
								&nbsp;
								<a href="" target="_blank">牵引绳</a>
								<span></span>
							</li>
							<li>
								<i class="list-icon-2"></i>
								<a href="" target="_blank">狗盆</a>
								&nbsp;
								<a href="" target="_blank">美容台</a>
								&nbsp;
								<a href="" target="_blank">扭扭棒</a>
								<span></span>
							</li>
							<!--猫类用品-->
							<li>
								<i class="list-icon-2"></i>
								<a href="" target="_blank">猫粮</a>
								&nbsp;
								<a href="" target="_blank">猫窝</a>
								&nbsp;
								<a href="" target="_blank">吹水机</a>
								<span></span>
							</li>
							<li>
								<i class="list-icon-2"></i>
								<a href="" target="_blank">猫盆</a>
								&nbsp;
								<a href="" target="_blank">沐浴露</a>
								&nbsp;
								<a href="" target="_blank">尿片</a>
								<span></span>
							</li>
							<!--犬类用品-->
							<li>
								<i class="list-icon-2"></i>
								<a href="" target="_blank">鱼饵</a>
								&nbsp;
								<a href="" target="_blank">鱼缸</a>
								&nbsp;
								<a href="" target="_blank">温度计</a>
								<span></span>
							</li>
						</ul>
					</div>

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

						<div id="sub" class="none">
							<div id="a" class="sub-content none">
								<br />
								<dl>
									<dt>
                                       <a href="client_select_all_dog?a=1">&nbsp;犬类</a>
                                   </dt>
									<br />
									<hr />
									<dd>
										<a href="#">&nbsp;&nbsp;哈士奇&nbsp;</a>
										<a href="#">&nbsp;金毛&nbsp;</a>
										<a href="#">&nbsp;拉布拉多&nbsp;</a>
										<a href="#"><i>&gt;&gt;</i></a>
									</dd>
								</dl>

								<br />
								<dl>
									<dt>
                                       <a href="client_select_all_dog?a=2">&nbsp;猫类</a>
                                   </dt>
									<br />
									<hr />
									<dd>
										<a href="#">&nbsp;&nbsp;波斯猫&nbsp;</a>
										<a href="#">&nbsp;橘猫&nbsp;</a>
										<a href="#">&nbsp;小猫&nbsp;</a>
										<a href="#"><i>&gt;&gt;</i></a>
									</dd>
								</dl>

								<br />
								<dl>
									<dt>
                                       <a href="client_select_all_dog?a=3">&nbsp;鱼类</a>
                                   </dt>
									<br />
									<hr />
									<dd>
										<a href="#">&nbsp;&nbsp;珍珠鱼&nbsp;</a>
										<a href="#">&nbsp;宝石鱼&nbsp;</a>
										<a href="#">&nbsp;金鱼&nbsp;</a>
										<a href="#"><i>&gt;&gt;</i></a>
									</dd>
								</dl>
							</div>

							<div id="b" class="sub-content none">
								<br />
								<dl>
									<dt>
                                       <a href="client_select_all_life_tool">&nbsp;粮物</a>
                                   </dt>
									<br />
									<hr />
									<dd>
										<a href="#">&nbsp;&nbsp;狗粮&nbsp;</a>
										<a href="#">&nbsp;猫粮&nbsp;</a>
										<a href="#">&nbsp;鱼粮&nbsp;</a>
										<a href="#"><i>&gt;&gt;</i></a>
									</dd>
								</dl>

								<br />
								<dl>
									<dt>
                                       <a href="#">&nbsp;玩具</a>
                                   </dt>
									<br />
									<hr />
									<dd>
										<a href="#">&nbsp;&nbsp;狗窝&nbsp;</a>
										<a href="#">&nbsp;猫窝&nbsp;</a>
										<a href="#">&nbsp;鱼缸&nbsp;</a>
										<a href="#"><i>&gt;&gt;</i></a>
									</dd>
								</dl>
							</div>

							<div id="c" class="sub-content none">
								<br />
								<dl>
									<dt>
                                       <a href="#">&nbsp;犬类</a>
                                   </dt>
									<br />
									<hr />
									<dd>
										<a href="#">&nbsp;&nbsp;哈士奇&nbsp;</a>
										<a href="#">&nbsp;金毛&nbsp;</a>
										<a href="#">&nbsp;拉布拉多&nbsp;</a>
										<a href="#"><i>&gt;&gt;</i></a>
									</dd>
								</dl>

								<br />
								<dl>
									<dt>
                                       <a href="#">&nbsp;猫类</a>
                                   </dt>
									<br />
									<hr />
									<dd>
										<a href="#">&nbsp;&nbsp;波斯猫&nbsp;</a>
										<a href="#">&nbsp;橘猫&nbsp;</a>
										<a href="#">&nbsp;小猫&nbsp;</a>
										<a href="#"><i>&gt;&gt;</i></a>
									</dd>
								</dl>

								<br />
								<dl>
									<dt>
                                       <a href="#">&nbsp;鱼类</a>
                                   </dt>
									<br />
									<hr />
									<dd>
										<a href="#">&nbsp;&nbsp;珍珠鱼&nbsp;</a>
										<a href="#">&nbsp;宝石鱼&nbsp;</a>
										<a href="#">&nbsp;金鱼&nbsp;</a>
										<a href="#"><i>&gt;&gt;</i></a>
									</dd>
								</dl>
							</div>
						</div>
					</div>
				</div>

				<!--广告轮播-->
				<div id="wrapper">
					<div id="banner">
						<!-- 轮播部分 -->
						<ul class="imgList">
							<!-- 图片部分 -->
							<li>
								<img src="img/client_adver_one.jpg" width="1200px" height="480px" alt="puss in boots1">
							</li>
							<li>
								<img src="img/client_adver_two.jpg" width="1200px" height="480px" alt="puss in boots2">
							</li>
							<li>
								<img src="img/client_adver_three.jpg" width="1200px" height="480px" alt="puss in boots3">
							</li>
							<li>
								<img src="img/client_adver_four.jpg" width="1200px" height="480px" alt="puss in boots4">
							</li>
							<li>
								<img src="img/client_login_background.jpg" width="1200px" height="480px" alt="puss in boots5">
							</li>
						</ul>
					</div>
					<div class="bg"></div>
					<!-- 图片底部背景层部分-->

					<ul class="indexList">
						<!-- 图片右下角序号部分 -->
						<li class="indexOn">&nbsp;&nbsp;1&nbsp;&nbsp;</li>
						<li>&nbsp;&nbsp;2&nbsp;&nbsp;</li>
						<li>&nbsp;&nbsp;3&nbsp;&nbsp;</li>
						<li>&nbsp;&nbsp;4&nbsp;&nbsp;</li>
						<li>&nbsp;&nbsp;5&nbsp;&nbsp;</li>
					</ul>
				</div>
			</div>
		</header>
		<br><br>
		<!--推荐商品-->
		<div class="grooms">
			<div class="groom_goods">
			     <img src="img/client_recommend_logo.jpg" width="227px" height="403px"/>
			</div>
			<div class="groom_goods two">
			     <div class="goods_img">
			         <a href="client_select_all_dog?a=1">
			            <img src="img/client_recommend_dog_logo.jpg" width="227px" height="403px">
			         </a>
			     </div>
			</div>
			<div class="groom_goods three">
			     <div class="goods_img">
			         <a href="client_select_all_dog?a=2">
			            <img src="img/client_recommend_cat_logo.jpg" width="227px" height="403px">
			         </a>
			     </div>
			</div>
			<div class="groom_goods four">
			     <div class="goods_img">
			         <a href="client_select_all_dog?a=3">
			            <img src="img/client_recommend_fish_logo.jpg" width="227px" height="403px">
			         </a>
			     </div>
			</div>
			<div class="groom_goods five">
			     <div class="goods_img">
			         <a href="">
			            <img src="img/client_recommend_much_logo.jpg"width="227px" height="403px">
			         </a>
			     </div>
			</div>
		</div>
		<br /><br />
		<!--部分宠物-->
        <div style="height:1500px">
            <br /><br /><br /><br /><br /><br /><br /><br /><br /><br />
	        <p style="font-size: 30px; color: black; margin-left: 40%;">新宠推荐</p>
	        <!--动态商品-->
	        <form action="" method="post">
		        <div class="GoodsShow">
			        <div class="goodshow">
				        <c:forEach var="item" items="${client_pet }">
					        <div class="goods">
						        <a href="client_settlement_pet?goods_id=${item.id }">
						    	    <img src="${item.pet_img_path }" width="300" height="300">
						        </a>
						        <div class="wenzi">
							        <p class="gname">${item.pet_type }</p>
							        <p class="gscj">价格:￥${item.pet_price }</p>
						        </div>
					        </div>
				       </c:forEach>
			        </div>
		        </div>
	        </form>
        </div>
        <br><br>
        <!--部分物品-->
        <div style="height:1500px">
	        <p style="font-size: 30px; color: black; margin-left: 40%;">优品推荐</p>
	        <!--动态商品-->
	        <form action="" method="post">
		        <div class="GoodsShow">
			        <div class="goodshow">
				        <c:forEach var="item" items="${client_lifeTool }">
					        <div class="goods">
						        <a href="client_settlement_life_tool?goods_id=${item.id }">
						    	    <img src="${item.tool_img_path }" width="300" height="300">
						        </a>
						        <div class="wenzi">
							        <p class="gname">${item.tool_name }</p>
							        <p class="gscj">价格:￥${item.tool_price }</p>
						        </div>
					        </div>
				        </c:forEach>
			        </div>
		        </div>
	        </form>
        </div>
	    
	    <!--客户端底部-->
	    <div>
        	<div>
        		<img src="img/client_end_logo.png"/>
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
	<script type="text/javascript" src="js/client_lunbo.js"></script>
	<script type="text/javascript" src="js/megadropdown.js"></script>
	<script type="text/javascript" src="js/muach.js"></script>
	<script type="text/javascript" src="js/client_index_sundries.js" ></script>
</html>
