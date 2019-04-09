package cn.fserve.service.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import cn.fserve.dao.ClientUserDao;
import cn.fserve.model.Users;
import cn.fserve.service.ClientUserService;

@Service
public class ClientUserServiceImpl implements ClientUserService {

	@Resource
	private ClientUserDao dao;

	@Override
	public void client_user_register(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		dao.client_user_register(map);
	}

	@Override
	public Users client_validate_email(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.client_validate_email(map);
	}

	@Override
	public Users client_user_login(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.client_user_login(map);
	}
}
