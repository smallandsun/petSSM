package cn.fserve.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import cn.fserve.model.Pet;

@Repository
public interface BackstageAddLifeToolDao {
	
	public void add_the_life_tool(HashMap<String, Object> map);//添加用品
	
}
