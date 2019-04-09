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

import cn.fserve.dao.BackstageSelectPetLifeToolDao;
import cn.fserve.model.LifeTool;
import cn.fserve.service.BackstageSelectPetLifeToolService;

@Service
public class BackstageSelectPetLifeToolServiceImpl implements BackstageSelectPetLifeToolService {

	@Resource
	private BackstageSelectPetLifeToolDao dao;

	@Override
	public List<LifeTool> select_pet_life_tool_type(String tool_category) {
		// TODO Auto-generated method stub
		return dao.select_pet_life_tool_type(tool_category);
	}

	@Override
	public List<LifeTool> select_pet_life_tool_name(String tool_type) {
		// TODO Auto-generated method stub
		return dao.select_pet_life_tool_name(tool_type);
	}

	@Override
	public List<LifeTool> select_the_pet_life_tool(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.select_the_pet_life_tool(map);
	}

	@Override
	public LifeTool the_life_tool(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.the_life_tool(map);
	}

	@Override
	public void delete_the_life_tool(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		dao.delete_the_life_tool(map);
	}

	@Override
	public void update_the_life_tool(CommonsMultipartFile file, String realUploadPath, String UploadPath,
			String newrealpath, String tool_category, String tool_type, String tool_name, String tool_price,
			String tool_number, String fit_type, String tool_size, String tool_weight, String tool_desc, int id,
			String tool_img_path) {
		// TODO Auto-generated method stub

		// 删除tomcat下id对应的图片
		File lifeToolImgFile = new File(newrealpath + tool_img_path);
		if (lifeToolImgFile.exists()) {
			lifeToolImgFile.delete();
		}

		InputStream is = null;
		OutputStream os = null;

		// 用品图片上传时间
		Date date = new Date();
		SimpleDateFormat tim = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		String lifeToolImgFileTime = tim.format(date);

		try {
			// 用品图片名称
			String LifeToolImgFileName = file.getOriginalFilename();
			// 用品图片上传路径
			String newLifeToolImgFilePath = UploadPath + "/" + lifeToolImgFileTime + LifeToolImgFileName;

			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("tool_category", tool_category);
			map.put("tool_type", tool_type);
			map.put("tool_name", tool_name);
			map.put("tool_price", tool_price);
			map.put("tool_number", tool_number);
			map.put("fit_type", fit_type);
			map.put("tool_size", tool_size);
			map.put("tool_weight", tool_weight);
			map.put("tool_desc", tool_desc);
			map.put("tool_img_path", newLifeToolImgFilePath);
			map.put("id", id);

			dao.update_the_life_tool(map);
			
			String LifeToolImgFilePath = realUploadPath + "/" + lifeToolImgFileTime + LifeToolImgFileName;

			// 图片通过输入输出流进行上传
			is = file.getInputStream();
			os = new FileOutputStream(LifeToolImgFilePath);

			byte[] buffer = new byte[1024];
			int len = 0;

			while ((len = is.read(buffer)) > 0) {
				os.write(buffer);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}

			if (os != null) {
				try {
					os.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
	}

}
