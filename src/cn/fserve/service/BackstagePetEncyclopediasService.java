package cn.fserve.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import cn.fserve.model.PetEncyclopedias;

public interface BackstagePetEncyclopediasService {
	
	public void add_the_pet_encyclopedias(CommonsMultipartFile file, String realUploadPath, String UploadPath,
			String newrealpath,String pet_category,String pet_type,String pet_desc,String pet_feed_mode,
			String pet_mpg_ch,String pet_life_habits,String pet_matters_attention);//添加宠物百科
	
	public List<PetEncyclopedias> select_pet_type_encyclopedias(String pet_category);//据宠物类别查询宠物类型 

	public PetEncyclopedias select_the_pet_encyclopedias(HashMap<String, Object> map);//查询满足条件的宠物百科

	public void delect_pet_encyclopedias(HashMap<String, Object> map);//删除某一宠物百科

	public PetEncyclopedias select_the_pet_encyclopedias_by_id(HashMap<String, Object> map);//据id查询某宠物百科

	public void update_the_pet_encyclopedias(CommonsMultipartFile file, String realUploadPath, String UploadPath,
			String newrealpath,String pet_category,String pet_type,String pet_desc,String pet_feed_mode,
			String pet_mpg_ch,String pet_life_habits,String pet_matters_attention,int id,String img_path);//宠物百科更新

}
