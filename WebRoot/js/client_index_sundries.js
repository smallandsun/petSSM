//hover 触发两个事件，鼠标移上去和移走
//mousehover 只触发移上去事件
$(".top-nav ul li").hover(function() {
	$(this).addClass("hover").siblings().removeClass("hover");
	$(this).find("li .nav a").addClass("hover");
	$(this).find(".con").show();
}, function() {
	// $(this).css("background-color","#f5f5f5");
	$(this).find(".con").hide();
	// $(this).find(".nav a").removeClass("hover");
	$(this).removeClass("hover");
	$(this).find(".nav a").removeClass("hover");
})

// 弹出隐藏层
function ShowShoppingSelect(show_div, bg_div) {
	document.getElementById(show_div).style.display = 'block';
	document.getElementById(bg_div).style.display = 'block';
	var bgdiv = document.getElementById(bg_div);
	bgdiv.style.width = document.body.scrollWidth;
	// bgdiv.style.height = $(document).height();
	$("#" + bg_div).height($(document).height());
};
// 关闭弹出层
function CloseDiv(show_div, bg_div) {
	document.getElementById(show_div).style.display = 'none';
	document.getElementById(bg_div).style.display = 'none';
};