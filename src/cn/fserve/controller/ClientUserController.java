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

import cn.fserve.model.AdminUser;
import cn.fserve.model.Users;
import cn.fserve.service.impl.ClientUserServiceImpl;
import cn.fserve.util.AutoIdBySys;
import cn.fserve.util.GetSession;

@Controller
public class ClientUserController {

	private static final String CONTENT_TYPE = "text/xml; charset=UTF-8";
	private final static Logger logger = LoggerFactory.getLogger(ClientUserController.class);

	@Resource
	private ClientUserServiceImpl service;
	
	
    /*跳转至登陆页*/
	@RequestMapping(value = "client_login")
	public String client_login() {
		return "client_login";
	}
	
	/*跳转至注册页*/
	@RequestMapping(value = "client_register")
	public String client_register() {
		return "client_register";
	}
	
	/*注册邮箱验证*/
	@RequestMapping(value = "client_validate_email")
	public void validate_email(
			@RequestParam("user_email") String user_email, 
			HttpServletResponse response) throws IOException {

		response.setContentType(CONTENT_TYPE);

		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("user_email", user_email);
		
		Users users=service.client_validate_email(map);
		
		GetSession getSession = new GetSession();
		HttpSession session = getSession.getSession();
		PrintWriter out = response.getWriter();
		if(users !=null && !"".equals(users)){
			out.print("no");
			out.flush();
			out.close();
		}else {
			out.print("yes");
			out.flush();
			out.close();
		}	
	}
	
	/*用户注册*/
	@RequestMapping(value = "client_user_register")
	@ResponseBody
	public ModelAndView client_user_register(
			@RequestParam("user_email") String user_email,
			@RequestParam("user_name") String user_name,
			@RequestParam("user_password") String user_password) {
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("user_email", user_email);
		map.put("user_name", user_name);
		map.put("user_password", user_password);
		
		service.client_user_register(map);
		
		ModelAndView model = new ModelAndView();
		model.setViewName("redirect:client_login");
		return model;
	}
	
	/*用户登陆*/
	@RequestMapping(value = "client_user_login")
	@ResponseBody
	public void client_user_login(
			@RequestParam("user_email") String user_email,
			@RequestParam("user_password") String user_password,
			HttpServletResponse response) throws IOException{
		
		response.setContentType(CONTENT_TYPE);
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("user_email", user_email);
		map.put("user_password", user_password);
		
		Users users=service.client_user_login(map);
		
		GetSession getSession = new GetSession();
		HttpSession session = getSession.getSession();
		PrintWriter out = response.getWriter();
		if(users != null && !"".equals(users) && users.getUser_password().equals(user_password)){
			session.setAttribute("users", users);
			out.print("yes");
			out.flush();
			out.close();
		}else {
			out.print("no");
			out.flush();
			out.close();
		}
	}
	
}
