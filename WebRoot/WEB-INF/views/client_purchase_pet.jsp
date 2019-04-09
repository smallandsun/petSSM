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
<title>购买页</title>
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
<link rel="stylesheet" href="css/client_shoping_car.css" />
<link rel="stylesheet" href="css/client_bottom.css" />
<link rel="stylesheet" href="css/client_purchase.css" />

</head>		
<body>
        <header id="pc-header">
			<!--顶部信息-->
			<iframe src="client_usertop" frameborder="0" width="100%" height="35px"></iframe>
			
			<div class="back_">
				<a href="client_index">返回商城</a>
			</div>
			
            <!--购买详情-->
            <div class="div1_3">
		            <c:forEach var="item" items="${client_the_pet }">
		               <!-- <form action="client_buy_pet" methed="post"> -->
			            <div class="div3_4">
				            <img src="${item.pet_img_path }" />
			            </div>
			             
			            <div class="div3_5">
				            <div class="div5_1">
					            <img src="${item.pet_img_path }" data-index='1' />
				            </div>
				            <div class="div5_2">
					            <img src="${item.pet_img_path }" data-index='2' />
				            </div>
				            <div class="div5_3">
					            <img src="${item.pet_img_path }" data-index='3' />
				            </div>
				            <div class="div5_4">
					            <img src="${item.pet_img_path }" data-index='4' />
				            </div>
				            <div class="div5_5">
					            <img src="${item.pet_img_path }" data-index='5' />
				            </div>
			            </div>
			            
			            <div class="div3_6">
				            <div class="div6_7">
					            <p>${item.pet_type }</p>
				            </div>
				            
				            <div class="div6_8">
					            <p>价格 :&nbsp;<span>￥${item.pet_price }</span></p>
					            <br />
					            <p>类别 :&nbsp;<span>${item.pet_price }</span></p>
					            <br />
					            <p>可购买数量 :&nbsp;<span>${item.pet_number }</span></p>
				            </div>

				            <div class="div6_9">
					            <hr width='100%' size='1px' color='#E8E8E8'>
					            <br />
					            <a onclick="ShowShoppingSelect('MyDiv','fade')">添加配送地址</a>
					            <i>&nbsp;&nbsp;&nbsp;</i>
					            <textarea id="address"></textarea>
				            </div>
				            
				            <!--购物车选择弹出层-->
		                    <div id="fade" class="black_overlay"></div>
		                    <div id="MyDiv" class="white_content">
			                    <div style="text-align: right; cursor: default; height: 40px; padding-top: 
			                    	8px;padding-right: 10px;">
				                <span style="font-size: 16px; color: red;" 
				                	onclick="CloseDiv('MyDiv','fade')">x</span>
			                    </div>
			                    <div style="cursor: default; height: 40px; padding-top:
			                    	8px;padding-right: 10px;">
			                    	<i>&nbsp;&nbsp;&nbsp;</i>
				                    <sapn>详细地址 :</sapn>
				                    <input id="address_" name="address" type="text" value="" class="text_address"/>
				                    <br /><br /><br />
				                    <i>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</i>
				                    <i>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</i>
				                    <i>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</i>
				                    <a class="text_address_a" onclick="CloseDiv('MyDiv','fade')">确认添加</a>
			                    </div>
		                    </div>

				            <div class="div6_10">
				                <p>
					            	手机号
						            <input id="phone" name="phone" type="text" value=""/>
					            </p>
					            <br />
					            <p>
					            	数量
						            <input id="goods_number" name="goods_number" type="text" value="${item.goods_number }" class="number"/>
					            </p>
				            </div>
				            
				            <div class="div6_11">
				                <br />
				                <input id="goods_id" name="goods_id" type="hidden" value="${item.id }"/>
				                <input id="user_id" name="user_id" type="hidden" value="${sessionScope.users.id }"/>
					            <input type="submit" value="立刻购买" onclick="clientBuyPet()" class="add_shopping_car_submit"/>
					            <input type="submit" value="加入购物车" onclick="clientAddShopping()" class="add_shopping_car_submit"/>
					            <p>承诺<span>7&nbsp;天无理由退货</span></p>
				             </div>
			            </div>
			          <!-- </form> -->
		            </c:forEach>
            </div>

            <br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br />
            <br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br />
            <br /><br /><br /><br /><br /><br />
            
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
	<script src="js/client_purchase.js" charset="utf-8"></script>
	
</html>
