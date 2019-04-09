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

import cn.fserve.dao.AdminUserDao;
import cn.fserve.model.AdminUser;
import cn.fserve.service.AdminUserService;

@Service
public class AdminUserServiceImpl implements AdminUserService {

	@Resource
	private AdminUserDao dao;

	/*后台登陆*/
	@Override
	public AdminUser backstageLoginPost(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.backstageLoginPost(map);
	}

	/*管理员信息*/
	@Override
	public AdminUser show_admin_info(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.show_admin_info(map);
	}

	/*更新管理员头像*/
	@Override
	public void update_admin_head_img(CommonsMultipartFile file, String realUploadPath, 
			String UploadPath, String newrealpath,int id,String head_img_path) {
		
		// 删除tomcat下id对应的图片
		File headImgFile = new File(newrealpath + head_img_path);
		if (headImgFile.exists()) {
			headImgFile.delete();
		}
		
		InputStream is = null;
		OutputStream os = null;
		
		// 图片上传时间
		Date date = new Date();
		SimpleDateFormat tim = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		String headImgFileTime = tim.format(date);
		
		try {
			// 图片名称
			String HeadimgFileName = file.getOriginalFilename();
			// 图片上传路径
			String newHeadimgFilePath = UploadPath + "/" + headImgFileTime + HeadimgFileName;
			
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("id", id);
			map.put("head_img_path", newHeadimgFilePath);

			// 更新图片路径
			dao.update_admin_head_img(map);

			String headImgFilePath = realUploadPath + "/" + headImgFileTime + HeadimgFileName;
			// 图片通过输入输出流进行上传
			is = file.getInputStream();
			os = new FileOutputStream(headImgFilePath);

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

	/*修改管理员密码*/
	@Override
	public void updateAdminUserPassword(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		dao.updateAdminUserPassword(map);
	}

}
