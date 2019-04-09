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
import cn.fserve.service.impl.AdminUserServiceImpl;
import cn.fserve.util.AutoIdBySys;
import cn.fserve.util.GetSession;

@Controller
public class AdminUserController {

	private static final String CONTENT_TYPE = "text/xml; charset=UTF-8";
	private final static Logger logger = LoggerFactory.getLogger(AdminUserController.class);

	@Resource
	private AdminUserServiceImpl service;
	
    /*跳转至后台登陆页*/
	@RequestMapping(value = "backstage_login")
	public String backstage_login() {
		return "backstage_login";
	}
	
	/*后台登陆*/
	@RequestMapping(value = "backstageLoginPost")
	public void backstageLoginPost(
			@RequestParam("ad_username") String ad_username, 
			@RequestParam("ad_password") String ad_password,
			HttpServletResponse response) throws IOException {

		response.setContentType(CONTENT_TYPE);

		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("ad_username", ad_username);
		map.put("ad_password", ad_password);
		GetSession getSession = new GetSession();
		HttpSession session = getSession.getSession();
		AdminUser adminUser=service.backstageLoginPost(map);

		PrintWriter out = response.getWriter();
		if (adminUser != null && !"".equals(adminUser) && adminUser.getAd_password().equals(ad_password)) {
			session.setAttribute("adminUser", adminUser);
			out.print("yes");
			out.flush();
			out.close();

		}else {
			out.print("error");
			out.flush();
			out.close();
		}		
	}
	
	/*管理员信息查询*/
	@RequestMapping(value = "show_admin_info")
	public String show_admin_info(@RequestParam("id") int id) {
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		GetSession getSession = new GetSession();
		HttpSession session = getSession.getSession();	
		AdminUser ad_user=service.show_admin_info(map);
		session.setAttribute("ad_user", ad_user);
		return "admin_info";
		
	}
	
	/*更新管理员头像*/
	@RequestMapping(value = "update_admin_head_img")
	@ResponseBody
	public ModelAndView update_admin_head_img(
			@RequestParam("id") int id,
			@RequestParam("head_img_path") String head_img_path,
			@RequestParam("file") CommonsMultipartFile file,
			HttpServletRequest request,
			RedirectAttributes attr) {
		
		String UploadPath = "upload";
		String realUploadPath = request.getServletContext().getRealPath(UploadPath);
		String newrealpath=request.getServletContext().getRealPath("/");
		
		service.update_admin_head_img(file, realUploadPath, UploadPath, newrealpath, id, head_img_path);
		
		attr.addAttribute("id", id);
		ModelAndView model = new ModelAndView();
		model.setViewName("redirect:too_show_admin_info");
		return model;
		
	}
	@RequestMapping(value = "too_show_admin_info")
	public String too_show_admin_info(HttpServletRequest request) {
		String id= request.getParameter("id");
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		GetSession getSession = new GetSession();
		HttpSession session = getSession.getSession();	
		AdminUser ad_user=service.show_admin_info(map);
		session.setAttribute("ad_user", ad_user);
		return "admin_info";
		
	}
	
	
	/*跳至修改管理员密码*/
	@RequestMapping(value = "update_admin_pwd")
	public String update_admin_pwd() {
		return "updateAdminUserPassword";
		
	}
	
	/*验证旧密码*/
	@RequestMapping(value = "oldPassword")
	public void oldPassword(
			@RequestParam("id") String id,
			@RequestParam("ad_password") String ad_password,
			HttpServletResponse response) throws IOException {
		
		response.setContentType(CONTENT_TYPE); // 设置服务器响应类型
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		AdminUser ad_user=service.show_admin_info(map);
		String password=ad_user.getAd_password();
		if(!ad_password.equals(password)){
			PrintWriter out = response.getWriter();
			out.print("no");
			out.flush();
			out.close();
		}
		
	}
	
	
	/*验证新密码是否跟旧密码相同*/
	@RequestMapping(value = "newPassword")
	public void newPassword(
			@RequestParam("id") String id,
			@RequestParam("ad_password") String ad_password,
			HttpServletResponse response) throws IOException {
		
		response.setContentType(CONTENT_TYPE); // 设置服务器响应类型
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		AdminUser ad_user=service.show_admin_info(map);
		String password=ad_user.getAd_password();
		if(ad_password.equals(password)){
			PrintWriter out = response.getWriter();
			out.print("no");
			out.flush();
			out.close();
		}
		
	}
	
	/*修改管理员密码*/
	@RequestMapping(value = "updateAdminUserPassword")
	public void updateAdminUserPassword(
			@RequestParam("id") String id,
			@RequestParam("ad_password") String ad_password,
			HttpServletResponse response) throws IOException {
		
		response.setContentType(CONTENT_TYPE); // 设置服务器响应类型
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("ad_password", ad_password);
		service.updateAdminUserPassword(map);
		PrintWriter out = response.getWriter();
		GetSession getSession = new GetSession();
		HttpSession session = getSession.getSession();
		session.removeAttribute("adminUser");
		out.print("yes");
		out.flush();
		out.close();
		
	}
}
