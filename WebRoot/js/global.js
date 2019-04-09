layui.use('jquery',function(){
	var $ = layui.jquery;
	
	function showUrl(title,url) {
		$.post(url,{},function(data) {
			var myLayer = window.parent.layer;
			if(!myLayer) {
				myLayer = layer;
			}
			myLayer.open({
			    type: 1,
			    area: ['800px',"500px"],
			    title:title,
			    content: data
			 });
		},"html");
	}

	function msg(content) {
		var myLayer = window.parent.layer;
		if(!myLayer) {
			myLayer = layer;
		}
		myLayer.msg(content, {time: 2000});
	}

	function wait(content) {
		var myLayer = window.parent.layer;
		if(!myLayer) {
			myLayer = layer;
		}
		if(!content) {
			content = "请稍后....";
		}
		myLayer.msg(content,{shade:0.3,time: 10000});
	}

	function hide() {
		var myLayer = window.parent.layer;
		if(!myLayer) {
			myLayer = layer;
		}
		myLayer.closeAll();
	}

	function error(content) {
		var myLayer = window.parent.layer;
		if(!myLayer) {
			myLayer = layer;
		}
		myLayer.msg(content, {time: 2000});
	}

	function success(content) {
		var myLayer = window.parent.layer;
		if(!myLayer) {
			myLayer = layer;
		}
		myLayer.msg(content, {time: 2000});
	}

	function tip(content) {
		var myLayer = window.parent.layer;
		if(!myLayer) {
			myLayer = layer;
		}
		myLayer.msg(content, {time: 2000});
	}

	//确认对话框
	function confirm(url,msg) {
		var myLayer = layer;
		myLayer.open({
		    content:msg,
		    yes:function() {
		    	window.location.href=url;
		    	return false;
		    }
		});
	}

	function showDialog(title,msg,callBack) {
		var myLayer = layer;
		myLayer.open({
			title:title,
		    content:msg,
		    yes:function(index) {
		    	myLayer.close(index);
		    	if(callBack) {
		    		callBack();
		    	}
		    	return false;
		    }
		});
	}

	$(function() {
		layui.define(['layer', 'code', 'form', 'element', 'util'], function(exports){
			var $ = layui.jquery;
			var layer = layui.layer;
			var form = layui.form();
			var device = layui.device();
			//阻止IE7以下访问
			if(device.ie && device.ie < 8){
				layer.alert('浏览器最低支持ie8，您当前使用的IE版本是：'+ device.ie + '，建议更换浏览器重试哦~');
			}
			//手机设备的简单适配
			var treeMobile = $('.site-tree-mobile');
			var shadeMobile = $('.site-mobile-shade');

			treeMobile.on('click', function(){
				$('body').addClass('site-mobile');
			});

			shadeMobile.on('click', function(){
				$('body').removeClass('site-mobile');
			});
			exports('global', {});
			
			//菜单借点 图标
			window.global = {
			  preview: function(){
			    var preview = document.getElementById('LAY_preview');
			    return preview ? preview.innerHTML : '';
			  }()
			};
		});	
	});

	$.getUrlParam = function (name) {
	    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
	    var r = window.location.search.substr(1).match(reg);
	    if (r != null) return unescape(r[2]); return null;
	};

	function resizeShowTab() {
		if(window.parent) {
			window.parent.$(".layui-show").find("iframe").load();
		}
		else {
			$(".layui-show").find("iframe").load();
		}
	}
})
