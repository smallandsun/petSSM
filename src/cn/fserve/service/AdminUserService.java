package cn.fserve.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import cn.fserve.model.AdminUser;

public interface AdminUserService {
	public AdminUser backstageLoginPost(HashMap<String, Object> map);//后台登陆
	
	public AdminUser show_admin_info(HashMap<String, Object> map);//管理员信息
	
	public void update_admin_head_img(CommonsMultipartFile file, String realUploadPath, 
		String UploadPath,String newrealpath,int id,String head_img_path);//更新管理员头像

	public void updateAdminUserPassword(HashMap<String, Object> map);//修改管理员密码
}
