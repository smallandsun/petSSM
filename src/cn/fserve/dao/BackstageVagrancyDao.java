package cn.fserve.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import cn.fserve.model.VagrancyAdopt;

@Repository
public interface BackstageVagrancyDao {
	
	public void add_the_vagrancy(HashMap<String, Object> map);//添加流浪宠

	public List<VagrancyAdopt> select_the_vagrancy_one(HashMap<String, Object> map);//查询满足条件的流浪宠
	
	public List<VagrancyAdopt> select_the_vagrancy_two(HashMap<String, Object> map);//查询满足条件的流浪宠

	public VagrancyAdopt the_vagrancy_one(HashMap<String, Object> map);//据id查询流浪宠
	
	public VagrancyAdopt the_vagrancy_two(HashMap<String, Object> map);//据id查询流浪宠

	public void delect_the_vagrancy(HashMap<String, Object> map);//删除某一流浪宠

	public void update_the_vagrancy(HashMap<String, Object> map);//流浪宠更新

}
