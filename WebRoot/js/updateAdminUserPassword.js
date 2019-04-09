/*updateAdminUserPassword*/
function oldPassword() {
		$.ajax({
			type : 'POST',
			url : 'oldPassword',
			data : {
				id : $('#id').val(),
				ad_password : $('#oldPassword').val()
			},
			dataType : "text",
			success : (function(date) {

				if (date === "no") {
					alert("密码错误请重新输入！");
				}
			}),
			error : (function() {
				alert("重复出现此问题请联系管理员！");
			})
		})
		return false;
	}

function newPassword() {
	$.ajax({
		type : 'POST',
		url : 'newPassword',
		data : {
			id : $('#id').val(),
			ad_password :  $('#newPassword').val()
		},
		dataType : "text",
		success : (function(date) {

			if (date === "no") {
				alert("新密码不能和旧密码一样!");
				
			}
		}),
		error : (function() {
			alert("重复出现此问题请联系管理员！");
		})
	})
	return false;
}
function confirmNewPassword() {
	var newPassword = document.all("newPassword").value;
	var confirmNewPassword = document.all("confirmNewPassword").value;
	if (newPassword != confirmNewPassword) {
		alert("两次输入的密码不一样,请重新输入！");
	}

}
function confirm_submit() {
	$.ajax({
		type : 'POST',
		url : 'updateAdminUserPassword',
		data : {
			id : $('#id').val(),
			ad_password : $('#newPassword').val()
		},
		dataType : "text",
		success : (function(date) {

			if (date === "yes") {
				alert("密码修改成功！");	
			}
			
		}),
		error : (function() {
			alert("重复出现此问题请联系管理员！");
		})
	})
	return false;
}