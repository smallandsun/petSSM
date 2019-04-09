package cn.fserve.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import cn.fserve.model.LifeTool;
import cn.fserve.model.LifeToolShopping;
import cn.fserve.model.Pet;
import cn.fserve.model.PetEncyclopedias;
import cn.fserve.model.PetShopping;
import cn.fserve.model.VagrancyAdopt;

@Repository
public interface ClientIndexDao {
	
	public List<Pet> client_select_pet();//查询部分宠物
	
	public List<LifeTool> client_select_life_tool();//查询部分用品
	
	public List<PetShopping> client_select_shopping_pet(HashMap<String, Object> map);//查询购物车中所有宠物

	public List<LifeToolShopping> client_select_shopping_life_tool(HashMap<String, Object> map);//查询购物车中所有用品

	public List<Pet> client_select_all_pet();//查询所有宠物
	
	public List<LifeTool> client_select_all_life_tool();//查询所有用品
	
	public List<PetEncyclopedias> client_select_the_encyclopedias(HashMap<String, Object> map);//查询某一宠物的百科

	public List<VagrancyAdopt> client_select_vagrancy_acquiring(HashMap<String, Object> map);//查询为被领养的流浪宠

	public void client_update_vagrancy_acquiring(HashMap<String, Object> map);//用户申请流浪宠

	public List<Pet> client_select_all_dog(HashMap<String, Object> map);//查询所有宠物犬
	
}
