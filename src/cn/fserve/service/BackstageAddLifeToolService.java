package cn.fserve.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public interface BackstageAddLifeToolService {
	
	public void add_the_life_tool(CommonsMultipartFile file, String realUploadPath, String UploadPath,
			String newrealpath,String tool_category,String tool_type,String tool_name,String tool_price,
			String tool_number,String fit_type,String tool_size,String tool_weight,
			String tool_desc,String admin_user_id);//添加用品
	
}
