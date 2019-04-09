package cn.fserve.model;

public class AdminUser {

	private int id;
	private String ad_username;
	private String ad_password;
	private String head_img_path;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAd_username() {
		return ad_username;
	}

	public void setAd_username(String ad_username) {
		this.ad_username = ad_username;
	}

	public String getAd_password() {
		return ad_password;
	}

	public void setAd_password(String ad_password) {
		this.ad_password = ad_password;
	}

	public String getHead_img_path() {
		return head_img_path;
	}

	public void setHead_img_path(String head_img_path) {
		this.head_img_path = head_img_path;
	}

	@Override
	public String toString() {
		return "AdminUser [id=" + id + ", ad_username=" + ad_username + ", ad_password=" + ad_password
				+ ", head_img_path=" + head_img_path + "]";
	}

	public AdminUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdminUser(int id, String ad_username, String ad_password, String head_img_path) {
		super();
		this.id = id;
		this.ad_username = ad_username;
		this.ad_password = ad_password;
		this.head_img_path = head_img_path;
	}

}
