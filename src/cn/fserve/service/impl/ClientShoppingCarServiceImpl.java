package cn.fserve.service.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import cn.fserve.dao.ClientIndexDao;
import cn.fserve.dao.ClientShoppingCarDao;
import cn.fserve.model.LifeTool;
import cn.fserve.model.LifeToolShopping;
import cn.fserve.model.OrdersLifeTool;
import cn.fserve.model.OrdersPet;
import cn.fserve.model.Pet;
import cn.fserve.model.PetShopping;
import cn.fserve.service.ClientIndexService;
import cn.fserve.service.ClientShoppingCarService;

@Service
public class ClientShoppingCarServiceImpl implements ClientShoppingCarService {

	@Resource
	private ClientShoppingCarDao dao;

	@Override
	public void client_delect_shoppping_car_the_pet(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		dao.client_delect_shoppping_car_the_pet(map);
	}

	@Override
	public void client_delect_shoppping_car_the_life_tool(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		dao.client_delect_shoppping_car_the_life_tool(map);
	}

	@Override
	public List<PetShopping> client_select_the_pet(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.client_select_the_pet(map);
	}

	@Override
	public List<LifeToolShopping> client_select_the_life_tool(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.client_select_the_life_tool(map);
	}

	@Override
	public void client_buy_pet(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		dao.client_buy_pet(map);
	}

	@Override
	public void client_buy_life_tool(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		dao.client_buy_life_tool(map);
	}

	@Override
	public List<OrdersPet> client_select_orders_pet(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.client_select_orders_pet(map);
	}

	@Override
	public void client_update_orders_acquiring(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		dao.client_update_orders_acquiring(map);
	}

	@Override
	public List<OrdersLifeTool> client_select_orders_life_tool(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.client_select_orders_life_tool(map);
	}

	@Override
	public void client_add_shopping(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		dao.client_add_shopping(map);
	}
	
}
