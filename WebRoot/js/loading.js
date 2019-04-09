/**
 * loading
 */
layui.use('layer', function() {
	document.onreadystatechange = loading;
	function loading() {
		var loading = layer.load(3);
		if (document.readyState == "complete") {
			layer.close(loading);
		}
	}
})