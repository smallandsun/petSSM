package cn.fserve.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cn.fserve.model.Orders;
import cn.fserve.model.Pet;
import cn.fserve.service.impl.BackstageOrderServiceImpl;
import cn.fserve.util.AutoIdBySys;
import cn.fserve.util.GetSession;

@Controller
public class BackstageOrderController {

	@Resource
	private BackstageOrderServiceImpl service;
	

	private static final String CONTENT_TYPE = "text/xml; charset=UTF-8";
	private final static Logger logger = LoggerFactory.getLogger(BackstageOrderController.class);

	
	/*跳至新订单页，并查询出新订单？？？*/
	@RequestMapping(value = "new_order")
	@ResponseBody
	public ModelAndView new_order() {	
		String send_goods="未发货";
		List<Orders> list=service.new_order(send_goods);
		ModelAndView model = new ModelAndView();	
		model.addObject("orders", list);
		model.setViewName("new_order");
		return model;		
	}
	
	/*确认发货*/
	@RequestMapping(value = "update_orders_send_goods")
	@ResponseBody
	public ModelAndView update_orders_send_goods(
			@RequestParam("id") int id,
			@RequestParam("goods_id") String goods_id,
			@RequestParam("goods_number") String goods_number,
			@RequestParam("pet_number") String pet_number) {	
		String send_goods="已发货";
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("send_goods", send_goods);
		service.update_orders_send_goods(map);
		map.clear();
		map.put("id", goods_id);
		int a=Integer.parseInt(pet_number)-Integer.parseInt(goods_number);
		pet_number=String.valueOf(a);
		map.put("pet_number", pet_number);
		service.update_pet_pet_number(map);
		ModelAndView model = new ModelAndView();	
		model.setViewName("redirect:new_order");
		return model;		
	}
	
	/*查询满足条件的订单*/
	@RequestMapping(value = "select_the_order")
	@ResponseBody
	public ModelAndView select_the_order(Orders orders) {		
		List<Orders> list=service.select_the_order(orders);
		ModelAndView model = new ModelAndView();	
		model.addObject("theOrder", list);
		model.setViewName("select_order");
		return model;		
	}
}
