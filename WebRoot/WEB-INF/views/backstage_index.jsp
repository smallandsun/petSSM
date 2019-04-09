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
<title>赶宠网后台管理系统</title>
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
<link href="css/font-awesome.min.css" rel="stylesheet" media="screen">
<link href="css/iconfont.css" rel="stylesheet" media="screen">
<link rel="stylesheet" href="layui/css/layui.css" />
<link rel="stylesheet" type="text/css" href="css/main.css" />
<script language="JavaScript"> 
    javascript:window.history.forward(1); 
</script>
</head>
<body>
	<div class="layui-layout-admin">
		<!-- head  -->
		<div class="top-header">
			<img src="img/doglogo.png" class="logo" /> <span class="top-title">赶 宠 网 后 台 管 理 系 统</span>
			<ul class="layui-nav layui-header" lay-filter="top-nav">
				<li class="layui-nav-item">
				   <a href="javascript:;" style="cursor: pointer;">
				      欢迎：
				      <%  Object a=session.getAttribute("adminUser");
							if(a!=null){
 	                    %>
						        ${sessionScope.adminUser.ad_username }
						<%
	                        }else{
	                    %>
						        <div>
						            <a href="backstage_login">请重新登陆</a>
						        </div>
						<%
	                        }
	                    %>
				   </a>
					<dl class="layui-nav-child">
						<dd>
							<a href="backstage_login">注销</a>
						</dd>
					</dl>
				</li>
			</ul>
		</div>
		
		<!-- left_navigation -->
		<div class="layui-side layui-bg-black">
			<div class="layui-side-scroll">
				<ul class="layui-nav layui-nav-tree left-nav">
				
					<!-- 首页 -->
					<li class="layui-nav-item left-nav-border-bottom">
					   <a href="javascript:;">首页</a>
					</li>
					
					<!--宠物搜索-->
					<li class="layui-nav-item left-nav-border-bottom">
					   <a class="javascript:;" href="javascript:;"> 
					      <cite>宠物搜索</cite>
					   </a>
					   
					   <dl class="layui-nav-child">
							<dd class="left-nav-child-child">
								<a class="javascript:;" onclick="tab.add('21','','宠物搜索','select_pet')"
									href="javascript:;"> 
									<cite>宠物搜索</cite>
								</a>
							</dd>
						</dl> 
						
						<dl class="layui-nav-child">
							<dd class="left-nav-child-child">
								<a class="javascript:;" onclick="tab.add('22','','宠物物品搜索','select_pet_life_tool')"
									href="javascript:;"> 
									<cite>宠物物品搜索</cite>
								</a>
							</dd>
						</dl>
					</li>
					
					<!--宠物上架-->
					<li class="layui-nav-item left-nav-border-bottom">
					   <a class="javascript:;" href="javascript:;"> 
					      <cite>宠物上架</cite>
					   </a>
					   
					   <dl class="layui-nav-child">
							<dd class="left-nav-child-child">
								<a class="javascript:;" onclick="tab.add('31','','宠物上架','add_pet')"
									href="javascript:;"> 
									<cite>宠物上架</cite>
								</a>
							</dd>
						</dl>
						
						<dl class="layui-nav-child">
							<dd class="left-nav-child-child">
								<a class="javascript:;" onclick="tab.add('32','','宠物物品上架','add_life_tool')"
									href="javascript:;"> 
									<cite>宠物物品上架</cite>
								</a>
							</dd>
						</dl>
					</li>
					
					<!--订单-->
					<li class="layui-nav-item left-nav-border-bottom">
					    <a class="javascript:;" href="javascript:;"> 
					       <cite>订单</cite>
					    </a>
					    <dl class="layui-nav-child">
							<dd class="left-nav-child-child">
								<a class="javascript:;" onclick="tab.add('41','','新订单','new_order')" href="javascript:;"> 
									<cite>新订单</cite>
								</a>
							</dd>
						</dl>
						<dl class="layui-nav-child">
							<dd class="left-nav-child-child">
								<a class="javascript:;" onclick="tab.add('42','','订单搜索','select_order')" href="javascript:;">
									<cite>订单搜索</cite>
								</a>
							</dd>
						</dl>
					</li>
					
					<!--宠物领养管理-->
					<li class="layui-nav-item left-nav-border-bottom">
					    <a class="javascript:;" href="javascript:;"> 
					       <cite>宠物领养管理</cite>
					    </a>
						<dl class="layui-nav-child">
							<dd class="left-nav-child-child">
								<a class="javascript:;" onclick="tab.add('51','','流浪宠搜索','select_vagrancy')"
									href="javascript:;">
								    <cite>流浪宠搜索</cite>
								</a>
							</dd>
						</dl>
						<dl class="layui-nav-child">
							<dd class="left-nav-child-child">
								<a class="javascript:;" onclick="tab.add('52','','流浪宠添加','add_vagrancy')"
									href="javascript:;"> 
									<cite>流浪宠的添加</cite>
								</a>
							</dd>
						</dl>
					</li>
					
					<!-- 购物车管理 -->
					<li class="layui-nav-item left-nav-border-bottom">
					    <a class="javascript:;" href="javascript:;">
                            <cite>购物车管理</cite>
					    </a>
						<dl class="layui-nav-child">
							<dd class="left-nav-child-child">
								<a class="javascript:;" onclick="tab.add('61','','宠物购物车管理','pet_shopping')"
									href="javascript:;"> 
									<cite>宠物购物车管理</cite>
								</a>
							</dd>
						</dl>
						<dl class="layui-nav-child">
							<dd class="left-nav-child-child">
								<a class="javascript:;" onclick="tab.add('62','','宠物物品购物车管理','life_tool_shopping')"
									href="javascript:;"> 
									<cite>宠物物品购物车管理</cite>
								</a>
							</dd>
						</dl>
					</li>
					
					<!--宠物百科管理-->
					<li class="layui-nav-item left-nav-border-bottom">
					    <a class="javascript:;" href="javascript:;"> 
					       <cite>宠物百科管理</cite>
					    </a>
					    
						<dl class="layui-nav-child">
							<dd class="left-nav-child-child">
								<a class="javascript:;" onclick="tab.add('71','','宠物百科搜索','select_pet_encyclopedias')"
									href="javascript:;">
                                    <cite>宠物百科搜索</cite>
								</a>
							</dd>
						</dl>
						
						<dl class="layui-nav-child">
							<dd class="left-nav-child-child">
								<a class="javascript:;" onclick="tab.add('72','','宠物百科添加','add_pet_encyclopedias')"
									href="javascript:;"> 
									<cite>宠物百科添加</cite>
								</a>
							</dd>
						</dl>
				    </li>
				    
					<!--管理员信息-->
					<li class="layui-nav-item left-nav-border-bottom">
					    <a class="javascript:;" href="javascript:;"> 
					       <cite>管理员信息</cite>
					    </a>
					    
						<dl class="layui-nav-child">
							<dd class="left-nav-child-child">
								<a class="javascript:;" onclick="tab.add('81','','管理员信息','show_admin_info?id=${sessionScope.adminUser.id }')"
									href="javascript:;"> 
									<cite>管理员信息</cite>
								</a>
							</dd>
						</dl>
						
						<dl class="layui-nav-child">
							<dd class="left-nav-child-child">
								<a class="javascript:;" onclick="tab.add('82','','修改密码','update_admin_pwd')"
									href="javascript:;"> 
									<cite>修改密码</cite>
								</a>
							</dd>
						</dl>
					</li>
					
				</ul>
			</div>
		</div>

		<!-- middle_area -->
		<div class="layui-tab layui-tab-brief right-content" lay-filter="content_tab" lay-allowClose="true">
			<ul oncontextmenu="return false;" onselectstart="return false;" class="layui-tab-title site-demo-title">
				<li class="layui-this" lay-id="home">
				   <i  class="fa fa-home fa-fw" style="color: #009688"></i>首页
				   <i  class="layui-icon layui-unselect layui-tab-close" style="display: none;"></i>
				</li>
			</ul>
			<div class="layui-tab-content">
				<div class="layui-tab-item layui-show">
					<div class="layui-body layui-tab-content right-tab-body">
						<div class="layui-main">
						   <div style="text-align: center">
						      <!-- 这是主页内容 -->
							  <h1 style="font-size: 50px">欢迎登陆赶宠网后台管理系统</h1>
						   </div>
						</div>
					</div>
				</div>
			</div>
		</div>
		
		<!-- bottom -->
		<div class="layui-footer footer footer-demo">
			<div class="layui-main">
				<p>
					2018 &copy; <a href="http://www.layui.com">www.catchpet.com</a>
				</p>
			</div>
		</div>
		<div class="site-tree-mobile layui-hide"></div>
		<div class="site-mobile-shade"></div>
	</div>
	
</body>

	<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
	<script src="layui/lay/dest/layui.all.js" charset="utf-8"></script>
	<script src="js/global.js" charset="utf-8"></script>
	<script src="js/tab.js" charset="utf-8"></script>
	<script src="js/index.js" charset="utf-8"></script>
</html>
