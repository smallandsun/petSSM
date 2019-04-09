package cn.fserve.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import cn.fserve.model.LifeTool;
import cn.fserve.model.LifeToolShopping;
import cn.fserve.model.PetShopping;
import cn.fserve.model.VagrancyAdopt;

@Repository
public interface BackstageShoppingDao {
	
	public List<PetShopping> pet_shopping(HashMap<String, Object> map);//查询宠物购物车
	
	public List<LifeToolShopping> life_tool_shopping(HashMap<String, Object> map);//查询物品购物车
}
