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

import cn.fserve.service.impl.BackstageAddPetServiceImpl;
import cn.fserve.util.AutoIdBySys;
import cn.fserve.util.GetSession;

@Controller
public class BackstageAddPetController {

	@Resource
	private BackstageAddPetServiceImpl service;

	private static final String CONTENT_TYPE = "text/xml; charset=UTF-8";
	private final static Logger logger = LoggerFactory.getLogger(BackstageAddPetController.class);

	/*添加宠物*/
	@RequestMapping(value = "add_the_pet")
	@ResponseBody
	public ModelAndView add_the_pet(
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
			@RequestParam("admin_user_id") String admin_user_id,
			HttpServletRequest request) {
		String UploadPath = "upload";
		String realUploadPath = request.getServletContext().getRealPath(UploadPath);
		String newrealpath=request.getServletContext().getRealPath("/");
		
		service.add_the_pet(file, realUploadPath, UploadPath, newrealpath, pet_category, pet_type, pet_name, pet_price, pet_number, pet_age, pet_shape, pet_food, pet_purpose, pet_weight, pet_sex, pet_marriage, pet_certificate, pet_desc, admin_user_id);
		
		ModelAndView model = new ModelAndView();
		model.setViewName("redirect:add_pet");
		return model;
		
	}
	
}
