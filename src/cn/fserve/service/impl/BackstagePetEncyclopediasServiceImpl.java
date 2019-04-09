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

import cn.fserve.dao.BackstagePetEncyclopediasDao;
import cn.fserve.model.PetEncyclopedias;
import cn.fserve.service.BackstagePetEncyclopediasService;

@Service
public class BackstagePetEncyclopediasServiceImpl implements BackstagePetEncyclopediasService {

	@Resource
	private BackstagePetEncyclopediasDao dao;

	@Override
	public void add_the_pet_encyclopedias(CommonsMultipartFile file, String realUploadPath, String UploadPath,
			String newrealpath, String pet_category, String pet_type, String pet_desc, String pet_feed_mode,
			String pet_mpg_ch, String pet_life_habits, String pet_matters_attention) {
		// TODO Auto-generated method stub

		InputStream is = null;
		OutputStream os = null;

		// 宠物图片上传时间
		Date date = new Date();
		SimpleDateFormat tim = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		String ImgFileTime = tim.format(date);

		try {
			// 宠物图片名称
			String ImgFileName = file.getOriginalFilename();
			// 宠物图片上传路径
			String newimgFilePath = UploadPath + "/" + ImgFileTime + ImgFileName;

			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("pet_category", pet_category);
			map.put("pet_type", pet_type);
			map.put("pet_desc", pet_desc);
			map.put("pet_feed_mode", pet_feed_mode);
			map.put("pet_mpg_ch", pet_mpg_ch);
			map.put("pet_life_habits", pet_life_habits);
			map.put("pet_matters_attention", pet_matters_attention);
			map.put("img_path", newimgFilePath);

			dao.add_the_pet_encyclopedias(map);

			String ImgFilePath = realUploadPath + "/" + ImgFileTime + ImgFileName;
			// 图片通过输入输出流进行上传
			is = file.getInputStream();
			os = new FileOutputStream(ImgFilePath);

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

	@Override
	public List<PetEncyclopedias> select_pet_type_encyclopedias(String pet_category) {
		// TODO Auto-generated method stub
		return dao.select_pet_type_encyclopedias(pet_category);
	}

	@Override
	public PetEncyclopedias select_the_pet_encyclopedias(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.select_the_pet_encyclopedias(map);
	}

	@Override
	public void delect_pet_encyclopedias(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		dao.delect_pet_encyclopedias(map);
	}

	@Override
	public PetEncyclopedias select_the_pet_encyclopedias_by_id(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.select_the_pet_encyclopedias_by_id(map);
	}

	@Override
	public void update_the_pet_encyclopedias(CommonsMultipartFile file, String realUploadPath, String UploadPath,
			String newrealpath, String pet_category, String pet_type, String pet_desc, String pet_feed_mode,
			String pet_mpg_ch, String pet_life_habits, String pet_matters_attention, int id, String img_path) {
		// TODO Auto-generated method stub

		// 删除tomcat下id对应的图片
		File ImgFile = new File(newrealpath + img_path);
		if (ImgFile.exists()) {
			ImgFile.delete();
		}

		InputStream is = null;
		OutputStream os = null;

		// 图片上传时间
		Date date = new Date();
		SimpleDateFormat tim = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		String ImgFileTime = tim.format(date);

		try {
			// 图片名称
			String ImgFileName = file.getOriginalFilename();
			// 图片上传路径
			String newImgFilePath = UploadPath + "/" + ImgFileTime + ImgFileName;

			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("pet_category", pet_category);
			map.put("pet_type", pet_type);
			map.put("pet_desc", pet_desc);
			map.put("pet_feed_mode", pet_feed_mode);
			map.put("pet_mpg_ch", pet_mpg_ch);
			map.put("pet_life_habits", pet_life_habits);
			map.put("pet_matters_attention", pet_matters_attention);
			map.put("img_path", newImgFilePath);
			map.put("id", id);

			dao.update_the_pet_encyclopedias(map);

			String LifeToolImgFilePath = realUploadPath + "/" + ImgFileTime + ImgFileName;

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
