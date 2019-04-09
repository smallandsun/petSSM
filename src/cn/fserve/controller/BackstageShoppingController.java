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
import javax.xml.ws.Service;

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
import cn.fserve.model.Pet;
import cn.fserve.model.PetShopping;
import cn.fserve.model.VagrancyAdopt;
import cn.fserve.service.impl.BackstageShoppingServiceImpl;
import cn.fserve.service.impl.BackstageVagrancyServiceImpl;
import cn.fserve.util.AutoIdBySys;
import cn.fserve.util.GetSession;

@Controller
public class BackstageShoppingController {

	@Resource
	private BackstageShoppingServiceImpl service;

	private static final String CONTENT_TYPE = "text/xml; charset=UTF-8";
	private final static Logger logger = LoggerFactory.getLogger(BackstageShoppingController.class);

	
	/*宠物购物车管理*/
	@RequestMapping(value = "pet_shopping")
	@ResponseBody
	public ModelAndView pet_shopping() {
		
		String goods_id="1";
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("goods_id", goods_id);
		List<PetShopping> list=service.pet_shopping(map);
		ModelAndView model = new ModelAndView();
		model.addObject("petShopping", list);
		model.setViewName("pet_shopping");
		return model;
	}
	
	/*物品购物车管理*/
	@RequestMapping(value = "life_tool_shopping")
	@ResponseBody
	public ModelAndView life_tool_shopping() {
		
		String goods_id="2";
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("goods_id", goods_id);
		List<LifeToolShopping> list=service.life_tool_shopping(map);
		ModelAndView model = new ModelAndView();
		model.addObject("lifeToolShopping", list);
		model.setViewName("life_tool_shopping");
		return model;
	}
	
	
}
