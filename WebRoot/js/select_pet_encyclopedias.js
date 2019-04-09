/*宠物百科查询*/
function selectPetType() {
	
	$.ajax({
		type : 'POST',
		url : 'select_pet_type_encyclopedias',
		async : false,
		data : {
			pet_category : $('#pet_category').val()
		},
		dataType : "json",
		success : (function(res) {
			if (res.length > 0) {
				$('#pet_type').empty()
				$('#pet_type').append('<option value="">请选择</option>')
			}
			for (var i = 0; i < res.length; i++) {
				$('#pet_type').append('<option value=' + res[i].pet_type + '>' + res[i].pet_type + '</option>')
			}
			
		}),
	})
		return false;
}
