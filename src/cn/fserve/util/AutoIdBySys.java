package cn.fserve.util;

import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AutoIdBySys {
	public static String getAutoId() {
		String date = getDateSystem();
		String num = getRandomNum();
		String ip = getLocalIp();
		return date+num+ip;
	}

	private static String getDateSystem() {
		Date n = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		String date = sdf.format(n);
		return date;
	}

	private static String getRandomNum() {
		Double random = Math.random();
		String str = random.toString().substring(2, 8);
		return str;
	}

	private static String getLocalIp() {
		InetAddress ia = null;
		String localip;
		String newLocalIp = null;
		try {
			ia = InetAddress.getLocalHost();
			localip = ia.getHostAddress();
			newLocalIp = localip.replace(".", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return newLocalIp;
	}
}
