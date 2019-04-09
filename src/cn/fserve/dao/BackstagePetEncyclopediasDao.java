package cn.fserve.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import cn.fserve.model.PetEncyclopedias;


@Repository
public interface BackstagePetEncyclopediasDao {
	
	public void add_the_pet_encyclopedias(HashMap<String, Object> map);//添加宠物百科
	
	public List<PetEncyclopedias> select_pet_type_encyclopedias(String pet_category);// 据宠物类别查询宠物类型

	public PetEncyclopedias select_the_pet_encyclopedias(HashMap<String, Object> map);//查询满足条件的宠物百科

	public void delect_pet_encyclopedias(HashMap<String, Object> map);//删除某一宠物百科
	
	PetEncyclopedias select_the_pet_encyclopedias_by_id(HashMap<String, Object> map);//据id查询某宠物百科
	
	public void update_the_pet_encyclopedias(HashMap<String, Object> map);//宠物百科更新
}
