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

import cn.fserve.model.Pet;
import cn.fserve.model.VagrancyAdopt;
import cn.fserve.service.impl.BackstageVagrancyServiceImpl;
import cn.fserve.util.AutoIdBySys;
import cn.fserve.util.GetSession;

@Controller
public class BackstageVagrancyController {

	@Resource
	private BackstageVagrancyServiceImpl service;

	private static final String CONTENT_TYPE = "text/xml; charset=UTF-8";
	private final static Logger logger = LoggerFactory.getLogger(BackstageVagrancyController.class);

	
	
	/*添加流浪宠*/
	@RequestMapping(value = "add_the_vagrancy")
	@ResponseBody
	public ModelAndView add_the_vagrancy(
			@RequestParam("vagrancy_type") String vagrancy_type,
			@RequestParam("vagrancy_acquiring") String vagrancy_acquiring,
			@RequestParam("vagrancy_desc") String vagrancy_desc) {
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("vagrancy_type", vagrancy_type);
		map.put("vagrancy_acquiring", vagrancy_acquiring);
		map.put("vagrancy_desc", vagrancy_desc);
		service.add_the_vagrancy(map);
		ModelAndView model = new ModelAndView();
		model.setViewName("redirect:select_vagrancy");
		return model;
	}
	
	/*查询满足条件的流浪宠*/
	@RequestMapping(value = "select_the_vagrancy")
	@ResponseBody
	public ModelAndView select_the_vagrancy(
			@RequestParam("vagrancy_acquiring") String vagrancy_acquiring) {	
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("vagrancy_acquiring", vagrancy_acquiring);
		ModelAndView model = new ModelAndView();
		if(vagrancy_acquiring.equals("已被领养") || vagrancy_acquiring.equals("")){
		    List<VagrancyAdopt> list=service.select_the_vagrancy_one(map);
		    model.addObject("vagrancy", list);
		}else if(vagrancy_acquiring.equals("未被领养")){
			List<VagrancyAdopt> list=service.select_the_vagrancy_two(map);
		    model.addObject("vagrancy", list);
		}
		
		model.setViewName("select_vagrancy");
		return model;		
	}
	
	/*据id查询流浪宠，并跳转到流浪宠介绍页*/
	@RequestMapping(value = "the_vagrancy")
	@ResponseBody
	public ModelAndView the_vagrancy(
			@RequestParam("id") int id,
			@RequestParam("vagrancy_acquiring") String vagrancy_acquiring) {	
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		GetSession getSession = new GetSession();
		HttpSession session = getSession.getSession();
		if(vagrancy_acquiring.equals("已被领养")){
			VagrancyAdopt theVagrancy=service.the_vagrancy_one(map);
			session.setAttribute("theVagrancy", theVagrancy);
		}else if(vagrancy_acquiring.equals("未被领养")){
			VagrancyAdopt theVagrancy=service.the_vagrancy_two(map);
			session.setAttribute("theVagrancy", theVagrancy);
		}
		ModelAndView model = new ModelAndView();	
		model.setViewName("the_vagrancy");
		return model;		
	}
	
	/*删除某一流浪宠*/
	@RequestMapping(value = "delect_the_vagrancy")
	@ResponseBody
	public ModelAndView delect_the_vagrancy(
			@RequestParam("id") int id){
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		service.delect_the_vagrancy(map);
		ModelAndView model = new ModelAndView();	
		model.setViewName("select_vagrancy");
		return model;
		
	}
	
	/*更新流浪宠*/
	@RequestMapping(value = "update_the_vagrancy")
	@ResponseBody
	public ModelAndView update_the_vagrancy(
			@RequestParam("id") int id,
			@RequestParam("vagrancy_type") String vagrancy_type,
			@RequestParam("vagrancy_acquiring") String vagrancy_acquiring,
			@RequestParam("vagrancy_desc") String vagrancy_desc){
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("vagrancy_type", vagrancy_type);
		map.put("vagrancy_acquiring", vagrancy_acquiring);
		map.put("vagrancy_desc", vagrancy_desc);
		service.update_the_vagrancy(map);
		ModelAndView model = new ModelAndView();	
		model.setViewName("select_vagrancy");
		return model;
		
	}
}
