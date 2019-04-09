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

import cn.fserve.dao.BackstageShoppingDao;
import cn.fserve.dao.BackstageVagrancyDao;
import cn.fserve.model.LifeToolShopping;
import cn.fserve.model.PetShopping;
import cn.fserve.model.VagrancyAdopt;
import cn.fserve.service.BackstageShoppingService;
import cn.fserve.service.BackstageVagrancyService;


@Service
public class BackstageShoppingServiceImpl implements BackstageShoppingService {

	@Resource
	private BackstageShoppingDao dao;

	@Override
	public List<PetShopping> pet_shopping(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.pet_shopping(map);
	}

	@Override
	public List<LifeToolShopping> life_tool_shopping(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.life_tool_shopping(map);
	}
	
}
