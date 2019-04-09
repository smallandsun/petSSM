package cn.fserve.controller;

import java.io.File;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

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

import cn.fserve.util.AutoIdBySys;

@Controller
public class BackstageIndexController {

	private final static Logger logger = LoggerFactory.getLogger(BackstageIndexController.class);	


	/*跳至主页*/
	@RequestMapping(value = "backstage_index")
	public String backstage_index() {
		return "backstage_index";
	}
	
	/*跳至宠物查询页*/
	@RequestMapping(value = "select_pet")
	public String select_pet() {
		return "select_pet";
	}
	
	/*跳至宠物添加页*/
	@RequestMapping(value = "add_pet")
	public String add_pet() {
		return "add_pet";
	}
	
	/*跳至宠物物品查询页*/
	@RequestMapping(value = "select_pet_life_tool")
	public String select_pet_life_tool() {
		return "select_pet_life_tool";
	}
	
	/*跳至用品添加页*/
	@RequestMapping(value = "add_life_tool")
	public String add_life_tool() {
		return "add_life_tool";
	}
	
	/*跳至宠物百科添加页*/
	@RequestMapping(value = "add_pet_encyclopedias")
	public String add_pet_encyclopedias() {
		return "add_pet_encyclopedias";
	}

	/*跳至宠物百科搜索页*/
	@RequestMapping(value = "select_pet_encyclopedias")
	public String select_pet_encyclopedias() {
		return "select_pet_encyclopedias";
	}
	
	/*跳至订单搜索页*/
	@RequestMapping(value = "select_order")
	public String select_order() {
		return "select_order";
	}
	
	/*跳至流浪宠添加页*/
	@RequestMapping(value = "add_vagrancy")
	public String add_vagrancy() {
		return "add_vagrancy";
	}
	
	/*跳至流浪宠搜索页*/
	@RequestMapping(value = "select_vagrancy")
	public String select_vagrancy() {
		return "select_vagrancy";
	}
	
}
