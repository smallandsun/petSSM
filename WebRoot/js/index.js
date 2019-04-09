var tab = null;
$(function() {
	tab = new Tab("content_tab");
	tab.tabShowCallBack = function(id) {
		//alert(id);
	}
});

$('#sideHome').click(function() {
	element.tabChange('content_tab', 'home');
})
layui.use(['form', 'layer', 'element', 'flow'], function() {
	var form = layui.form(),
		layer = layui.layer,
		flow = layui.flow,
		element = layui.element();
})
$('#Kindtype input[type=radio]').click(function() {
	console.log($(this).attr('value'))
})
