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

import cn.fserve.model.PetEncyclopedias;
import cn.fserve.service.impl.BackstagePetEncyclopediasServiceImpl;
import cn.fserve.util.AutoIdBySys;
import cn.fserve.util.GetSession;

@Controller
public class BackstagePetEncyclopediasController {

	@Resource
	private BackstagePetEncyclopediasServiceImpl service;

	private static final String CONTENT_TYPE = "text/xml; charset=UTF-8";
	private final static Logger logger = LoggerFactory.getLogger(BackstagePetEncyclopediasController.class);

	
	
	/*添加宠物百科*/
	@RequestMapping(value = "add_the_pet_encyclopedias")
	@ResponseBody
	public ModelAndView add_the_pet_encyclopedias(
			@RequestParam("file") CommonsMultipartFile file,
			@RequestParam("pet_category") String pet_category,
			@RequestParam("pet_type") String pet_type,
			@RequestParam("pet_desc") String pet_desc,
			@RequestParam("pet_feed_mode") String pet_feed_mode,
			@RequestParam("pet_mpg_ch") String pet_mpg_ch,
			@RequestParam("pet_life_habits") String pet_life_habits,
			@RequestParam("pet_matters_attention") String pet_matters_attention,
			HttpServletRequest request) {
		
		String UploadPath = "upload";
		String realUploadPath = request.getServletContext().getRealPath(UploadPath);
		String newrealpath=request.getServletContext().getRealPath("/");
		
		service.add_the_pet_encyclopedias(file, realUploadPath, UploadPath, newrealpath, pet_category, pet_type, pet_desc, pet_feed_mode, pet_mpg_ch, pet_life_habits, pet_matters_attention);
		
		ModelAndView model = new ModelAndView();
		model.setViewName("redirect:add_pet_encyclopedias");
		return model;
	}
	
	/* 据宠物类别查询宠物类型 */
	@RequestMapping(value = "select_pet_type_encyclopedias", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public List<PetEncyclopedias> select_pet_type_encyclopedias(@RequestParam("pet_category") String pet_category) {
		
		List<PetEncyclopedias> list=service.select_pet_type_encyclopedias(pet_category);
		return list;

	}
	
	/*查询满足条件的宠物百科*/
	@RequestMapping(value = "select_the_pet_encyclopedias")
	@ResponseBody
	public ModelAndView select_the_pet_encyclopedias(
			@RequestParam("pet_category") String pet_category,
			@RequestParam("pet_type") String pet_type) {	
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("pet_category", pet_category);
		map.put("pet_type", pet_type);
		
		GetSession getSession = new GetSession();
		HttpSession session = getSession.getSession();
		
		PetEncyclopedias petEncyclopedias=service.select_the_pet_encyclopedias(map);
		
		session.setAttribute("petEncyclopedias", petEncyclopedias);
		
		ModelAndView model = new ModelAndView();	
		model.setViewName("the_pet_encyclopedias");
		return model;
	}
	
	/*删除某一宠物百科*/
	@RequestMapping(value = "delect_pet_encyclopedias")
	@ResponseBody
	public ModelAndView delect_pet_encyclopedias(
			@RequestParam("id") int id){
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		service.delect_pet_encyclopedias(map);
		ModelAndView model = new ModelAndView();	
		model.setViewName("select_pet_encyclopedias");
		return model;
	}
	
	/*跳至宠物百科更新页并查询其的信息*/
	@RequestMapping(value = "update_pet_encyclopedias")
	@ResponseBody
	public ModelAndView update_pet_encyclopedias(
			@RequestParam("id") int id){
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		GetSession getSession = new GetSession();
		HttpSession session = getSession.getSession();
		
		PetEncyclopedias thePetEncyclopedias=service.select_the_pet_encyclopedias_by_id(map);
		
		session.setAttribute("thePetEncyclopedias", thePetEncyclopedias);
		ModelAndView model = new ModelAndView();	
		model.setViewName("update_pet_encyclopedias");
		return model;
	}
	
	/*更新宠物百科信息*/
	@RequestMapping(value = "update_the_pet_encyclopedias")
	@ResponseBody
	public ModelAndView update_the_pet_encyclopedias(
			@RequestParam("file") CommonsMultipartFile file,
			@RequestParam("pet_category") String pet_category,
			@RequestParam("pet_type") String pet_type,
			@RequestParam("pet_desc") String pet_desc,
			@RequestParam("pet_feed_mode") String pet_feed_mode,
			@RequestParam("pet_mpg_ch") String pet_mpg_ch,
			@RequestParam("pet_life_habits") String pet_life_habits,
			@RequestParam("pet_matters_attention") String pet_matters_attention,
			@RequestParam("id") int id,
			@RequestParam("img_path") String img_path,
			HttpServletRequest request) {
		
		String UploadPath = "upload";
		String realUploadPath = request.getServletContext().getRealPath(UploadPath);
		String newrealpath=request.getServletContext().getRealPath("/");
		
		service.update_the_pet_encyclopedias(file, realUploadPath, UploadPath, newrealpath, pet_category, pet_type, pet_desc, pet_feed_mode, pet_mpg_ch, pet_life_habits, pet_matters_attention, id, img_path);
		
		ModelAndView model = new ModelAndView();
		model.setViewName("select_pet_encyclopedias");
		return model;
	}
}
