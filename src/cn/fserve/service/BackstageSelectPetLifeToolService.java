package cn.fserve.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import cn.fserve.model.LifeTool;

public interface BackstageSelectPetLifeToolService {
	
	public List<LifeTool> select_pet_life_tool_type(String tool_category);//据用品类别查询用品类型
	
	public List<LifeTool> select_pet_life_tool_name(String tool_type);//据用品类型查询用品名称
	
	public List<LifeTool> select_the_pet_life_tool(HashMap<String, Object> map);//查询满足条件的用品

	public LifeTool the_life_tool(HashMap<String, Object> map);//据id查询某用品

	public void delete_the_life_tool(HashMap<String, Object> map);//删除某一用品
	
	public void update_the_life_tool(CommonsMultipartFile file, String realUploadPath, String UploadPath,
			String newrealpath,String tool_category,String tool_type,String tool_name,String tool_price,
			String tool_number,String fit_type,String tool_size,String tool_weight,
			String tool_desc,int id,String tool_img_path);//用品更新
}
