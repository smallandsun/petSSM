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

import cn.fserve.dao.ClientIndexDao;
import cn.fserve.model.LifeTool;
import cn.fserve.model.LifeToolShopping;
import cn.fserve.model.Pet;
import cn.fserve.model.PetEncyclopedias;
import cn.fserve.model.PetShopping;
import cn.fserve.model.VagrancyAdopt;
import cn.fserve.service.ClientIndexService;

@Service
public class ClientIndexServiceImpl implements ClientIndexService {

	@Resource
	private ClientIndexDao dao;

	@Override
	public List<Pet> client_select_pet() {
		// TODO Auto-generated method stub
		return dao.client_select_pet();
	}

	@Override
	public List<LifeTool> client_select_life_tool() {
		// TODO Auto-generated method stub
		return dao.client_select_life_tool();
	}

	@Override
	public List<PetShopping> client_select_shopping_pet(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.client_select_shopping_pet(map);
	}

	@Override
	public List<LifeToolShopping> client_select_shopping_life_tool(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.client_select_shopping_life_tool(map);
	}

	@Override
	public List<Pet> client_select_all_pet() {
		// TODO Auto-generated method stub
		return dao.client_select_all_pet();
	}

	@Override
	public List<LifeTool> client_select_all_life_tool() {
		// TODO Auto-generated method stub
		return dao.client_select_all_life_tool();
	}

	@Override
	public List<PetEncyclopedias> client_select_the_encyclopedias(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.client_select_the_encyclopedias(map);
	}

	@Override
	public List<VagrancyAdopt> client_select_vagrancy_acquiring(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.client_select_vagrancy_acquiring(map);
	}

	@Override
	public void client_update_vagrancy_acquiring(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		dao.client_update_vagrancy_acquiring(map);
	}

	@Override
	public List<Pet> client_select_all_dog(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.client_select_all_dog(map);
	}

	
}
