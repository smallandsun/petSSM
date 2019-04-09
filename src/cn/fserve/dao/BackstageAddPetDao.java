package cn.fserve.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import cn.fserve.model.Pet;

@Repository
public interface BackstageAddPetDao {
	
	public void add_the_pet(HashMap<String, Object> map);//添加宠物
	
}
