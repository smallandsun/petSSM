package cn.fserve.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import cn.fserve.model.Pet;

@Repository
public interface BackstageSelectPetDao {
	
	public List<Pet> select_type(String pet_category);// 据宠物类别查询宠物类型

	public List<Pet> select_the_pet(Pet pet);//查询满足条件的宠物
	
	public void delete_the_pet(HashMap<String, Object> map);//删除某一宠物
	
	Pet the_pet(HashMap<String, Object> map);//据id查询某宠物
	
	public void update_the_pet(HashMap<String, Object> map);//宠物更新
}
