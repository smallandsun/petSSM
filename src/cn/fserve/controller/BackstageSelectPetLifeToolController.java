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
import cn.fserve.service.impl.BackstageSelectPetLifeToolServiceImpl;
import cn.fserve.util.AutoIdBySys;
import cn.fserve.util.GetSession;

@Controller
public class BackstageSelectPetLifeToolController {

	@Resource
	private BackstageSelectPetLifeToolServiceImpl service;

	private static final String CONTENT_TYPE = "text/xml; charset=UTF-8";
	private final static Logger logger = LoggerFactory.getLogger(BackstageSelectPetLifeToolController.class);

	/*据用品类别查询用品类型*/
	@RequestMapping(value = "select_pet_life_tool_type", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public List<LifeTool> select_pet_life_tool_type(@RequestParam("tool_category") String tool_category) {
		
		List<LifeTool> list=service.select_pet_life_tool_type(tool_category);
		return list;

	}
	
	/*据用品类型查询用品名称*/
	@RequestMapping(value = "select_pet_life_tool_name", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public List<LifeTool> select_pet_life_tool_name(@RequestParam("tool_type") String tool_type) {
		System.out.println(tool_type);
		List<LifeTool> list=service.select_pet_life_tool_name(tool_type);
		return list;

	}
	
	/*查询满足条件的用品*/
	@RequestMapping(value = "select_the_pet_life_tool")
	@ResponseBody
	public ModelAndView select_the_pet_life_tool(
			@RequestParam("tool_category") String tool_category,
			@RequestParam("tool_type") String tool_type,
			@RequestParam("tool_name") String tool_name,
			@RequestParam("tool_price") String tool_price) {
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(tool_price=="500"){
			String tool_price_x="99999999";
			map.put("tool_category", tool_category);
			map.put("tool_type", tool_type);
			map.put("tool_name", tool_name);
			map.put("tool_price", tool_price);
			map.put("tool_price_x", tool_price_x);
			
		}else if(tool_price==null || tool_price.equals("")){
			String tool_price_x="";
			map.put("tool_category", tool_category);
			map.put("tool_type", tool_type);
			map.put("tool_name", tool_name);
			map.put("tool_price", tool_price);
			map.put("tool_price_x", tool_price_x);
			
		}else{
			int a=Integer.parseInt(tool_price);
			int b=a+100;
			String tool_price_x=String.valueOf(b);
			map.put("tool_category", tool_category);
			map.put("tool_type", tool_type);
			map.put("tool_name", tool_name);
			map.put("tool_price", tool_price);
			map.put("tool_price_x", tool_price_x);
		}
		List<LifeTool> list=service.select_the_pet_life_tool(map);
		ModelAndView model = new ModelAndView();	
		model.addObject("lifeTool", list);
		model.setViewName("select_pet_life_tool");
		return model;		
	}
	
	/*据id查询某用品*/
	@RequestMapping(value = "the_life_tool")
	@ResponseBody
	public ModelAndView the_life_tool(
			@RequestParam("id") int id){
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		GetSession getSession = new GetSession();
		HttpSession session = getSession.getSession();
		LifeTool theLifeTool=service.the_life_tool(map);
		session.setAttribute("theLifeTool", theLifeTool);
		ModelAndView model = new ModelAndView();	
		model.setViewName("the_life_tool");
		return model;
	}
	
	/*删除某一用品*/
	@RequestMapping(value = "delete_the_life_tool")
	@ResponseBody
	public ModelAndView delete_the_life_tool(
			@RequestParam("id") int id){
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		service.delete_the_life_tool(map);
		ModelAndView model = new ModelAndView();	
		model.setViewName("select_pet_life_tool");
		return model;
	}
	
	/*跳至用品更新页并查询此用品的信息*/
	@RequestMapping(value = "update_life_tool")
	@ResponseBody
	public ModelAndView update_life_tool(
			@RequestParam("id") int id){
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		GetSession getSession = new GetSession();
		HttpSession session = getSession.getSession();
		LifeTool the_life_tool=service.the_life_tool(map);
		session.setAttribute("the_life_tool", the_life_tool);
		ModelAndView model = new ModelAndView();	
		model.setViewName("update_life_tool");
		return model;
	}
	
	/*更新用品信息*/
	@RequestMapping(value = "update_the_life_tool")
	@ResponseBody
	public ModelAndView update_the_life_tool(
			@RequestParam("file") CommonsMultipartFile file,
			@RequestParam("tool_category") String tool_category,
			@RequestParam("tool_type") String tool_type,
			@RequestParam("tool_name") String tool_name,
			@RequestParam("tool_price") String tool_price,
			@RequestParam("tool_number") String tool_number,
			@RequestParam("fit_type") String fit_type,
			@RequestParam("tool_size") String tool_size,
			@RequestParam("tool_weight") String tool_weight,
			@RequestParam("tool_desc") String tool_desc,
			@RequestParam("id") int id,
			@RequestParam("tool_img_path") String tool_img_path,
			HttpServletRequest request) {
		
		String UploadPath = "upload";
		String realUploadPath = request.getServletContext().getRealPath(UploadPath);
		String newrealpath=request.getServletContext().getRealPath("/");
		
		service.update_the_life_tool(file, realUploadPath, UploadPath, newrealpath, tool_category, tool_type, tool_name, tool_price, tool_number, fit_type, tool_size, tool_weight, tool_desc, id, tool_img_path);
		
		ModelAndView model = new ModelAndView();
		model.setViewName("select_pet_life_tool");
		return model;
	}
}
