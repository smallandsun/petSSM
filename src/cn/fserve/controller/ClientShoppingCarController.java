package cn.fserve.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
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

import cn.fserve.model.LifeToolShopping;
import cn.fserve.model.OrdersLifeTool;
import cn.fserve.model.OrdersPet;
import cn.fserve.model.PetShopping;
import cn.fserve.service.impl.ClientShoppingCarServiceImpl;
import cn.fserve.util.AutoIdBySys;
import cn.fserve.util.GetSession;

@Controller
public class ClientShoppingCarController {

	private static final String CONTENT_TYPE = "text/xml; charset=UTF-8";
	private final static Logger logger = LoggerFactory.getLogger(ClientShoppingCarController.class);


	@Resource
	private ClientShoppingCarServiceImpl service;
	
	/*据购物车id，删除此条记录(宠物)*/
	@RequestMapping(value = "client_delect_shoppping_car_the_pet")
	@ResponseBody
	public ModelAndView client_delect_shoppping_car_the_pet(
			@RequestParam("shopping_id") int shopping_id){
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("shopping_id", shopping_id);
		
		service.client_delect_shoppping_car_the_pet(map);
		
		ModelAndView model = new ModelAndView();	
		model.setViewName("redirect:client_select_shopping_pet");
		return model;
		
	}
	
	/*据购物车id，删除此条记录(用品)*/
	@RequestMapping(value = "client_delect_shoppping_car_the_life_tool")
	@ResponseBody
	public ModelAndView client_delect_shoppping_car_the_life_tool(
			@RequestParam("shopping_id") int shopping_id){
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("shopping_id", shopping_id);
		
		service.client_delect_shoppping_car_the_life_tool(map);
		
		ModelAndView model = new ModelAndView();	
		model.setViewName("redirect:client_select_shopping_life_tool");
		return model;
		
	}
	
	
	/*据id查询商品详情，并跳至购买页(宠物)*/
	@RequestMapping(value = "client_settlement_pet")
	@ResponseBody
	public ModelAndView client_settlement_pet(
			@RequestParam("goods_id") int id) {
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		
		List<PetShopping> list=service.client_select_the_pet(map);
		
		ModelAndView model = new ModelAndView();
		model.addObject("client_the_pet", list);
		model.setViewName("client_purchase_pet");
		return model;
	}
	
	/*据id查询商品详情，并跳至购买页(用品)*/
	@RequestMapping(value = "client_settlement_life_tool")
	@ResponseBody
	public ModelAndView client_settlement_life_tool(
			@RequestParam("goods_id") int id) {
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		
		List<LifeToolShopping> list=service.client_select_the_life_tool(map);
		
		ModelAndView model = new ModelAndView();
		model.addObject("client_the_life_tool", list);
		model.setViewName("client_purchase_life_tool");
		return model;
	}
	
	/*将购买的宠物相关信息及购买用户的信息插入到订单中*/
	/*@RequestMapping(value = "client_buy_pet")
	@ResponseBody
	public ModelAndView client_buy_pet(
			@RequestParam("goods_id") int goods_id,
			@RequestParam("goods_number") String goods_number,
			@RequestParam("address") String address,
			@RequestParam("phone") String phone,
			@RequestParam("user_id") String user_id) {
		
		String acquiring="未签收";
		String send_goods="未发货";
		Date date = new Date();
		SimpleDateFormat tim = new SimpleDateFormat("yyyyMMddHHmmss");
		String order_number = tim.format(date);
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("goods_id", goods_id);
		map.put("goods_number", goods_number);
		map.put("acquiring", acquiring);
		map.put("send_goods", send_goods);
		map.put("address", address);
		map.put("phone", phone);
		map.put("order_number", order_number);
		map.put("user_id", user_id);
		
		service.client_buy_pet(map);
		
		ModelAndView model = new ModelAndView();
		model.setViewName("redirect:client_orders_pet");
		return model;
	}*/
	
	/*将购买的宠物相关信息及购买用户的信息插入到订单中*/
	@RequestMapping(value = "client_buy_pet")
	@ResponseBody
	public void client_buy_pet(
			@RequestParam("goods_id") String goods_id,
			@RequestParam("goods_number") String goods_number,
			@RequestParam("address") String address,
			@RequestParam("phone") String phone,
			@RequestParam("user_id") String user_id,
			HttpServletResponse response) throws IOException {
		
		response.setContentType(CONTENT_TYPE);

		String acquiring="未签收";
		String send_goods="未发货";
		Date date = new Date();
		SimpleDateFormat tim = new SimpleDateFormat("yyyyMMddHHmmss");
		String order_number = tim.format(date);
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("goods_id", goods_id);
		map.put("goods_number", goods_number);
		map.put("acquiring", acquiring);
		map.put("send_goods", send_goods);
		map.put("address", address);
		map.put("phone", phone);
		map.put("order_number", order_number);
		map.put("user_id", user_id);
		
		service.client_buy_pet(map);
		
		PrintWriter out = response.getWriter();
		out.print("yes");
		out.flush();
		out.close();
	}
	
	/*将购买的用品相关信息及购买用户的信息插入到订单中*/
	@RequestMapping(value = "client_buy_life_tool")
	@ResponseBody
	public void client_buy_life_tool(
			@RequestParam("goods_id") String goods_id,
			@RequestParam("goods_number") String goods_number,
			@RequestParam("address") String address,
			@RequestParam("phone") String phone,
			@RequestParam("user_id") String user_id,
			HttpServletResponse response) throws IOException {
		
		response.setContentType(CONTENT_TYPE);
		
		String acquiring="未签收";
		String send_goods="未发货";
		Date date = new Date();
		SimpleDateFormat tim = new SimpleDateFormat("yyyyMMddHHmmss");
		String order_number = tim.format(date);
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("goods_id", goods_id);
		map.put("goods_number", goods_number);
		map.put("acquiring", acquiring);
		map.put("send_goods", send_goods);
		map.put("address", address);
		map.put("phone", phone);
		map.put("order_number", order_number);
		map.put("user_id", user_id);
		
		service.client_buy_life_tool(map);
		
		PrintWriter out = response.getWriter();
		out.print("yes");
		out.flush();
		out.close();
	}
	
	/*跳至宠物订单页，并查询出未签收的宠物订单*/
	@RequestMapping(value = "client_orders_pet")
	@ResponseBody
	public ModelAndView client_orders_pet() {
		
		String goods_id_="1";
		String acquiring="未签收";
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("goods_id", goods_id_);
		map.put("acquiring", acquiring);
		
		List<OrdersPet> list=service.client_select_orders_pet(map);
		
		ModelAndView model = new ModelAndView();
		model.addObject("client_orders_pet", list);
		model.setViewName("client_orders_pet");
		return model;
	}
	
	/*跳至用品订单页，并查询出未签收的用品订单*/
	@RequestMapping(value = "client_orders_life_tool")
	@ResponseBody
	public ModelAndView client_orders_life_tool() {
		
		String goods_id_="2";
		String acquiring="未签收";
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("goods_id", goods_id_);
		map.put("acquiring", acquiring);
		List<OrdersLifeTool> list=service.client_select_orders_life_tool(map);
		ModelAndView model = new ModelAndView();
		model.addObject("client_orders_life_tool", list);
		model.setViewName("client_orders_life_tool");
		return model;
	}
	
	/*用户签收商品*/
	@RequestMapping(value = "client_orders_acquiring")
	@ResponseBody
	public ModelAndView client_orders_acquiring(
			@RequestParam("id") int id) {
		
		String acquiring="已签收";
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("acquiring", acquiring);
		
		service.client_update_orders_acquiring(map);
		
		ModelAndView model = new ModelAndView();
		int a=100000;
		if(id/a==1){
			model.setViewName("redirect:client_orders_pet");
		}else{
			model.setViewName("redirect:client_orders_life_tool");
		}
		return model;
	}
	
	/**/
	@RequestMapping(value = "client_add_shopping")
	@ResponseBody
	public void client_add_shopping(
			@RequestParam("goods_id") int goods_id,
			@RequestParam("goods_number") String goods_number,
			@RequestParam("user_id") int user_id,
			HttpServletResponse response) throws IOException {
		
		response.setContentType(CONTENT_TYPE);

		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("goods_id", goods_id);
		map.put("goods_number", goods_number);
		map.put("user_id", user_id);
		
		service.client_add_shopping(map);
		
		PrintWriter out = response.getWriter();
		out.print("yes");
		out.flush();
		out.close();
	}
	
}
