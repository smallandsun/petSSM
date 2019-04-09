package cn.fserve.util;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class FileUploadUtil {
	/**
	 * @param file
	 * @param request
	 * @return
	 */
	public static HashMap<String,String> fileUpload(CommonsMultipartFile file,HttpServletRequest request){
		InputStream is = null;
		OutputStream os = null;
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String newDate = sdf.format(date);
		String fileName = file.getOriginalFilename();
		String newFileName = new SimpleDateFormat("yyyyMMddHHmmss").format(date)+fileName;
		String uploadFilePath = StaticFinalVar.UPLOAD_PATH+"/"+newFileName;
		
		String realPath = request.getServletContext().getRealPath(StaticFinalVar.UPLOAD_PATH);
		String outPath =realPath+"/"+new SimpleDateFormat("yyyyMMddHHmmss").format(date)+fileName;
		
		HashMap<String,String> map = new HashMap<String, String>();
		map.put("fileName", fileName);
		map.put("uploadFilePath", uploadFilePath);
		map.put("newDate", newDate);
		try {
			is = file.getInputStream();
			os = new FileOutputStream(outPath);
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
		return map;
	}
}
