package cn.fserve.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public interface BackstageAddPetService {
	
	public void add_the_pet(CommonsMultipartFile file, String realUploadPath, String UploadPath,
			String newrealpath,String pet_category,String pet_type,String pet_name,String pet_price,
			String pet_number,String pet_age,String pet_shape,String pet_food,
			String pet_purpose,String pet_weight,String pet_sex,String pet_marriage,
			String pet_certificate,String pet_desc,String admin_user_id);//添加宠物
	
}
