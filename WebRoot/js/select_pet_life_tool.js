/*宠物物品查询*/
function selectPetLifeToolType() {
	
	$.ajax({
		type : 'POST',
		url : 'select_pet_life_tool_type',
		async : false,
		data : {
			tool_category : $('#tool_category').val()
		},
		dataType : "json",
		success : (function(res) {
			if (res.length > 0) {
				$('#tool_type').empty()
				$('#tool_type').append('<option value="">请选择</option>')
			}
			for (var i = 0; i < res.length; i++) {
				$('#tool_type').append('<option value=' + res[i].tool_type + '>' + res[i].tool_type + '</option>')
			}
			
		}),
	})
		return false;
}
function selectPetLifeToolName() {
	
	$.ajax({
		type : 'POST',
		url : 'select_pet_life_tool_name',
		async : false,
		data : {
			tool_type : $('#tool_type').val()
		},
		dataType : "json",
		success : (function(res) {
			if (res.length > 0) {
				$('#tool_name').empty()
				$('#tool_name').append('<option value="">请选择</option>')
			}
			for (var i = 0; i < res.length; i++) {
				$('#tool_name').append('<option value=' + res[i].tool_name + '>' + res[i].tool_name + '</option>')
			}
			
		}),
	})
		return false;
}