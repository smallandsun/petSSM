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

import cn.fserve.dao.BackstageSelectPetDao;
import cn.fserve.model.Pet;
import cn.fserve.service.BackstageSelectPetService;

@Service
public class BackstageSelectPetServiceImpl implements BackstageSelectPetService {

	@Resource
	private BackstageSelectPetDao dao;

	/*据宠物类别查询宠物类型*/
	@Override
	public List<Pet> select_type(String pet_category) {
		// TODO Auto-generated method stub
		return dao.select_type(pet_category);
	}

	/*查询满足条件的宠物*/
	@Override
	public List<Pet> select_the_pet(Pet pet) {
		// TODO Auto-generated method stub
		return dao.select_the_pet(pet);
	}

	/*删除某一宠物*/
	@Override
	public void delete_the_pet(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		dao.delete_the_pet(map);
		
	}

	/*据id查询某宠物*/
	@Override
	public Pet the_pet(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.the_pet(map);
	}

	/*宠物更新*/
	@Override
	public void update_the_pet(CommonsMultipartFile file, String realUploadPath, String UploadPath, String newrealpath,
			String pet_category, String pet_type, String pet_name, String pet_price, String pet_number, String pet_age,
			String pet_shape, String pet_food, String pet_purpose, String pet_weight, String pet_sex,
			String pet_marriage, String pet_certificate, String pet_desc,String pet_img_path,
			int id) {
		// TODO Auto-generated method stub
		
		// 删除tomcat下id对应的图片
		File petImgFile = new File(newrealpath + pet_img_path);
		if (petImgFile.exists()) {
			petImgFile.delete();
		}
		
		InputStream is = null;
		OutputStream os = null;		
				
		// 宠物图片上传时间
		Date date = new Date();
		SimpleDateFormat tim = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		String petImgFileTime = tim.format(date);		
				
		try {
			// 宠物图片名称
			String PetImgFileName = file.getOriginalFilename();
			// 宠物图片上传路径
			String newPetImgFilePath = UploadPath + "/" + petImgFileTime + PetImgFileName;
			
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("pet_category", pet_category);
			map.put("pet_type", pet_type);
			map.put("pet_name", pet_name);
			map.put("pet_price", pet_price);
			map.put("pet_number", pet_number);
			map.put("pet_age", pet_age);
			map.put("pet_shape", pet_shape);
			map.put("pet_food", pet_food);
			map.put("pet_purpose", pet_purpose);
			map.put("pet_weight", pet_weight);
			map.put("pet_sex", pet_sex);
			map.put("pet_marriage", pet_marriage);
			map.put("pet_certificate", pet_certificate);
			map.put("pet_desc", pet_desc);
			map.put("pet_img_path", newPetImgFilePath);
			map.put("id", id);
			
			dao.update_the_pet(map);

			String PetImgFilePath = realUploadPath + "/" + petImgFileTime + PetImgFileName;
			
			// 图片通过输入输出流进行上传
			is = file.getInputStream();
			os = new FileOutputStream(PetImgFilePath);

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
