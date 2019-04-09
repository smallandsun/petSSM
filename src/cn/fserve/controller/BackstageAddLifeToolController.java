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

import cn.fserve.service.impl.BackstageAddLifeToolServiceImpl;
import cn.fserve.util.AutoIdBySys;
import cn.fserve.util.GetSession;

@Controller
public class BackstageAddLifeToolController {

	@Resource
	private BackstageAddLifeToolServiceImpl service;

	private static final String CONTENT_TYPE = "text/xml; charset=UTF-8";
	private final static Logger logger = LoggerFactory.getLogger(BackstageAddLifeToolController.class);

	/*添加用品*/
	@RequestMapping(value = "add_the_life_tool")
	@ResponseBody
	public ModelAndView add_the_life_tool(
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
			@RequestParam("admin_user_id") String admin_user_id,
			HttpServletRequest request) {
		
		String UploadPath = "upload";
		String realUploadPath = request.getServletContext().getRealPath(UploadPath);
		String newrealpath=request.getServletContext().getRealPath("/");
		
        service.add_the_life_tool(file, realUploadPath, UploadPath, newrealpath, tool_category, tool_type, tool_name, tool_price, tool_number, fit_type, tool_size, tool_weight, tool_desc, admin_user_id);
        
		ModelAndView model = new ModelAndView();
		model.setViewName("redirect:add_life_tool");
		return model;
		
	}
	
}
