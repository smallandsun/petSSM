package cn.fserve.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import cn.fserve.model.LifeToolShopping;
import cn.fserve.model.OrdersLifeTool;
import cn.fserve.model.OrdersPet;
import cn.fserve.model.PetShopping;

public interface ClientShoppingCarService {
	
	public void client_delect_shoppping_car_the_pet(HashMap<String, Object> map);//删除某一购物车记录(宠物)

	public void client_delect_shoppping_car_the_life_tool(HashMap<String, Object> map);//删除某一购物车记录(用品)

	public List<PetShopping> client_select_the_pet(HashMap<String, Object> map);//查询某一宠物
 
	public List<LifeToolShopping> client_select_the_life_tool(HashMap<String, Object> map);//查询某一用品

	public void client_buy_pet(HashMap<String, Object> map);//购买宠物，添加订单
	
	public void client_buy_life_tool(HashMap<String, Object> map);//购买宠物，添加订单

	public List<OrdersPet> client_select_orders_pet(HashMap<String, Object> map);//查询未签收的宠物订单
	
	public void client_update_orders_acquiring(HashMap<String, Object> map);//用户签收商品
	
	public List<OrdersLifeTool> client_select_orders_life_tool(HashMap<String, Object> map);//查询未签收的用品订单
	
	public void client_add_shopping(HashMap<String, Object> map);



}
