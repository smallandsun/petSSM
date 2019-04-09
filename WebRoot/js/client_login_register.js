/*邮箱验证*/
function validateEmail() {
	
	$.ajax({
		type : 'POST',
		url : 'client_validate_email',
		async : false,
		data : {
			user_email : $('#user_email').val()
		},
		dataType : "text",
		success : (function(date) {

			if (date === "no") {
				alert("此邮箱已被注册！");
				window.location.href = "client_register";
			}
			
		}),
	})
		return false;
}
/*验证两次输入的密码是否一致*/
function confirmPassword() {
	   var user_password_one = document.all("user_password_one").value;
	   var user_password_two = document.all("user_password_two").value;
	   if (user_password_one != user_password_two) {
		   alert("两次输入的密码不一样,请重新输入！");
	   }
    }

/*登陆验证，跳至客户端首页*/
$(document).ready(function() {
	$("#login").click(function() {

		$.ajax({
			type : 'POST',
			url : 'client_user_login',
			data : {
				user_email : $('#user_email').val(),
				user_password : $('#user_password').val()
			},
			async : false,
			dataType : "text",
			success : (function(data) {
				if (data === "yes") {

					window.location.href = "client_index";

				} else if (data === "no") {

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