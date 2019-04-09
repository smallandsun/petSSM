package cn.fserve.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import cn.fserve.model.AdminUser;

@Repository
public interface AdminUserDao {
	
	AdminUser backstageLoginPost(HashMap<String, Object> map);//后台登陆
	
	AdminUser show_admin_info(HashMap<String, Object> map);//管理员信息
	
	public void update_admin_head_img(HashMap<String, Object> map);//更新管理员头像

	public void updateAdminUserPassword(HashMap<String, Object> map);//修改管理员密码

}
