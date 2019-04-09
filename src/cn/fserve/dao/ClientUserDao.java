package cn.fserve.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import cn.fserve.model.Users;

@Repository
public interface ClientUserDao {
	
	public void client_user_register(HashMap<String, Object> map);//用户注册

	public Users client_validate_email(HashMap<String, Object> map);//注册邮箱验证
	
	public Users client_user_login(HashMap<String, Object> map);//用户登陆
}
