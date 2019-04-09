package cn.fserve.util;

import java.util.Calendar;

public class GetCurrentTermUtil {
	public static String getCurrentTerm(){
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1;
		if(month>=9){
			return year+"-"+(year+1)+"-"+1;
		}else{
			return (year-1)+"-"+year+"-"+2;
		}
	}
}
