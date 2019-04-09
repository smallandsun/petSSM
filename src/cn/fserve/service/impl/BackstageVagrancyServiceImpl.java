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

import cn.fserve.dao.BackstageVagrancyDao;
import cn.fserve.model.VagrancyAdopt;
import cn.fserve.service.BackstageVagrancyService;


@Service
public class BackstageVagrancyServiceImpl implements BackstageVagrancyService {

	@Resource
	private BackstageVagrancyDao dao;
	
	@Override
	public void add_the_vagrancy(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		dao.add_the_vagrancy(map);
		
	}

	@Override
	public List<VagrancyAdopt> select_the_vagrancy_one(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.select_the_vagrancy_one(map);
	}

	@Override
	public List<VagrancyAdopt> select_the_vagrancy_two(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.select_the_vagrancy_two(map);
	}
	
	@Override
	public VagrancyAdopt the_vagrancy_one(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.the_vagrancy_one(map);
	}
	
	@Override
	public VagrancyAdopt the_vagrancy_two(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.the_vagrancy_two(map);
	}

	@Override
	public void delect_the_vagrancy(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		dao.delect_the_vagrancy(map);
	}

	@Override
	public void update_the_vagrancy(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		dao.update_the_vagrancy(map);
	}
}
