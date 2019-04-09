/**
 * 对layui tab的封装
 * mainId  为 layui tab 的id
 */
function Tab(mainId) {
	this.mainId = mainId;

	var This = this;
	layui.use('element', function() {
		var element = layui.element();
		element.on('tab(' + mainId + ')', function(data) {

			if(This.tabShowCallBack) {
				if(data.index == 0) {
					This.tabShowCallBack(0);
				} else {
					This.tabShowCallBack(This.tabsId[data.index - 1]);
				}
			}

		});
	});
}

/**
 * 容器id
 */
Tab.prototype.mainId = null;

/**
 * 所有tab的id
 */
Tab.prototype.tabsId = new Array();

/**
 * 当tab被显示时的回调函数，把当前的id回带过去
 * 例如：
 * var tab = new Tab("content_tab");
	tab.tabShowCallBack = function(id) {
		alert(id);
	}
 */
Tab.prototype.tabShowCallBack;

Tab.prototype.isExist = function(id) {
	for(var i = 0; i < this.tabsId.length; i++) {
		if(this.tabsId[i] == id) {
			return true;
		}
	}
	return false;
};

/**
 * 添加一个标签
 */
Tab.prototype.add = function(id, icon, title, url) {
	var element = layui.element();
	//如果已经存在 切换显示
	if($("#title_" + id)[0]) {
		element.tabChange('content_tab', id);
		$("#iframe_" + id).attr("src", url);
		return;
	}
	this.tabsId[this.tabsId.length] = id;

	element.tabAdd('content_tab', {
		title: '<span id="title_' + id + '" icon="' + icon + '" title="' + title + '" url="' + url + '" ><i class="' + icon + '" style="color:#009688"></i>' + title + "</span>",
		content: '<div class="layui-body layui-tab-content right-tab-body"><div class="layui-main"><iframe id="iframe_' + id + '" frameborder="0" scrolling="yes" onload="setIframeHeight(this)" style="width: 100%;height:100%" src="' + url + '"/></div></div>',
		id: id
	});
	element.tabChange(this.mainId, id);

};

/**
 * 设置内容的iframe 高度
 */
function setIframeHeight(iframe) {
	if(iframe) {
		var iframeWin = iframe.contentWindow || iframe.contentDocument.parentWindow;
		if(iframeWin.document.body) {
			iframe.height = (iframeWin.document.documentElement.scrollHeight || iframeWin.document.body.scrollHeight);
		}
	}
}