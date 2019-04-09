function clientVagrancyApply() {

	$.ajax({
		type : 'POST',
		url : 'client_vagrancy_apply',
		async : false,
		data : {
			id : $('#id').val(),
			adopter_id : $('#adopter_id').val()
		},
		dataType : "text",
		success : (function(date) {

			if(date === "yes"){
				alert("申请成功,等待商家回应！");
			}else{
				alert("申请失败，请稍后再试！");
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