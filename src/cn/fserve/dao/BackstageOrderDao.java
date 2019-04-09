package cn.fserve.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import cn.fserve.model.Orders;
import cn.fserve.model.Pet;

@Repository
public interface BackstageOrderDao {
	
	public List<Orders> new_order(String send_goods);//查询新订单
	
	public void update_orders_send_goods(HashMap<String, Object> map);//确认发货
	
	//Pet the_pet(HashMap<String, Object> map);//据id查询某宠物
	
	public void update_pet_pet_number(HashMap<String, Object> map);//更新宠物数量
	
	public List<Orders> select_the_order(Orders orders);//查询满足条件的订单
}
