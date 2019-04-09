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

import cn.fserve.dao.BackstageOrderDao;
import cn.fserve.model.Orders;
import cn.fserve.model.Pet;
import cn.fserve.service.BackstageOrderService;


@Service
public class BackstageOrderServiceImpl implements BackstageOrderService {

	@Resource
	private BackstageOrderDao dao;

	@Override
	public List<Orders> new_order(String send_goods) {
		// TODO Auto-generated method stub
		return dao.new_order(send_goods);
	}

	@Override
	public void update_orders_send_goods(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		dao.update_orders_send_goods(map);
	}

	/*@Override
	public Pet the_pet(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.the_pet(map);
	}*/

	@Override
	public void update_pet_pet_number(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		dao.update_pet_pet_number(map);
	}

	@Override
	public List<Orders> select_the_order(Orders orders) {
		// TODO Auto-generated method stub
		return dao.select_the_order(orders);
	}
}
