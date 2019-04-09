/*backstage_login*/
$(document).ready(function() {
	$("#login").click(function() {

		$.ajax({
			type : 'POST',
			url : 'backstageLoginPost',
			data : {
				ad_username : $('#ad_username').val(),
				ad_password : $('#ad_password').val()
			},
			async : false,
			dataType : "text",
			success : (function(data) {
				if (data === "yes") {

					window.location.href = "backstage_index";

				} else if (data === "error") {

					alert("密码错误请重新输入！");

				}
			}),
			error : (function() {
				alert("error");
			})

		})
		return false;
	});
});
	