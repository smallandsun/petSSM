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

import cn.fserve.model.LifeTool;
import cn.fserve.model.LifeToolShopping;
import cn.fserve.model.Pet;
import cn.fserve.model.PetEncyclopedias;
import cn.fserve.model.PetShopping;
import cn.fserve.model.VagrancyAdopt;
import cn.fserve.service.impl.ClientIndexServiceImpl;
import cn.fserve.util.AutoIdBySys;
import cn.fserve.util.GetSession;

@Controller
public class ClientIndexController {

	private static final String CONTENT_TYPE = "text/xml; charset=UTF-8";
	private final static Logger logger = LoggerFactory.getLogger(ClientIndexController.class);


	@Resource
	private ClientIndexServiceImpl service;
	
	/*客户端主页顶端链接*/
	@RequestMapping(value = "client_usertop")
	public String client_usertop() {
		return "client_usertop";
	}
	
    /*跳转至主页，查询出部分宠物及商品*/
	@RequestMapping(value = "client_index")
	public ModelAndView client_index() {
		
		List<Pet> pet_list=service.client_select_pet();
		List<LifeTool> life_tool_list=service.client_select_life_tool();
		
		ModelAndView model = new ModelAndView();
		model.addObject("client_pet", pet_list);
		model.addObject("client_lifeTool", life_tool_list);
		model.setViewName("client_index");
		return model;
	}
	
	/*跳转至购物车页，查询购物车宠物*/
	@RequestMapping(value = "client_select_shopping_pet")
	public ModelAndView client_select_shopping_pet() {
		
		String goods_id="1";
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("goods_id", goods_id);
		
		List<PetShopping> list=service.client_select_shopping_pet(map);
		
		ModelAndView model = new ModelAndView();
		model.addObject("client_pet_all", list);
		model.setViewName("client_shopping_car_pet");
		return model;
	}
	
	/*跳转至购物车页，查询购物车商品*/
	@RequestMapping(value = "client_select_shopping_life_tool")
	public ModelAndView client_select_shopping_life_tool() {
		
		String goods_id="2";
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("goods_id", goods_id);
		
		List<LifeToolShopping> list=service.client_select_shopping_life_tool(map);
		
		ModelAndView model = new ModelAndView();
		model.addObject("client_life_tool_all", list);
		model.setViewName("client_shopping_car_life_tool");
		return model;
	}
	
	/*跳转至宠物窝页，查询所有宠物信息*/
	@RequestMapping(value = "client_select_all_pet")
	public ModelAndView client_select_all_pet() {
		
		List<Pet> list=service.client_select_all_pet();
		
		ModelAndView model = new ModelAndView();
		model.addObject("client_all_pet", list);
		model.setViewName("client_pet");
		return model;
	}
	
	/*跳转至用品屋页，查询所有用品信息*/
	@RequestMapping(value = "client_select_all_life_tool")
	public ModelAndView client_select_all_life_tool() {
		
		List<LifeTool> list=service.client_select_all_life_tool();
		
		ModelAndView model = new ModelAndView();
		model.addObject("client_all_life_tool", list);
		model.setViewName("client_life_tool");
		return model;
	}
	
	/*跳转至百科城页*/
	@RequestMapping(value = "client_encyclopedias")
	public String client_encyclopedias() {
		return "client_encyclopedias";
	}
	
	/*查询某一宠物的百科*/
	@RequestMapping(value = "client_select_the_encyclopedias")
	@ResponseBody
	public ModelAndView client_select_the_encyclopedias(
			@RequestParam("pet_type") String pet_type){
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("pet_type", pet_type);
		
		List<PetEncyclopedias> list=service.client_select_the_encyclopedias(map);
		
		ModelAndView model = new ModelAndView();
		model.addObject("client_the_pet_encyclopedias", list);
		model.setViewName("client_encyclopedias");
		return model;
	}
	
	/*跳转至领养地页，查询所有未被领养的流浪宠*/
	@RequestMapping(value = "client_select_vagrancy_acquiring")
	@ResponseBody
	public ModelAndView client_select_vagrancy_acquiring(){
		
		String vagrancy_acquiring="未被领养";
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("vagrancy_acquiring", vagrancy_acquiring);
		
		List<VagrancyAdopt> list=service.client_select_vagrancy_acquiring(map);
		
		ModelAndView model = new ModelAndView();
		model.addObject("client_vagrancy", list);
		model.setViewName("client_vagrancy");
		return model;
	}
	
	/*用户申请流浪宠*/
	@RequestMapping(value = "client_vagrancy_apply")
	@ResponseBody
	public void client_vagrancy_apply(
			@RequestParam("id") int id,
			@RequestParam("adopter_id") String adopter_id,
			HttpServletResponse response) throws IOException {
		
		response.setContentType(CONTENT_TYPE);
		
		String vagrancy_acquiring="已被领养";
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("adopter_id", adopter_id);
		map.put("vagrancy_acquiring", vagrancy_acquiring);
		
		service.client_update_vagrancy_acquiring(map);
		
		PrintWriter out = response.getWriter();
		out.print("yes");
		out.flush();
		out.close();
	}
	
	/*搜索全部宠物犬*/
	@RequestMapping(value = "client_select_all_dog")
	@ResponseBody
	public ModelAndView client_select_all_dog(
			@RequestParam("a") int a){
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		String pet_category="";
		if(a==1){
			 pet_category="犬类";
			
		}else if(a==2){
			 pet_category="猫类";
		}else{
			 pet_category="鱼类";
		}
		map.put("pet_category", pet_category);
		List<Pet> list=service.client_select_all_dog(map);
		
		ModelAndView model = new ModelAndView();
		model.addObject("client_all_pet", list);
		model.setViewName("client_pet");
		return model;
	}
	
}
