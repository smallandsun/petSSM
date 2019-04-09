//弹出隐藏层  
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
	var address = document.all("address_").value;
	$('#address').empty();
	$('#address').append(address);
	document.getElementById(show_div).style.display = 'none';
	document.getElementById(bg_div).style.display = 'none';

};
function clientBuyPet() {

	$.ajax({
		type : 'POST',
		url : 'client_buy_pet',
		async : false,
		data : {
			goods_id : $('#goods_id').val(),
			goods_number : $('#goods_number').val(),
			address : $('#address_').val(),
			phone : $('#phone').val(),
			user_id : $('#user_id').val()
		},
		dataType : "text",
		success : (function(date) {

			if(date === "yes"){
				alert("购买成功,货到付款！");
				window.location.href = "client_orders_pet";
			}else{
				alert("购买失败，请稍后再试！");
			}
				
			
		}),
	})
	return false;
}
function clientAddShopping() {

	$.ajax({
		type : 'POST',
		url : 'client_add_shopping',
		async : false,
		data : {
			goods_id : $('#goods_id').val(),
			goods_number : $('#goods_number').val(),
			user_id : $('#user_id').val()
		},
		dataType : "text",
		success : (function(date) {

			if(date === "yes"){
				alert("加入购物车成功！");
				window.location.href = "client_select_shopping_pet";
			}else{
				alert("加入购物车失败，请稍后再试！");
			}
				
			
		}),
	})
	return false;
}
function clientBuyLifeTool() {

	$.ajax({
		type : 'POST',
		url : 'client_buy_life_tool',
		async : false,
		data : {
			goods_id : $('#goods_id').val(),
			goods_number : $('#goods_number').val(),
			address : $('#address_').val(),
			phone : $('#phone').val(),
			user_id : $('#user_id').val()
		},
		dataType : "text",
		success : (function(date) {

			if(date === "yes"){
				alert("购买成功,货到付款！");
				window.location.href = "client_orders_life_tool";
			}else{
				alert("购买失败，请稍后再试！");
			}
		}),
	})
	return false;
}