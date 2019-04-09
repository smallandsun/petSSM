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

import cn.fserve.model.Pet;
import cn.fserve.service.impl.BackstageSelectPetServiceImpl;
import cn.fserve.util.AutoIdBySys;
import cn.fserve.util.GetSession;

@Controller
public class BackstageSelectPetController {

	@Resource
	private BackstageSelectPetServiceImpl service;

	private static final String CONTENT_TYPE = "text/xml; charset=UTF-8";
	private final static Logger logger = LoggerFactory.getLogger(BackstageSelectPetController.class);

	/* 据宠物类别查询宠物类型 */
	@RequestMapping(value = "select_type", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public List<Pet> select_type(@RequestParam("pet_category") String pet_category) {
		
		List<Pet> list=service.select_type(pet_category);
		return list;

	}
	
	/*查询满足条件的宠物*/
	@RequestMapping(value = "select_the_pet")
	@ResponseBody
	public ModelAndView select_the_pet(Pet pet) {		
		List<Pet> list=service.select_the_pet(pet);
		ModelAndView model = new ModelAndView();	
		model.addObject("pet", list);
		model.setViewName("select_pet");
		return model;		
	}
	
	/*据id查询某宠物*/
	@RequestMapping(value = "the_pet")
	@ResponseBody
	public ModelAndView the_pet(
			@RequestParam("id") int id){
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		GetSession getSession = new GetSession();
		HttpSession session = getSession.getSession();	
		Pet thePet=service.the_pet(map);
		session.setAttribute("thePet", thePet);
		ModelAndView model = new ModelAndView();	
		model.setViewName("the_pet");
		return model;
	}
	
	/*删除某一宠物*/
	@RequestMapping(value = "delete_the_pet")
	@ResponseBody
	public ModelAndView delete_the_pet(
			@RequestParam("id") int id){
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		service.delete_the_pet(map);
		ModelAndView model = new ModelAndView();	
		model.setViewName("select_pet");
		return model;
		
	}

	/*跳至宠物更新页并查询此宠物的信息*/
	@RequestMapping(value = "update_pet")
	@ResponseBody
	public ModelAndView update_pet(
			@RequestParam("id") int id){
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		GetSession getSession = new GetSession();
		HttpSession session = getSession.getSession();	
		Pet the_pet=service.the_pet(map);
		session.setAttribute("the_pet", the_pet);
		ModelAndView model = new ModelAndView();	
		model.setViewName("update_pet");
		return model;
		
	}
	
	/*更新宠物信息*/
	@RequestMapping(value = "update_the_pet")
	@ResponseBody
	public ModelAndView update_the_pet(
			@RequestParam("file") CommonsMultipartFile file,
			@RequestParam("pet_category") String pet_category,
			@RequestParam("pet_type") String pet_type,
			@RequestParam("pet_name") String pet_name,
			@RequestParam("pet_price") String pet_price,
			@RequestParam("pet_number") String pet_number,
			@RequestParam("pet_age") String pet_age,
			@RequestParam("pet_shape") String pet_shape,
			@RequestParam("pet_food") String pet_food,
			@RequestParam("pet_purpose") String pet_purpose,
			@RequestParam("pet_weight") String pet_weight,
			@RequestParam("pet_sex") String pet_sex,
			@RequestParam("pet_marriage") String pet_marriage,
			@RequestParam("pet_certificate") String pet_certificate,
			@RequestParam("pet_desc") String pet_desc,
			@RequestParam("pet_img_path") String pet_img_path,
			@RequestParam("id") int id,
			HttpServletRequest request) {
		
		String UploadPath = "upload";
		String realUploadPath = request.getServletContext().getRealPath(UploadPath);
		String newrealpath=request.getServletContext().getRealPath("/");
		
		service.update_the_pet(file, realUploadPath, UploadPath, newrealpath, pet_category, pet_type, pet_name, pet_price, pet_number, pet_age, pet_shape, pet_food, pet_purpose, pet_weight, pet_sex, pet_marriage, pet_certificate, pet_desc,pet_img_path,id);
		
		ModelAndView model = new ModelAndView();
		model.setViewName("select_pet");
		return model;
	}
	
}
