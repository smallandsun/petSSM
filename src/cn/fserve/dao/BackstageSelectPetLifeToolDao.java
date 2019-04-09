package cn.fserve.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import cn.fserve.model.LifeTool;

@Repository
public interface BackstageSelectPetLifeToolDao {
	
	public List<LifeTool> select_pet_life_tool_type(String tool_category);//据用品类别查询用品类型
	
	public List<LifeTool> select_pet_life_tool_name(String tool_type);//据用品类型查询用品名称

	public List<LifeTool> select_the_pet_life_tool(HashMap<String, Object> map);//查询满足条件的用品

	LifeTool the_life_tool(HashMap<String, Object> map);//据id查询某用品
	
	public void delete_the_life_tool(HashMap<String, Object> map);//删除某一用品
	
	public void update_the_life_tool(HashMap<String, Object> map);//用品更新
}
