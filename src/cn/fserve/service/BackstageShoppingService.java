package cn.fserve.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import cn.fserve.model.LifeToolShopping;
import cn.fserve.model.Pet;
import cn.fserve.model.PetShopping;
import cn.fserve.model.VagrancyAdopt;

public interface BackstageShoppingService {

	public List<PetShopping> pet_shopping(HashMap<String, Object> map);//查询宠物购物车

	public List<LifeToolShopping> life_tool_shopping(HashMap<String, Object> map);//查询物品购物车

}
