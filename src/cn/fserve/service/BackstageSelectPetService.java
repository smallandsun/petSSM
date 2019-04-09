package cn.fserve.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import cn.fserve.model.Pet;

public interface BackstageSelectPetService {
	
	public List<Pet> select_type(String pet_category);//据宠物类别查询宠物类型 
	
	public List<Pet> select_the_pet(Pet pet);//查询满足条件的宠物
	
	public Pet the_pet(HashMap<String, Object> map);//据id查询某宠物
	
	public void delete_the_pet(HashMap<String, Object> map);//删除某一宠物
	
	public void update_the_pet(CommonsMultipartFile file, String realUploadPath, String UploadPath,
			String newrealpath,String pet_category,String pet_type,String pet_name,String pet_price,
			String pet_number,String pet_age,String pet_shape,String pet_food,
			String pet_purpose,String pet_weight,String pet_sex,String pet_marriage,
			String pet_certificate,String pet_desc,String pet_img_path,int id);//宠物更新
	
}
